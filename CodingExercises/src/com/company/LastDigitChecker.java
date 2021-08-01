package com.company;

public class LastDigitChecker {
    public static void main (String args[]){
        System.out.println(hasSameLastDigit(3,32,42));
    }
    public static boolean hasSameLastDigit (int num1, int num2, int num3){
        if(num1>9 && num1<1001 && num2>9 && num2<1001 && num3>9 && num3<1001){
            int lastDigitOfNum1 = num1 % 10;
            int lastDigitOfNum2 = num2 % 10;
            int lastDigitOfNum3 = num3 % 10;

            if((lastDigitOfNum1==lastDigitOfNum2) || (lastDigitOfNum1==lastDigitOfNum3) || (lastDigitOfNum3==lastDigitOfNum2)){
                return true;
            }else{
                return false;
            }

        }
        else {
            return false;
        }
    }
}
