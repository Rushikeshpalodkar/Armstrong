package com.company;
import java.util.*;

public class LengthConversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A – convert inches to centimeters\n" +
                "B – convert centimeters to inches\n" +
                "C – convert kilometers to miles\n" +
                "D – convert miles to kilometers\n" +
                "E – Exit");
        char option = 'A';
        double value;
        while (option != 'E') {
            option = sc.next().charAt(0);
            switch (option) {
                case 'A':
                    System.out.println("Enter inches ");
                    value = sc.nextDouble();
                    System.out.println("Ans: " + inToCm(value));
                    break;

                case 'B':
                    System.out.println("Enter cm ");
                    value = sc.nextDouble();
                    System.out.println("Ans: " + cmToin(value));
                    break;

                case 'C':
                        System.out.println("Enter km ");
                        value = sc.nextDouble();
                        System.out.println("Ans: " + kmTomi(value));
                        break;

                case 'D':
                    System.out.println("Enter mi ");
                    value = sc.nextDouble();
                    System.out.println("Ans: " + miToKm(value));
                    break;

                case 'E':
                   System.out.println("Bye");
                    break;

                }
            }
        }

    public static double inToCm(double in){
        double conversionRate = 2.54;
        return in*conversionRate;

    }
    public static double cmToin(double cm) {
        double conversionRate = 0.393701;
        return cm * conversionRate;
    }
    public static double kmTomi(double km) {
        double conversionRate = 0.621371;
        return km * conversionRate;
    }
    public static double miToKm(double mi) {
            double conversionRate = 1.60934;
            return mi * conversionRate;
        }
}

