package Armstrong;
//Rushikesh Palodkar Sbu id 113808719
import java.util.Scanner;
public class Triangels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int level =sc.nextInt();
        triangle(level);
    }
    public static void triangle(int n){
        for(int i = 1;i<n+1;i++){

            for(int j= n;j>=1;j--){
                if(j>i)
                    System.out.print(" ");
                else
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



