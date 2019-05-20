package test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.TransposeString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransposeStringTest
{
    private static TransposeString transposeString;

    @Before
    public void setup()
    {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        transposeString=new TransposeString();

    }

    @After
    public void tearDown()
    {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        transposeString=null;
    }

    @Test
     public void reverseEachString()
    {
        String[] input={"hi","hello","Stackroute","sunitha"};

        //This statement returns the Paragraph contains reversed strings.
        String[] result=transposeString.reverseEachStringInTheParagraph(input);

        //This method checks the actual output with expected output.
        assertEquals(new String[]{"ih","olleh","etuorkcatS","ahtinus"},result);
    }
}
