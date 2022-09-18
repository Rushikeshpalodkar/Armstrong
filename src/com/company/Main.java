package com.company;
import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int lower= sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper= sc.nextInt();
        int sum=0;
        int count;
        int count2 = 0;
        int arm;

        for(int i=lower;i <= upper ;i++) {
            int pov =String.valueOf(i).length();
            count = i;
            for(int j=pov;j>0;j--) {
                sum = count%10;
                count/=10;
                count2 += Math.pow(sum, pov);
            }
            if(count2 == i) {
                System.out.println(i);
            }
            count2 = 0;

        }
    }
}
