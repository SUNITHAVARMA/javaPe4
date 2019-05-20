package test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.CountString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountStringTest
{
    private static CountString countString;

    @Before
    public void setup()
    {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    countString=new CountString();
    }

    @After
    public void tearDown()
    {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    countString=null;
    }

    @Test
    public void setCountString()
    {
    String input="hai sunitha";
    char ch='a';
    int count=0,index=0;

   // This statement checks the given character occurances in the string. //
    int result=countString.checkCountOfCharacter(input,ch,index,count);

    //This method is used to check actual output with expected output.
    assertEquals(2,result);
    }
 }
