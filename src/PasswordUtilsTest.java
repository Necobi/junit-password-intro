import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //Arrange 
        String password = "";
        //Act - method you're testing
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert (expected, actual)
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthLongPassword(){
        //Arrange
        String password = "supercalifragilisticexpealidocious";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }
     @Test
    void testDescribePasswordLongerThan40charsIsVeryLong(){
        //Arrange
        String password = "qwertyuiopasdfghjklzxcvbnm,asgybugytsmodnfjyh";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("very long", actual);
    }
    


    @Test
    void testDescribePasswordWorksWithPercentSign(){
        //Arrange
        String password = "ilovemydog123%"; //shouldn't work
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }

      @Test
    void testDescribePasswordWorksWithOnlyLetters(){
        //Arrange
        String password = "ilovemydog"; //should work
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
    }

     @Test
    void testDescribePasswordWorksWithOnlyNumbers(){
        //Arrange
        String password = "12345"; //should work
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
    }
    

}

