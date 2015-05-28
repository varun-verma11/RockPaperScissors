package rockpaperscissors.view;

import rockpaperscissors.utils.SHAPES;

import javax.swing.*;
import java.awt.*;

/**
 * This class is the view for the rock-paper-scissors game
 *
 * @author Varun Verma
 */
@SuppressWarnings("serial")
public class Game extends JFrame {
    private static final ImageIcon IMAGE_LOADING = new ImageIcon(SHAPES.class
            .getResource("/loading.jpg"));
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

    /**
     * This constructor build the gui and initialises the default fields
     */
    public Game() {
        super("RockPaperScissors!!");
        this.setSize(800, 600);
        initialiseFields();
        nextGameButton.setVisible(false);
        initialiseDisplay(this.getContentPane());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    /**
     * This method is used to add all components for the view to the given pane.
     *
     * @param pane : specifies the content pane to add all the components
     */
    private void initialiseDisplay(Container pane) {
        pane.setLayout(new BorderLayout());
        pane.add(getHeader(), BorderLayout.NORTH);
        pane.add(getMainBody(), BorderLayout.CENTER);
        pane.add(getChoiceToolbar(), BorderLayout.SOUTH);
    }

    /**
     * This method is used to return the main body of the display
     *
     * @return
     */
    private Component getMainBody() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(player1Choice);
        panel.add(player2Choice);
        return panel;
    }

    /**
     * This method builds the choice toolbar to allow the player to choose a
     * move
     *
     * @return : returns a panel with the choices as images.
     */
    private Component getChoiceToolbar() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        choiceToolbar = new JPanel();
        choiceToolbar.setLayout(new BorderLayout());
        choiceToolbar.add(new JLabel("Please select your move."), BorderLayout.NORTH);
        JPanel choices = new JPanel();
        choices.setLayout(new GridLayout(1, 3));
        choices.add(rock);
        choices.add(paper);
        choices.add(scissors);
        choiceToolbar.add(choices, BorderLayout.CENTER);
        panel.add(choiceToolbar, BorderLayout.CENTER);
        panel.add(nextGameButton, BorderLayout.SOUTH);
        return panel;
    }

    /**
     * This method is used to build the main header for the display
     *
     * @return : returns a panel with title, and label for timers ,and names of
     * each players with there scores
     */
    private Component getHeader() {
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

    /**
     * This method is used to initialise all the fields for this class.
     */
    private void initialiseFields() {
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

    /**
     * This method resets the choices of the player, uses a black box to display
     * no choice.
     */
    public void resetPlayerChoices() {
        player1Choice.setIcon(IMAGE_LOADING);
        player2Choice.setIcon(IMAGE_LOADING);
        resetChoiceBorders();
    }

    /**
     * This method is used to reset the border of each of the choices presented
     * to the user
     */
    public void resetChoiceBorders() {
        rock.setBorder(null);
        paper.setBorder(null);
        scissors.setBorder(null);
    }

    public JLabel getTimer() {
        return timer;
    }

    public JLabel getRock() {
        return rock;
    }

    public JLabel getPaper() {
        return paper;
    }

    public JLabel getScissors() {
        return scissors;
    }

    public JLabel getPlayer1Choice() {
        return player1Choice;
    }

    public JLabel getPlayer2Choice() {
        return player2Choice;
    }

    public JLabel getPlayer1Name() {
        return player1Name;
    }

    public JLabel getPlayer2Name() {
        return player2Name;
    }

    public JLabel getPlayer1Wins() {
        return player1Wins;
    }

    public JLabel getPlayer2Wins() {
        return player2Wins;
    }

    public JButton getNextGameButton() {
        return nextGameButton;
    }

    /**
     * This method is used to hide the options for user to enter the move
     */
    public void hideChoiceToolbar() {
        choiceToolbar.setVisible(false);
    }

    /**
     * This method is used to show the choices for user to enter the move.
     */
    public void showChoiceToolbar() {
        choiceToolbar.setVisible(true);
    }
}
