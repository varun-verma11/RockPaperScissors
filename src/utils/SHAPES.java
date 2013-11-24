package utils;

import javax.swing.ImageIcon;

public enum SHAPES
{
    ROCK("rock2.png"), PAPER("paper2.png"), SCISSORS("scissors2.png");

    private ImageIcon image = null;

    SHAPES(String filepath)
    {
        image = new ImageIcon(this.getClass().getResource(filepath));
    }

    public ImageIcon getImage()
    {
        return image;
    }
}
