package main.java.com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccuranceOfString
{

    //Declaration of Pattern,Matcher class variables.
     private static Pattern pattern;
     private static Matcher matcher;

     //This method returns starting and ending index of the word.
     public String checkOccuranceOfWord(String input,String word){
        String result=" ";

        //The compile() method of Pattern class is used to compile the given regular expression passed as the string.
        pattern=Pattern.compile(word);

        //The matches() returns true if the regular expression matches the text, and false if not.
        matcher=pattern.matcher(input);
        while (matcher.find()){

            //The methods start() and end() will give the indexes into the text where the found match starts and ends.
            result+="found at:"+matcher.start()+"-"+matcher.end()+",";

        }

        return result.substring(0,result.length()-1);
    }
}
