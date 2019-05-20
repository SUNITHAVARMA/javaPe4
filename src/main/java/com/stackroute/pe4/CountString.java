package main.java.com.stackroute.pe4;

public class CountString
{
    //This method returns the count of given character occurance in the string
    public int checkCountOfCharacter(String input,char ch,int index,int count)
    {
    //It compares the string length with index that starts with 0.
     if(index<input.length())
     {
        //It compares the given character with first position of character in the string
       if(input.charAt(index)==ch)
       {
         count++;

       }
       index++;
       //It will call the method again until condition fails.
        count=checkCountOfCharacter(input,ch,index,count);
     }
    return count;
    }
}
