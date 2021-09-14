package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *   Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = keyboardInput.nextLine();

        System.out.print("Enter a verb: ");
        String verb = keyboardInput.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = keyboardInput.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = keyboardInput.nextLine();

        System.out.print("Do you " + verb);
        System.out.print(" your " + adjective );
        System.out.print( " " + noun +" "+  adverb );
    }
}
