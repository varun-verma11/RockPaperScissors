
package rockpaperscissors.controller;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import rockpaperscissors.view.WelcomeScreen;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.lang.reflect.Field;


/**
 * Generated Unit Tests
 */
public class TestWelcomeScreenController {


    @Test
    public void testConstructor()
            throws IllegalAccessException, NoSuchFieldException {

        // Generate the arguments

        WelcomeScreen mockview = Mockito.mock(WelcomeScreen.class);
        JButton mockjbu_0 = Mockito.mock(JButton.class);
        Mockito.when(mockview.getHumanVsComp()).thenReturn(mockjbu_0);
        JButton mockjbu_01 = Mockito.mock(JButton.class);
        Mockito.when(mockview.getDifferentGameEachTime()).thenReturn(mockjbu_01);
        JButton mockjbu_02 = Mockito.mock(JButton.class);
        Mockito.when(mockview.getCompVsComp()).thenReturn(mockjbu_02);

        // Generate the fields

        WelcomeScreen mockview1 = Mockito.mock(WelcomeScreen.class);

        // Invoke the method

        WelcomeScreenController welcomeScreenController = new WelcomeScreenController(mockview);

        // Assert the fields are what we expect

        Field field = welcomeScreenController.getClass().getDeclaredField("view");
        field.setAccessible(true);
        WelcomeScreen view = ((WelcomeScreen) field.get(welcomeScreenController));
        Assert.assertEquals(mockview, view);

        // Assert that our method interactions are what we expect.

        Mockito.verify(mockjbu_0, Mockito.times(1)).addMouseListener(Mockito.any(MouseAdapter.class));
        Mockito.verify(mockjbu_01, Mockito.times(1)).addMouseListener(Mockito.any(MouseAdapter.class));
        Mockito.verify(mockjbu_02, Mockito.times(1)).addMouseListener(Mockito.any(MouseAdapter.class));
        Mockito.verify(mockview, Mockito.times(1)).getHumanVsComp();
        Mockito.verify(mockview, Mockito.times(1)).getDifferentGameEachTime();
        Mockito.verify(mockview, Mockito.times(1)).getCompVsComp();
    }

}
