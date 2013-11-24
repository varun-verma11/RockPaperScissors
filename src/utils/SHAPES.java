package utils;

import javax.swing.ImageIcon;

/**
 * This is the enum for the different shapes in the game. Each is associated
 * with an image file
 * 
 * @author Varun Verma
 * 
 */
public enum SHAPES
{
    ROCK("rock2.png"), PAPER("paper2.png"), SCISSORS("scissors2.png");

    private ImageIcon image = null;

    SHAPES(String filepath)
    {
        image = new ImageIcon(this.getClass().getResource(filepath));
    }

    /**
     * This method is used to get the image for the current shape
     * 
     * @return: returns the shape
     */
    public ImageIcon getImage()
    {
        return image;
    }
}
