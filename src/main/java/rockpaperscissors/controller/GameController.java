package rockpaperscissors.controller;

import rockpaperscissors.model.AIRandomMoveGenerator;
import rockpaperscissors.model.Player;
import rockpaperscissors.utils.GameResult;
import rockpaperscissors.utils.SHAPES;
import rockpaperscissors.view.Game;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * This is the controller class for the Rock Scissors Paper game.
 * 
 * @author Varun Verma
 * 
 */
public class GameController
{

    private static final Border CHOICE_BORDER = BorderFactory.createMatteBorder(2, 2, 2, 2,
            Color.GREEN);
    private static final SHAPES DEFAULT_MOVE = SHAPES.ROCK;
    private final int TIME_TO_PLAY = 3;
    private final Player player1;
    private final Player player2;
    private int countDown = TIME_TO_PLAY;
    private final Game view;
    private boolean bothAI;
    private final boolean randomGameEachTime;
    private Timer timer;
    private int player1Wins = 0;
    private int player2Wins = 0;
    private AIRandomMoveGenerator aiMoveGenerator = new AIRandomMoveGenerator();
    private Random randomGame = new Random();

    /**
     * This constructor is used to initialise the game controller for a game
     * with both players being computer.
     * 
     * @param view
     *            : specifies the view with which the controller is used
     */
    public GameController(Game view)
    {
        this.view = view;
        this.player1 = new Player("Computer");
        this.player2 = new Player("Computer2");
        this.randomGameEachTime = false;
        this.bothAI = true;
        view.hideChoiceToolbar();
        displayNames();
        addEventListeners();
    }

    /**
     * This constructor is used to initialise a game with possibly one player
     * being human
     * 
     * @param view
     *            : specifies the view with which this controller is used
     * @param player1
     *            : specifies the first player
     * @param randomGameEachTime
     *            : specifies if the third option for the type of game, i.e.
     *            true iff games are supposed to be random and false otherwise
     */
    public GameController(Game view, Player player1, boolean randomGameEachTime)
    {
        this.randomGameEachTime = randomGameEachTime;
        this.view = view;
        this.player1 = player1;
        this.player2 = new Player("Computer");
        player1.setMove(DEFAULT_MOVE);
        displayNames();
        addEventListeners();
    }

    /**
     * This is used to display the names from the model in the view
     */
    private void displayNames()
    {
        view.getPlayer1Name().setText(player1.getName());
        view.getPlayer2Name().setText(player2.getName());
    }

    /**
     * Adds the event listeners to for mouse clicks and a timer for the game
     */
    private void addEventListeners()
    {
        addListenersToChoiceToolbar();
        addTimer();
    }

    /**
     * Adds a timer to the game, with frequency being 1 second.
     */
    private void addTimer()
    {
        ActionListener listener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent evt)
            {
                view.getTimer().setText(countDown + "");
                if (countDown == 0)
                {
                    timer.stop();
                    displayPlayersMove();
                    checkForWin();
                    view.getNextGameButton().setVisible(true);
                    return;
                }
                countDown--;
            }
        };
        timer = new Timer(1000, listener);
        timer.start();
    }

    /**
     * this method is used to update the images for the move selected by both of
     * the players
     */
    private void displayPlayersMove()
    {
        player2.setMove(aiMoveGenerator.generateMove());
        view.getPlayer2Choice().setIcon(player2.getMove().getImage());
        if (bothAI)
            player1.setMove(aiMoveGenerator.generateMove());
        view.getPlayer1Choice().setIcon(player1.getMove().getImage());

    }

    /**
     * This method is used to analyse the end of the game, and check which
     * player won or if the game was draw and update the scores accordingly
     */
    private void checkForWin()
    {
        GameResult player1Result = didPlayer1Won(player1.getMove(), player2.getMove());
        if (player1Result == GameResult.WIN)
            player1Wins++;
        else if (player1Result == GameResult.LOSE)
            player2Wins++;
        updateWins();
    }

    /**
     * This method updates the number of wins for both of the users in the view
     */
    private void updateWins()
    {
        view.getPlayer1Wins().setText(player1Wins + "");
        view.getPlayer2Wins().setText(player2Wins + "");
    }

    /**
     * This method is used to find the result of the game from perspective of
     * player 1
     * 
     * @param player1Move
     *            : specifies the move by player 1
     * @param player2Move
     *            : specifies the move by player 2
     * @return : returns a value, either WON, DRAW, or LOSE accordingly
     */
    private GameResult didPlayer1Won(SHAPES player1Move, SHAPES player2Move)
    {
        if (player1Move == player2Move)
            return GameResult.DRAW;
        switch (player1Move)
        {
            case ROCK:
                if (player2Move == SHAPES.SCISSORS)
                    return GameResult.WIN;
                break;
            case SCISSORS:
                if (player2Move == SHAPES.PAPER)
                    return GameResult.WIN;
                break;
            case PAPER:
                if (player2Move == SHAPES.ROCK)
                    return GameResult.WIN;
                break;
        }
        return GameResult.LOSE;
    }

    /**
     * This method is used to reset the values of the game to restart the next
     * game
     */
    private void restartGame()
    {
        countDown = TIME_TO_PLAY;
        player1.setMove(DEFAULT_MOVE);
        player2.setMove(DEFAULT_MOVE);
        view.resetPlayerChoices();
        view.getRock().setBorder(CHOICE_BORDER);
        if (randomGameEachTime)
            bothAI = randomGame.nextInt(2) == 1;
        if (bothAI)
            view.hideChoiceToolbar();
        else
            view.showChoiceToolbar();
        timer.start();
    }

    /**
     * This method is used to add listeners to the toolbar which allows the
     * first player to select the move
     */
    private void addListenersToChoiceToolbar()
    {
        view.getRock().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                view.resetChoiceBorders();
                player1.setMove(SHAPES.ROCK);
                view.getRock().setBorder(CHOICE_BORDER);
            }
        });

        view.getPaper().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                view.resetChoiceBorders();
                player1.setMove(SHAPES.PAPER);
                view.getPaper().setBorder(CHOICE_BORDER);
            }
        });

        view.getScissors().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                view.resetChoiceBorders();
                player1.setMove(SHAPES.SCISSORS);
                view.getScissors().setBorder(CHOICE_BORDER);
            }
        });

        view.getNextGameButton().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                restartGame();
                view.getNextGameButton().setVisible(false);
            }
        });
    }
}
