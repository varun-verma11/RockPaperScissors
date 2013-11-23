package utils;

import javax.swing.ImageIcon;

public enum SHAPES
{

    ROCK("rock.png"), PAPER("paper.png"), SCISSORS("scissors.png");

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
