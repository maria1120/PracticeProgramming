package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {
   static Random random = new Random();
    public static void main(String[] args) {


       String color = getColor(); // call color method here
     String animal = getAnimal(); // call animal method again here
        String colorAgain = getColor(); // call color method again here
       int weight = getWeight(); // call number method,
        // with a range between 5 - 200
       int distance = getDistance(); // call number method,
        // with a range between 10 - 20
      int number = getNumber(); // call number method,
        // with a range between 10000 - 20000
       int time = getTime(); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String getColor(){
        String[] colors = new String[] {"Red", "Green", "Pink", "Yellow", "Black"};

        int randomInt = random.nextInt(colors.length);
        return colors[randomInt];
    }

    public static String getAnimal(){
        String[] animals = new String[] { "Cat", "Dog", "Rabbit", "Ant", "Snake"};
        int i = random.nextInt(animals.length);
        return animals[i];

    }

    public static int getWeight(){
        return random.nextInt() * (200 - 5) + 5;
    }
    public static int getDistance(){
        return random.nextInt() * (20 - 10) + 10;
    }
    public static int getNumber(){

        return random.nextInt()* (20000-10000) + 10000;
    }
    public static int getTime(){
        return random.nextInt() * (6-2) +2;
    }

    // ??? Method 1 ???
    // ??? Method 2 ???
    // ??? Method 3 ???
}
