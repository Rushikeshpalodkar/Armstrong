package com.company;
import java.util.*;
public class Pounds2Kgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pound = sc.nextDouble();

        System.out.print(poundstokgs(pound));
    }
        public static double poundstokgs(double pounds){
            double Kgs = pounds * 0.454;

            return Kgs;
        }
    }

