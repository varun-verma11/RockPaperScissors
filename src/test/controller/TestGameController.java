
package rockpaperscissors.controller;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import rockpaperscissors.model.Player;
import rockpaperscissors.view.Game;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.lang.reflect.Field;


/**
 * Generated Unit Tests
 */
public class TestGameController {


    @Test
    public void testConstructor()
            throws IllegalAccessException, NoSuchFieldException {

        // Generate the arguments

        Game mockview = Mockito.mock(Game.class);
        JLabel mockjla_0 = Mockito.mock(JLabel.class);
        Mockito.when(mockview.getPlayer1Name()).thenReturn(mockjla_0);
        JLabel mockjla_01 = Mockito.mock(JLabel.class);
        Mockito.when(mockview.getPlayer2Name()).thenReturn(mockjla_01);
        JLabel mockjla_02 = Mockito.mock(JLabel.class);
        Mockito.when(mockview.getRock()).thenReturn(mockjla_02);
        JLabel mockjla_03 = Mockito.mock(JLabel.class);
        Mockito.when(mockview.getPaper()).thenReturn(mockjla_03);
        JLabel mockjla_04 = Mockito.mock(JLabel.class);
        Mockito.when(mockview.getScissors()).thenReturn(mockjla_04);
        JButton mockjbu_0 = Mockito.mock(JButton.class);
        Mockito.when(mockview.getNextGameButton()).thenReturn(mockjbu_0);

        // Generate the fields

        Player mockPlayer = Mockito.mock(Player.class);
        Player mockPlayer1 = Mockito.mock(Player.class);
        Timer mockTimer = Mockito.mock(Timer.class);
        Game mockview1 = Mockito.mock(Game.class);

        // Invoke the method

        GameController gameController = new GameController(mockview);

        // Assert the fields are what we expect

        Field field = gameController.getClass().getDeclaredField("TIME_TO_PLAY");
        field.setAccessible(true);
        int tIME_TO_PLAY = ((int) field.get(gameController));
        Assert.assertEquals(3, tIME_TO_PLAY);
        Field field1 = gameController.getClass().getDeclaredField("bothAI");
        field1.setAccessible(true);
        boolean bothAI = ((boolean) field1.get(gameController));
        Assert.assertEquals(true, bothAI);
        Field field2 = gameController.getClass().getDeclaredField("countDown");
        field2.setAccessible(true);
        int countDown = ((int) field2.get(gameController));
        Assert.assertEquals(3, countDown);
        Field field3 = gameController.getClass().getDeclaredField("player1Wins");
        field3.setAccessible(true);
        int player1Wins = ((int) field3.get(gameController));
        Assert.assertEquals(0, player1Wins);
        Field field4 = gameController.getClass().getDeclaredField("player2Wins");
        field4.setAccessible(true);
        int player2Wins = ((int) field4.get(gameController));
        Assert.assertEquals(0, player2Wins);
        Field field5 = gameController.getClass().getDeclaredField("randomGameEachTime");
        field5.setAccessible(true);
        boolean randomGameEachTime = ((boolean) field5.get(gameController));
        Assert.assertEquals(false, randomGameEachTime);
        Field field6 = gameController.getClass().getDeclaredField("view");
        field6.setAccessible(true);
        Game view = ((Game) field6.get(gameController));
        Assert.assertEquals(mockview, view);

        // Assert that our method interactions are what we expect.

        Mockito.verify(mockjla_0, Mockito.times(1)).setText(Mockito.eq("Computer"));
        Mockito.verify(mockjla_01, Mockito.times(1)).setText(Mockito.eq("Computer2"));
        Mockito.verify(mockjla_02, Mockito.times(1)).addMouseListener(Mockito.any(MouseAdapter.class));
        Mockito.verify(mockjla_03, Mockito.times(1)).addMouseListener(Mockito.any(MouseAdapter.class));
        Mockito.verify(mockjla_04, Mockito.times(1)).addMouseListener(Mockito.any(MouseAdapter.class));
        Mockito.verify(mockjbu_0, Mockito.times(1)).addMouseListener(Mockito.any(MouseAdapter.class));
        Mockito.verify(mockview, Mockito.times(1)).hideChoiceToolbar();
        Mockito.verify(mockview, Mockito.times(1)).getPlayer1Name();
        Mockito.verify(mockview, Mockito.times(1)).getPlayer2Name();
        Mockito.verify(mockview, Mockito.times(1)).getRock();
        Mockito.verify(mockview, Mockito.times(1)).getPaper();
        Mockito.verify(mockview, Mockito.times(1)).getScissors();
        Mockito.verify(mockview, Mockito.times(1)).getNextGameButton();
    }

}
