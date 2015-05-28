package rockpaperscissors.view;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This is a view for the welcome screen which provides people with 3 options
 * 
 * @author Varun Verma
 * 
 */
@SuppressWarnings("serial")
public class WelcomeScreen extends JFrame
{
    private JPanel header;
    private JButton compVsComp;
    private JButton humanVsComp;
    private JButton differentGameEachTime;

    public WelcomeScreen()
    {
        super("RockPaperScissors!!!");
        this.setSize(800, 600);
        addPlayOptions(this.getContentPane());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    /**
     * This method adds the button to the frame for each of the options
     * 
     * @param pane
     *            : specifies the pane to add the buttons
     */
    private void addPlayOptions(final Container pane)
    {
        initButtons();
        header.setLayout(new GridLayout(4, 1));
        header.add(new JLabel("Please select a play option!!!"));
        header.add(compVsComp);
        header.add(humanVsComp);
        header.add(differentGameEachTime);
        pane.add(header);
    }

    /**
     * This method initialises the buttons for each option
     */
    private void initButtons()
    {
        header = new JPanel();
        compVsComp = new JButton("Computer Vs Computer");
        humanVsComp = new JButton("Human Vs Computer");
        differentGameEachTime = new JButton("Random Game Each Time");
    }

    public JButton getCompVsComp()
    {
        return compVsComp;
    }

    public JButton getHumanVsComp()
    {
        return humanVsComp;
    }

    public JButton getDifferentGameEachTime()
    {
        return differentGameEachTime;
    }
}
