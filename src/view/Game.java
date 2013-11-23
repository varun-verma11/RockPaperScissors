package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.SHAPES;

@SuppressWarnings("serial")
public class Game extends JFrame
{
    private static final String IMAGE_LOADING = "loading.jpg";
    private JLabel timer;
    private JLabel player1Choice;
    private JLabel player2Choice;
    private JLabel rock;
    private JLabel paper;
    private JLabel scissors;

    public Game()
    {
        super("RockPaperScissors!!");
        this.setSize(800, 600);
        initialiseFields();
        initialiseDisplay(this.getContentPane());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    private void initialiseDisplay(Container pane)
    {
        pane.setLayout(new BorderLayout());
        pane.add(getHeader(), BorderLayout.NORTH);
        pane.add(getMainBody(), BorderLayout.CENTER);
        pane.add(getChoiceToolbar(), BorderLayout.SOUTH);
    }

    private Component getMainBody()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(player1Choice);
        panel.add(player2Choice);
        return panel;
    }

    private Component getChoiceToolbar()
    {
        JPanel choiceToolbar = new JPanel();
        choiceToolbar.setLayout(new BorderLayout());
        choiceToolbar.add(new JLabel("Please select your move."), BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));
        panel.add(rock);
        panel.add(paper);
        panel.add(scissors);
        choiceToolbar.add(panel, BorderLayout.CENTER);
        return choiceToolbar;
    }

    private Component getHeader()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Play Rock Paper Scissors!!! "), BorderLayout.CENTER);
        panel.add(timer, BorderLayout.EAST);
        return panel;
    }

    private void initialiseFields()
    {
        timer = new JLabel("Timer");
        player1Choice = new JLabel(new ImageIcon(SHAPES.class.getResource(IMAGE_LOADING)));
        player2Choice = new JLabel(new ImageIcon(SHAPES.class.getResource(IMAGE_LOADING)));
        rock = new JLabel(SHAPES.ROCK.getImage());
        paper = new JLabel(SHAPES.PAPER.getImage());
        scissors = new JLabel(SHAPES.SCISSORS.getImage());
    }

    public JLabel getTimer()
    {
        return timer;
    }

    public JLabel getRock()
    {
        return rock;
    }

    public JLabel getPaper()
    {
        return paper;
    }

    public JLabel getScissors()
    {
        return scissors;
    }

    public JLabel getPlayer1Choice()
    {
        return player1Choice;
    }

    public void setPlayer1Choice(JLabel player1Choice)
    {
        this.player1Choice = player1Choice;
    }

}
