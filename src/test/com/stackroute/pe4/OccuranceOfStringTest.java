package test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.OccuranceOfString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OccuranceOfStringTest
{
    private static OccuranceOfString occuranceOfString;

    @Before
    public void setup()
    {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        occuranceOfString=new OccuranceOfString();
    }

    @After
    public void tearDown()
    {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        occuranceOfString=null;
    }

    @Test
    public void test()
    {
        String input="She sells seashells by the seashore";

        //This method will check the occurance of given word in the string.
        String result=occuranceOfString.checkOccuranceOfWord(input,"se");

        //It checks actual output with expected output.
        assertEquals(" found at:4-6,found at:10-12,found at:27-29",result);
    }
}
