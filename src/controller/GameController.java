package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Timer;

import model.Player;
import utils.SHAPES;
import view.Game;

public class GameController
{
    private final int TIME_TO_PLAY = 3;
    private final Player player1;
    private final Player player2;
    private int countDown = TIME_TO_PLAY;
    private Timer timer;
    private int player1Wins = 0;
    private int player2Wins = 0;

    public GameController(Game view, Player player1, Player player2)
    {
        this.player1 = player1;
        this.player2 = player2;
        addEventListeners(view);
    }

    private void addEventListeners(Game view)
    {
        addListenersToChoiceToolbar(view);
        addTimer(view);
    }

    private void addTimer(final Game view)
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
                    countDown = TIME_TO_PLAY;
                    checkForWin();
                    return;
                }
                countDown--;
            }
        };
        timer = new Timer(1000, listener);
        timer.start();

    }

    private void checkForWin()
    {
        didPlayer1Won(player1.getMove(), player2.getMove());
    }

    private boolean didPlayer1Won(SHAPES player1Move, SHAPES player2Move)
    {
        switch (player1Move)
        {
            case ROCK:
                if (player2Move == SHAPES.SCISSORS)
                    return true;
                break;
            case SCISSORS:
                if (player2Move == SHAPES.PAPER)
                    return true;
                break;
            case PAPER:
                if (player2Move == SHAPES.ROCK)
                    return true;
                break;
        }
        return false;
    }

    private void addListenersToChoiceToolbar(final Game view)
    {
        view.getRock().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                player1.setMove(SHAPES.ROCK);
                view.getPlayer1Choice().setIcon(player1.getMove().getImage());
            }
        });

        view.getPaper().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                player1.setMove(SHAPES.PAPER);
                view.getPlayer1Choice().setIcon(player1.getMove().getImage());
            }
        });

        view.getScissors().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                player1.setMove(SHAPES.SCISSORS);
                view.getPlayer1Choice().setIcon(player1.getMove().getImage());
            }
        });
    }
}
