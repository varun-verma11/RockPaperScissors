
package rockpaperscissors.view;

import java.lang.reflect.Field;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestWelcomeScreen {


    @Test
    public void testConstructor() {
         
        // Generate the fields
         
        JButton mockjbu_0 = Mockito.mock(JButton.class);
        JButton mockjbu_01 = Mockito.mock(JButton.class);
        JPanel mockjpa_0 = Mockito.mock(JPanel.class);
        JButton mockjbu_02 = Mockito.mock(JButton.class);
         
        // Invoke the method
         
        WelcomeScreen welcomeScreen = new WelcomeScreen();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetHumanVsComp()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JButton mockjbu_0 = Mockito.mock(JButton.class);
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        Field field = welcomeScreen.getClass().getDeclaredField("humanVsComp");
        field.setAccessible(true);
        field.set(welcomeScreen, mockjbu_0);
         
        // Invoke the method
         
        JButton jButton = welcomeScreen.getHumanVsComp();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetDifferentGameEachTime()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JButton mockjbu_0 = Mockito.mock(JButton.class);
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        Field field = welcomeScreen.getClass().getDeclaredField("differentGameEachTime");
        field.setAccessible(true);
        field.set(welcomeScreen, mockjbu_0);
         
        // Invoke the method
         
        JButton jButton = welcomeScreen.getDifferentGameEachTime();
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetCompVsComp()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        JButton mockjbu_0 = Mockito.mock(JButton.class);
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        Field field = welcomeScreen.getClass().getDeclaredField("compVsComp");
        field.setAccessible(true);
        field.set(welcomeScreen, mockjbu_0);
         
        // Invoke the method
         
        JButton jButton = welcomeScreen.getCompVsComp();
         
        // Assert that our method interactions are what we expect.
         
    }

}
