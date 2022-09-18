package com.company;
//Rushikesh Palodkar, 113808719
public class ChezWolfie {
    public static void main(String[] args) {
        int orders[][] = new int[][]{
                {5, 1, 2, 3},
                {2, 5, 0, 4},
                {1, 4, 4, 2}};
        //example 2
       /* {1, 4, 3, 2},
        {0, 0, 0, 10},
        {2, 1, 4, 3}*/

        double a = cafe_day(orders);
        System.out.println(a);
    }

    public static double cafe_day(int[][] orders) {
        double p = 0;
        double p2 = 0;
        double p3 = 0;
        double total = 0;
        int count = 0;
        double price=0;


        for (int i = 0; i < orders.length; i++) {//columns
           /* p= orders[i][1]*3.50;
            System.out.println(orders[i][1]+" one Large drink for $3.50 total "+p);
            p2=orders[i][2]*2.50 ;
            System.out.println(orders[i][2]+" one Medium for $2.50 total "+p2);
            p3=orders[i][3]*1.25;
            System.out.println(orders[i][3]+" one small for $1.25 total "+p3);
            total = p+p2+p3;
            System.out.println(total);*/
            p= orders[i][1]*3.50;
            p2=orders[i][2]*2.50 ;
            p3=orders[i][3]*1.25;
            price = 0;
            price = p+p2+p3;

            if (orders[i][0] == 2) {
                if (orders[i][1] >= 3 || orders[i][2] >=4) {
                    price -= (1.25 * 3);
                    total+=price;
                }
                else{
                    total+=price;
                }

            }
            else if (orders[i][0] == 1) {
                count = orders[i][1] + orders[i][2] + orders[i][3];
                if (count >= 10) {
                    price -= (price * 0.2);
                    total += price;
                }
                else
                {
                    total+= price;
                }

            }
            else if (orders[i][0] == 0) {
                    price -= price * 0.02;
                    total+=price;
            }
            else {
                    price=0;

            }
        }
    return total;
    }
}



