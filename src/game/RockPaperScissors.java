package game;

import view.WelcomeScreen;
import controller.WelcomeScreenController;

public class RockPaperScissors
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        new WelcomeScreenController(new WelcomeScreen());
    }

}
