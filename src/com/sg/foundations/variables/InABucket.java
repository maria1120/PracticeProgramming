package com.sg.foundations.variables;

public class InABucket {

    public static void main (String[] args){
        // You can declare all KINDS of variables.
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;

        // But declaring them just sets up the space for data
        // to use the variable, you have to put data IN it first!
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        weightOfTeacupPig = 1.23f;
        grainsOfSand = 2;

        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
        System.out.println("The weight of Tea cup pig is: " + weightOfTeacupPig);
        System.out.println("Grains of sands: " + grainsOfSand);
    }
}
