package com.company;

import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("First matrix");
        System.out.println("Enter the number of rows");
        int r1 = sc.nextInt();
        System.out.println("\nEnter the number of column");
        int c1 =sc.nextInt();
        int[][] matrix1=new int[r1][c1];
        //second matrix
        System.out.println("Second matrix");
        System.out.println("enter the number of rows");
        int r2 = sc.nextInt();
        System.out.println("enter the number of column");
        int c2 =sc.nextInt();
        int[][] matrix2=new int[r2][c2];

        if(c1==r2) {
            System.out.println("Enter first "+matrix1.length+ " row and "+ matrix1[0].length+" columns");
            for(int row =0;row<matrix1.length;row++) {
                for(int column =0; column<matrix1[row].length;column++) {
                    matrix1[row][column] = sc.nextInt();
                }
            }
            print2d(matrix1);//print first matrix

            System.out.println("Enter second "+matrix2.length+ "row and "+ matrix2[0].length+" columns");
            for(int row2 =0;row2<matrix2.length;row2++) {
                for(int column2 =0; column2<matrix2[row2].length;column2++) {
                    matrix2[row2][column2] = sc.nextInt();
                }
            }


            print2d(matrix2);//Second matrix
            multiplyMatrices(matrix1,matrix2,r1,c1,c2,r2);
        }
		/*System.out.println("Enter second matrix is"+matrix2.length+ "row and "+ matrix2[0].length+" columns");
		for(int row2 =0;row2<matrix2.length;row2++) {
			for(int column2 =0; column2<matrix2[row2].length;column2++) {
				matrix1[row2][column2] = sc.nextInt();
		//System.out.println(isregged(matrix1));
			}
		}
		}8*/


        else
            System.out.print("row and columns should be same");
    }
    public static void print2d(int matrix1[][]) {

        for(int row=0;row<matrix1.length; row++) {
            for(int column =0;column<matrix1[row].length;column++)
                System.out.print(matrix1[row][column]+" ");
            System.out.println();
        }
        System.out.println();
    }
    public static void multiplyMatrices(int[][] matrix1, int[][] matrix2,int row1,int col1,int col2, int row2){
        double c[][]= new double [row1][col2];
        for(int i = 0; i<row1;i++) {
            for(int j =0;j<col2;j++) {
                c[i][j]=0;
                for(int k=0;k<row2;k++) {
                    c[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }


}


//public static double[][] multiplyMatrices(double[][]a,double[][]b){






