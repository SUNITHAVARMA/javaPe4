package test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.ReplaceString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceStringTest
{
    private static ReplaceString replaceString;

    @Before
    public  void setup()
    {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        replaceString=new ReplaceString();
    }

    @After
    public void tearDown()
    {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        replaceString=null;
    }

    @Test
    public void replaceData()
    {
        String input="daily dry";

       // This statement returns replaced characters string.
        String result=replaceString.replaceCharacter(input);

        //This method will check actual output with expected output.
        assertEquals("faity fry",result);

    }
}
