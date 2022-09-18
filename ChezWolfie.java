public class ChezWolfie {
    public static void main(string[] args){
        int orders[][]=new int[][]{{5, 1, 2, 3}, {2, 5, 0, 4}, {1, 4, 4, 2}};
        cafe_day(orders);
    }
    public static void cafe_day(int[][] orders) {
        for(int i=1;i<=orders.length;i++) {//row

            if(orders[i][1]== 2) {
                System.out.println(" is platinum,  purchases 3 or more large drinks, so  he/she gets at most 3 free small drinks");
            }
            else if(orders[i][1]== 1) {
                System.out.println("is Gold membershis,  purchases 10 drinks, so he/she gets a 20% discount.");
            }
            else if(orders[i][1]== 0) {
                System.out.println("is Silver membershis,The customer receives 2% off of total price regardless of number of drinks ordered.");
            }
            else {
                System.out.println(" is invalid because membership cannot be "+orders[i][1]);
            }

        }
    }
}
