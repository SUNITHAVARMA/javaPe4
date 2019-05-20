package main.java.com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TransposeString
{
    //This method take the paragragh and returns the transpose paragraph
    public String[] reverseEachStringInTheParagraph(String[] input)
    {
       String[] array=new String[input.length];
       for(int i=0;i<input.length;i++)
       {
           //This statement reverse the first string and stores in the first position.This process continues until the condition fails //
           array[i]=new StringBuffer(input[i]).reverse().toString();
       }
       return array;
    }
 }
