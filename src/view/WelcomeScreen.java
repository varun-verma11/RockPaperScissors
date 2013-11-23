package view;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WelcomeScreen extends JFrame
{
    private JPanel header;
    private JButton compVsComp;
    private JButton humanVsComp;
    private JButton differentGameEachTime;

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

    public WelcomeScreen()
    {
        super("RockPaperScissors!!!");
        this.setSize(800, 600);
        addPlayOptions(this.getContentPane());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

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

    private void initButtons()
    {
        header = new JPanel();
        compVsComp = new JButton("Computer Vs Computer");
        humanVsComp = new JButton("Human Vs Computer");
        differentGameEachTime = new JButton("Random Game Each Time");
    }
}
