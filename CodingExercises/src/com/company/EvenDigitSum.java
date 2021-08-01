package com.company;

public class EvenDigitSum {
    public static void main(String args[]){
        System.out.println(getEvenDigitSum(213456789));
    }
    public static int getEvenDigitSum(int number){
        int total=0;
        if(number<0){
            return -1;
        }
        for(int i=0;number>0;i++){
            int n= number%10;
            number = number / 10;
            if(n%2==0){
                total+=n;
            }
        }
        return total;
    }
}
