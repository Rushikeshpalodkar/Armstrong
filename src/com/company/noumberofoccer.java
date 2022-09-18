package com.company;

public class noumberofoccer {
    public static void main(String[] args) {
        System.out.println(maxCount(new int[]{1,2,5,3,5,5,5,0}));

    }
    public static int maxCount(int[] k) {
        int count = 0;
        int temp =0;

        for (int i = 0; i <k.length-1; i++) {
            for (int j = 0; j < k.length-1-i; j++) {
                if (k[j] > k[j+1]){
                    temp = k[j];
                    k[j] =k[j+1];
                    k[j+1]=temp;
                }
            }
        }
        for(int i =0; i<k.length;i++){
            if(k[i]==k[k.length-1]){
                count=count+1;
            }
        }
        System.out.println(count);
        return k[k.length-1];

    }

}
