package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        String name;
        int year;
        String statementBefore65 = "MASH TV series has been around for almost half a century!";
        String statementBefore75 = "The original Jurassic Park release is closer to the first lunar landing than it is to today";
        String statementBefore80 = " Space Jam came out not last decade, but the one before THAT";
        String statementBefore95 = "The first Harry Potter came out over 15 years ago";
        String statementBefore2005 = "Pixar's 'Up' came out over a decade ago";

        System.out.println("Hey, let's play a game. What is your name?");
        name = input.nextLine();

        System.out.println("Ok, " + name + ", when were you born?");
        year = input.nextInt();

        if(year < 1965){
            System.out.println(statementBefore65);
        }
        else if(year >= 1965 && year < 1975){
            System.out.println(statementBefore75);
        }
        else if(year >=1975 && year < 1980) {
            System.out.println(statementBefore80);
        }
        else if(year == 1980){
            System.out.println(statementBefore65);
            System.out.println(statementBefore75);
            System.out.println(statementBefore80);
        }

        else if(year >= 1981 && year < 1995){
            System.out.println(statementBefore95);
        }
        else if(year >=1995 && year < 2005){
            System.out.println(statementBefore2005);
        }
    }
}
