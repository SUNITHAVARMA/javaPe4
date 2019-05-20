package test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.PresenceOfTheName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PresenceOfTheNameTest
{
    private static PresenceOfTheName name;

    @Before
    public void setup()
    {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        name=new PresenceOfTheName();
    }

    @After
    public void tearDown()
    {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        name=null;
    }

    @Test
    public void test()
    {
        String input="this is harry";
        String key1="harry";
        String key2="sunitha";

        //This statement will return the actual output i.e given name is exists in the string or not.
        boolean result=name.checkKey1IsThereInStringOrNot(input,key1);

        //This method will compare the actual result with expected output.
        assertEquals(true,result);

        //This statement will return the actual output i.e given name is exists in the string or not.
        boolean result1=name.checkKey2IsThereInStringOrNot(input,key2);

        //This method will compare the actual result with expected output.
        assertEquals(false,result1);
    }
}
