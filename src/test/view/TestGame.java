
package rockpaperscissors.view;

import org.junit.Test;
import org.mockito.Mockito;

import javax.swing.*;
import javax.swing.border.Border;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.mockito.Matchers.any;


/**
 * Generated Unit Tests
 * 
 */
public class TestGame {


    @Test
    public void testConstructor() {
         
        // Generate the fields
         
        ImageIcon mockima_0 = Mockito.mock(ImageIcon.class);
        JPanel mockjpa_0 = Mockito.mock(JPanel.class);
        JButton mockjbu_0 = Mockito.mock(JButton.class);
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        JLabel mockjla_01 = Mockito.mock(JLabel.class);
        JLabel mockjla_02 = Mockito.mock(JLabel.class);
        JLabel mockjla_03 = Mockito.mock(JLabel.class);
        JLabel mockjla_04 = Mockito.mock(JLabel.class);
        JLabel mockjla_05 = Mockito.mock(JLabel.class);
        JLabel mockjla_06 = Mockito.mock(JLabel.class);
        JLabel mockjla_07 = Mockito.mock(JLabel.class);
        JLabel mockjla_08 = Mockito.mock(JLabel.class);
        JLabel mockjla_09 = Mockito.mock(JLabel.class);
         
        // Invoke the method
         
        Game game = new Game();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testHideChoiceToolbar()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JPanel mockjpa_0 = Mockito.mock(JPanel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("choiceToolbar");
        field.setAccessible(true);
        field.set(game, mockjpa_0);
         
        // Invoke the method
         
        game.hideChoiceToolbar();
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockjpa_0, Mockito.times(1)).setVisible(Mockito.eq(false));
    }

    @Test
    public void testGetPlayer1Name()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("player1Name");
        field.setAccessible(true);
        field.set(game, mockjla_0);
         
        // Invoke the method
         
        JLabel jLabel = game.getPlayer1Name();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetPlayer2Name()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("player2Name");
        field.setAccessible(true);
        field.set(game, mockjla_0);
         
        // Invoke the method
         
        JLabel jLabel = game.getPlayer2Name();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetRock()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("rock");
        field.setAccessible(true);
        field.set(game, mockjla_0);
         
        // Invoke the method
         
        JLabel jLabel = game.getRock();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetPaper()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("paper");
        field.setAccessible(true);
        field.set(game, mockjla_0);
         
        // Invoke the method
         
        JLabel jLabel = game.getPaper();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetScissors()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("scissors");
        field.setAccessible(true);
        field.set(game, mockjla_0);
         
        // Invoke the method
         
        JLabel jLabel = game.getScissors();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetNextGameButton()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JButton mockjbu_0 = Mockito.mock(JButton.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("nextGameButton");
        field.setAccessible(true);
        field.set(game, mockjbu_0);
         
        // Invoke the method
         
        JButton jButton = game.getNextGameButton();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetTimer()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("timer");
        field.setAccessible(true);
        field.set(game, mockjla_0);
         
        // Invoke the method
         
        JLabel jLabel = game.getTimer();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetPlayer2Choice()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("player2Choice");
        field.setAccessible(true);
        field.set(game, mockjla_0);
         
        // Invoke the method
         
        JLabel jLabel = game.getPlayer2Choice();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetPlayer1Choice()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("player1Choice");
        field.setAccessible(true);
        field.set(game, mockjla_0);
         
        // Invoke the method
         
        JLabel jLabel = game.getPlayer1Choice();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetPlayer1Wins()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("player1Wins");
        field.setAccessible(true);
        field.set(game, mockjla_0);
         
        // Invoke the method
         
        JLabel jLabel = game.getPlayer1Wins();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetPlayer2Wins()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("player2Wins");
        field.setAccessible(true);
        field.set(game, mockjla_0);
         
        // Invoke the method
         
        JLabel jLabel = game.getPlayer2Wins();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testResetPlayerChoices()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        ImageIcon mockima_0 = Mockito.mock(ImageIcon.class);
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        JLabel mockjla_01 = Mockito.mock(JLabel.class);
        JLabel mockjla_02 = Mockito.mock(JLabel.class);
        JLabel mockjla_03 = Mockito.mock(JLabel.class);
        JLabel mockjla_04 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("IMAGE_LOADING");
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, (field.getModifiers()&(~Modifier.FINAL)));
        field.set(game, mockima_0);
        Field field1 = game.getClass().getDeclaredField("paper");
        field1 .setAccessible(true);
        field1 .set(game, mockjla_0);
        Field field2 = game.getClass().getDeclaredField("player1Choice");
        field2 .setAccessible(true);
        field2 .set(game, mockjla_01);
        Field field3 = game.getClass().getDeclaredField("player2Choice");
        field3 .setAccessible(true);
        field3 .set(game, mockjla_02);
        Field field4 = game.getClass().getDeclaredField("rock");
        field4 .setAccessible(true);
        field4 .set(game, mockjla_03);
        Field field5 = game.getClass().getDeclaredField("scissors");
        field5 .setAccessible(true);
        field5 .set(game, mockjla_04);
         
        // Invoke the method
         
        game.resetPlayerChoices();
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockjla_0, Mockito.times(1)).setBorder(any(Border.class));
        Mockito.verify(mockjla_01, Mockito.times(1)).setIcon(any(ImageIcon.class));
        Mockito.verify(mockjla_02, Mockito.times(1)).setIcon(any(ImageIcon.class));
        Mockito.verify(mockjla_03, Mockito.times(1)).setBorder(any(Border.class));
        Mockito.verify(mockjla_04, Mockito.times(1)).setBorder(any(Border.class));
    }

    @Test
    public void testResetChoiceBorders()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        JLabel mockjla_01 = Mockito.mock(JLabel.class);
        JLabel mockjla_02 = Mockito.mock(JLabel.class);
        Game game = new Game();
        Field field = game.getClass().getDeclaredField("paper");
        field.setAccessible(true);
        field.set(game, mockjla_0);
        Field field1 = game.getClass().getDeclaredField("rock");
        field1 .setAccessible(true);
        field1 .set(game, mockjla_01);
        Field field2 = game.getClass().getDeclaredField("scissors");
        field2 .setAccessible(true);
        field2 .set(game, mockjla_02);
         
        // Invoke the method
         
        game.resetChoiceBorders();
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockjla_0, Mockito.times(1)).setBorder(any(Border.class));
        Mockito.verify(mockjla_01, Mockito.times(1)).setBorder(any(Border.class));
        Mockito.verify(mockjla_02, Mockito.times(1)).setBorder(any(Border.class));
    }

}
