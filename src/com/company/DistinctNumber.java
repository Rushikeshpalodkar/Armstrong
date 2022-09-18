package com.company;
import java.util.Scanner;

public class DistinctNumber {
    public static void main(String[] args) {
        int[] distinctnNum = new int[10];
        int counter = 0;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        for(int i = 0; i < 10; i++){
            int n = input.nextInt();
            if(isDist(n, distinctnNum, counter)){
                distinctnNum[counter] = n;
                counter++;
                System.out.println(counter);
            }
        }
        System.out.print("Unique numbers: ");
        for(int i = 0; i < counter; i++){
            System.out.print(distinctnNum[i] + " ");
        }
        input.close();
    }
    public static boolean isDist(int n, int[] distinctnNum, int counter){
        for(int i = 0; i < counter; i++){
            if(distinctnNum[i] == n){
                return false;
            }
        }
        return true;
    }
}
