package com.sg.foundations.flowcontrol.ifs;

import java.util.Random;
import java.util.Scanner;

public class GuessMe {


    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int myNumber = rand.nextInt();
        int guess;

        //Start the game as asking for a guess
        System.out.println("I've chosen a number. Betcha can't guess it!\n" +
                "Your guess:");

        //take the input and give the result

        guess = input.nextInt();

        if (guess < myNumber) {
            System.out.println(guess + "?" + " Ha, nice try - too low! I chose " + myNumber);
        } else if (guess < myNumber) {
            System.out.println(guess + "?" + " Ha, nice try - too high! I chose " + myNumber);
        } else {
            System.out.println("Well done! You guessed it right");
        }
    }
}
