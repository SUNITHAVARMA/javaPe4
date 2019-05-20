package main.java.com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfTheName
{
    //Declaration of Pattern,Matcher class variables
    private static Pattern pattern;
    private static Matcher matcher;

    //This method takes the arguments and check the name presence in the string or not and then returns boolean value.
    public boolean checkKey1IsThereInStringOrNot(String input,String key1)
    {
        pattern = Pattern.compile(key1);
        matcher = pattern.matcher(input);
        if(matcher.find())
        {
            return true;
        }
        return false;

    }

    //This method takes the arguments and check the name presence in the string or not and then returns boolean value.
    public boolean checkKey2IsThereInStringOrNot(String input,String key2)
    {
        pattern = Pattern.compile(key2);
        matcher = pattern.matcher(input);
        if(matcher.find())
        {
            return true;
        }
        return false;
    }
}
