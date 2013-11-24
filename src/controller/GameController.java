package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Timer;
import javax.swing.border.Border;

import model.AIRandomMoveGenerator;
import model.Player;
import utils.GameResult;
import utils.SHAPES;
import view.Game;

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

    public GameController(Game view, Player player1, boolean randomGameEachTime)
    {
        this.randomGameEachTime = randomGameEachTime;
        this.view = view;
        this.player1 = player1;
        this.player2 = new Player("Computer");
        displayNames();
        addEventListeners();
    }

    private void displayNames()
    {
        view.getPlayer1Name().setText(player1.getName());
        view.getPlayer2Name().setText(player2.getName());
    }

    private void addEventListeners()
    {
        addListenersToChoiceToolbar();
        addTimer();
    }

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

    private void displayPlayersMove()
    {
        player2.setMove(aiMoveGenerator.generateMove());
        view.getPlayer2Choice().setIcon(player2.getMove().getImage());
        if (bothAI)
            player1.setMove(aiMoveGenerator.generateMove());
        view.getPlayer1Choice().setIcon(player1.getMove().getImage());

    }

    private void checkForWin()
    {
        GameResult player1Result = didPlayer1Won(player1.getMove(), player2.getMove());
        if (player1Result == GameResult.WIN)
            player1Wins++;
        else if (player1Result == GameResult.LOSE)
            player2Wins++;
        updateWins();
    }

    private void updateWins()
    {
        view.getPlayer1Wins().setText(player1Wins + "");
        view.getPlayer2Wins().setText(player2Wins + "");
    }

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

    private void restartGame()
    {
        countDown = TIME_TO_PLAY;
        player1.setMove(DEFAULT_MOVE);
        player2.setMove(DEFAULT_MOVE);
        view.resetPlayerChoices();
        view.getRock().setBorder(CHOICE_BORDER);
        if (bothAI)
            view.hideChoiceToolbar();
        timer.start();
    }

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
                // view.getPlayer1Choice().setIcon(player1.getMove().getImage());
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
