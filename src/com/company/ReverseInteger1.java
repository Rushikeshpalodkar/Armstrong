package com.company;
import java.util.Scanner;

public class ReverseInteger1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer that is to be reverse");
                int num=sc.nextInt();
        System.out.println(reverse(num));
    }
    public static int reverse(int num){
        String number =Integer.toString(num);
        String newNum ="";
        for(int i=number.length()-1;i>=0;i--){
            newNum += number.charAt(i);
        }
        return Integer.parseInt(newNum);
    }
}

