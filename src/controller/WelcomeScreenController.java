package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import model.Player;
import view.Game;
import view.WelcomeScreen;

public class WelcomeScreenController
{
    private final WelcomeScreen view;

    public WelcomeScreenController(WelcomeScreen view)
    {
        this.view = view;
        addEventListenersToButtons();
    }

    private void addEventListenersToButtons()
    {
        view.getHumanVsComp().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                view.setVisible(false);
                String name = JOptionPane.showInputDialog(view, "Please enter your name", "Name",
                        JOptionPane.PLAIN_MESSAGE);
                new GameController(new Game(), new Player(name), false);
            }
        });

        view.getDifferentGameEachTime().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                view.setVisible(false);
                String name = JOptionPane.showInputDialog(view, "Please enter your name", "Name",
                        JOptionPane.PLAIN_MESSAGE);
                new GameController(new Game(), new Player(name), true);
            }
        });

        view.getCompVsComp().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                view.setVisible(false);
                new GameController(new Game());
            }
        });
    }
}
