package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;
import java.util.Scanner;

public class LuckySeven {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result1, result2;

        //Because the program will not work with cents, instead using double, I will use int value for money
        int money;

        // To ask user how much money has available and to store that value
        System.out.println("Let's play Lucky Seven! Tell me how much you could spend");
        money = input.nextInt();
        int i = 0;
        int lost = 0;
        int won = 0;

        // create a loop to trace user's money
        while(money>0){

            result1 = getRandomNumber();
            result2 = getRandomNumber();
            i++;

            if(result1 + result2 == 7){
                won++;
                money+=7;

            }
            else {

                lost++;
                money-=1;
            }

       }
        System.out.println("You played " + i + " times. You won " + won + " times but lost " + lost );
    }

 //Method to return random number in range 1-6
    public static int getRandomNumber(){
        Random random = new Random();
        int min = 1;
        int max = 6;
        int range = (max-min) + min;
        return (int) ((Math.random() * (max - min)) + min);

    }


}
