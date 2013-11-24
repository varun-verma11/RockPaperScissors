package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.SHAPES;

@SuppressWarnings("serial")
public class Game extends JFrame
{
    private static final ImageIcon IMAGE_LOADING = new ImageIcon(SHAPES.class
            .getResource("loading.jpg"));
    private JLabel timer;
    private JLabel player1Choice;
    private JLabel player2Choice;
    private JLabel rock;
    private JLabel paper;
    private JLabel scissors;
    private JLabel player1Name;
    private JLabel player2Name;
    private JLabel player1Wins;
    private JLabel player2Wins;
    private JButton nextGameButton;
    private JPanel choiceToolbar;

    public Game()
    {
        super("RockPaperScissors!!");
        this.setSize(800, 600);
        initialiseFields();
        nextGameButton.setVisible(false);
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
        choiceToolbar = new JPanel();
        choiceToolbar.setLayout(new BorderLayout());
        choiceToolbar.add(new JLabel("Please select your move."), BorderLayout.NORTH);
        JPanel panelTemp = new JPanel();
        panelTemp.setLayout(new GridLayout(1, 3));
        panelTemp.add(rock);
        panelTemp.add(paper);
        panelTemp.add(scissors);
        choiceToolbar.add(panelTemp, BorderLayout.CENTER);
        choiceToolbar.add(nextGameButton, BorderLayout.SOUTH);
        return choiceToolbar;
    }

    private Component getHeader()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Play Rock Paper Scissors!!!"), BorderLayout.CENTER);
        panel.add(timer, BorderLayout.EAST);
        timer.setFont(new Font("Serif", Font.PLAIN, 40));

        JPanel winsPanel = new JPanel();
        winsPanel.setLayout(new GridLayout(2, 2));
        winsPanel.add(player1Name);
        winsPanel.add(player2Name);
        winsPanel.add(player1Wins);
        winsPanel.add(player2Wins);

        panel.add(winsPanel, BorderLayout.SOUTH);
        return panel;
    }

    private void initialiseFields()
    {
        timer = new JLabel("Timer");
        player1Choice = new JLabel(IMAGE_LOADING);
        player2Choice = new JLabel(IMAGE_LOADING);
        player1Wins = new JLabel("0");
        player2Wins = new JLabel("0");
        player1Name = new JLabel();
        player2Name = new JLabel();
        rock = new JLabel(SHAPES.ROCK.getImage());
        paper = new JLabel(SHAPES.PAPER.getImage());
        scissors = new JLabel(SHAPES.SCISSORS.getImage());
        nextGameButton = new JButton("Next Game");
    }

    public void resetPlayerChoices()
    {
        player1Choice.setIcon(IMAGE_LOADING);
        player2Choice.setIcon(IMAGE_LOADING);
        resetChoiceBorders();
    }

    public void resetChoiceBorders()
    {
        rock.setBorder(null);
        paper.setBorder(null);
        scissors.setBorder(null);
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

    public JLabel getPlayer2Choice()
    {
        return player2Choice;
    }

    public JLabel getPlayer1Name()
    {
        return player1Name;
    }

    public JLabel getPlayer2Name()
    {
        return player2Name;
    }

    public JLabel getPlayer1Wins()
    {
        return player1Wins;
    }

    public JLabel getPlayer2Wins()
    {
        return player2Wins;
    }

    public JButton getNextGameButton()
    {
        return nextGameButton;
    }

    public void hideChoiceToolbar()
    {
        choiceToolbar.setVisible(false);
    }

}
