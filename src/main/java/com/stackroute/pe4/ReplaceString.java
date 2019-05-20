package main.java.com.stackroute.pe4;

public class ReplaceString
{

    //This method replace the string with given characters and returns string.
    public String replaceCharacter(String input)
    {
        if(input!=null)
        {
            //This statement replaces all d's with f.
            input= input.replaceAll("d", "f");

            //This statement replaces all l's with t.
            input = input.replaceAll("l", "t");
        }
        return  input;
    }
}
