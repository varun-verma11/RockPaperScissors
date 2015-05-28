package rockpaperscissors.controller;

import rockpaperscissors.model.Player;
import rockpaperscissors.view.Game;
import rockpaperscissors.view.WelcomeScreen;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * This class is the controller for the main welcome screen
 * 
 * @author Varun Verma
 * 
 */
public class WelcomeScreenController
{
    private final WelcomeScreen view;

    /**
     * This is a constructor for the Welcome Screen.
     * 
     * @param view
     *            : specifies the view for this controller
     */
    public WelcomeScreenController(WelcomeScreen view)
    {
        this.view = view;
        addEventListenersToButtons();
    }

    /**
     * This method add the mouse listeners to the buttons for the welcome screen
     * to intialise the game accordingly
     */
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
