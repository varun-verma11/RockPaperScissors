package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import view.WelcomeScreen;

public class WelcomeScreenController
{
    public WelcomeScreenController(WelcomeScreen view)
    {
        addEventListenersToButtons(view);
    }

    private void addEventListenersToButtons(WelcomeScreen view)
    {
        view.getHumanVsComp().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }
        });

        view.getDifferentGameEachTime().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }
        });

        view.getCompVsComp().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }
        });
    }
}
