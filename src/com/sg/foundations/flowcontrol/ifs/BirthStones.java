package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class BirthStones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What month's birthstone do you want to know? Please give a number from 1 to 12");
        int month = input.nextInt();

        switch(month){
            case 1:
                System.out.println("January: Garnet");
                break;
            case 2:
                System.out.println("February: Amethyst");
                break;
            case 3:
                System.out.println("March: Aquamarine");
                break;
            case 4:
                System.out.println("April: Diamond");
                break;
            case 5:
                System.out.println("May: Emerald");
                break;
            case 6:
                System.out.println("June: Pearl");
                break;
            case 7:
                System.out.println("July: Ruby");
                break;
            case 8:
                System.out.println("August: Peridot");
                break;
            case 9:
                System.out.println("September: Sapphire");
                break;
            case 10:
                System.out.println("October: Opal");
                break;
            case 11:
                System.out.println("November: Topaz");
                break;
            case 12:
                System.out.println("December: Turquoise");
                break;
            default: System.out.println("I think you must be confused," + month + " doesn't match a month.");

        }
    }
    }

