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
    private ImageIcon player1Choice;
    private ImageIcon player2Choice;
    private ImageIcon rock;
    private ImageIcon paper;
    private ImageIcon scissors;

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
    }

    private Component getMainBody()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(getPlayer1View());
        panel.add(getPlayer2View());
        return panel;
    }

    private Component getPlayer2View()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel(player2Choice), BorderLayout.CENTER);
        panel.add(new JPanel(), BorderLayout.SOUTH);
        return panel;
    }

    private Component getPlayer1View()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel(player1Choice), BorderLayout.CENTER);
        panel.add(getChoiceToolbar(), BorderLayout.SOUTH);
        return panel;
    }

    private Component getChoiceToolbar()
    {
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(1, 3));
        panel.add(new JLabel(rock));
        panel.add(new JLabel(paper));
        panel.add(new JLabel(scissors));
        return panel;
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
        player1Choice = new ImageIcon(SHAPES.class.getResource(IMAGE_LOADING));
        player2Choice = new ImageIcon(SHAPES.class.getResource(IMAGE_LOADING));
        rock = SHAPES.ROCK.getImage();
        paper = SHAPES.PAPER.getImage();
        scissors = SHAPES.SCISSORS.getImage();
    }
}
