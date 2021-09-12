/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is your age? " );
        int age = scnN.nextInt();
        System.out.print( age < 16 ? "You are not old enough to legally drive." :
                "You are old enough to legally drive.");
    }
}