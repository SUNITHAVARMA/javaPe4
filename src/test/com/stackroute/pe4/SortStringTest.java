package test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.SortString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortStringTest
{
    private static  SortString sort;

    @Before
    public void setup()
    {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        sort=new SortString();
    }

    @After
    public void tearDown()
    {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        sort=null;
    }

    @Test
    public void sortSentence()
    {
        String[] input={"this","is","sunitha"};

        //This method returns the sorted paragraph.
        String[] result=sort.sortParagraph(input);

        //This method compares the actual output with expected output.
        assertEquals(new String[]{"is","sunitha","this"},result);
    }
}
