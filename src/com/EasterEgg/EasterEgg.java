package com.EasterEgg;

import java.util.Scanner;

/**
 * Name: John Campbell
 * Section: COSC/ITSE     
 * Homework: Easter Egg  
 * Description: This program creates eggs and places them into the Basket class. The user can create the Easter eggs
 * however they want them to look like.
 **/

public class EasterEgg {

    private char chrOutput = '*';
    private static int intEggCount = 1;

    public EasterEgg(){
        UserInput();
        intEggCount++;
    }

    private void UserInput(){
        Scanner objInput = new Scanner(System.in);
        System.out.println("What character would you like inside egg number " + intEggCount + "?");
        setSymbol(objInput.next().charAt(0));
    }

    public int EggCounter(){
        return intEggCount - 1;
    }

    private char getSymbol(){
        return chrOutput;
    }

    private void setSymbol(char pchrOutput){
       chrOutput = pchrOutput;
    }

    public String toString(){
        return ( "\n  __ \n" +
                " /" + getSymbol() + getSymbol() + "\\ \n" +
                "/" + getSymbol()  + getSymbol()  + getSymbol()  + getSymbol()  + "\\ \n" +
                "|" + getSymbol() + getSymbol() + getSymbol() + getSymbol() + "|  \n" +
                "\\____/ \n\n");

    }

}
