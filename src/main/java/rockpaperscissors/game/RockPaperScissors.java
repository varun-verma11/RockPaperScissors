package rockpaperscissors.game;

import rockpaperscissors.view.WelcomeScreen;
import rockpaperscissors.controller.WelcomeScreenController;

public class RockPaperScissors
{

    /**
     * This is the main entry point for the program.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        new WelcomeScreenController(new WelcomeScreen());
    }

}
