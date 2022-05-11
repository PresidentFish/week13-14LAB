
package com.mycompany.week13._lab;

import java.util.*;
//Kevin Carpenter
//Week 14 lab handout

//This program promts the user to write a expression using parenthesis 
//The programs runs throgh the string and determines if any of the parenthesis are unmatch with a left or right.
//It will determine where is is in the index and report all positions that do not have a matching paretentesis
import java.util.Scanner;

public class week13_14_lab

{

    public static void main(String[] args)

    {

       Stack<Integer> s = new Stack<Integer>();//new stack named s

       String line;//string to hold the value of the string the user imputs

       Scanner scan = new Scanner(System.in);//delcares varible to store inputed value

       

       System.out.println("Parenthesis Matching\n");

       System.out.println("Enter a parenthesized expression: ");//text for user to see

       line = scan.next();//Where we take in the new string value that will used for the program   

       int len = line.length();//We turn the length of the string into a varible we can use later called "len"

       System.out.println("\nMatches and Mismatches:\n");

       for (int i = 0; i < len; i++)//Loops a function the length of the string

       {   

char ch = line.charAt(i);//creates a char value that takes the value of what ever position it is on the string index

          if (ch == '(')//if stament looking for a opening parenthesis

s.push(i);//adds the element to the stack

          else if (ch == ')')//If it is not a open parenthesis check for closed parenthesis

          {

                try//try block

                {

                    int p = s.pop() + 1;//p value is the varible at the top of the plus one 

System.out.println("'(' at index "+(i+1)+" matched with ')' at index "+p);//Out puts that there is left parenthesis that is matched to a right 

                }

                catch(Exception e)//exception block that catches 

                {

System.out.println("'(' at index "+(i+1)+" is unmatched");//Out puts that there is left parenthesis that is unmatched to a right 

                }

            }           

        }

while (!s.isEmpty() )

System.out.println("'(' at index "+(s.pop() +1)+" is unmatched");

    }

}