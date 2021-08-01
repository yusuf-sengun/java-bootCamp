package com.company;

public class Palindrome {
    public static void main(String args[]){

        System.out.println(isPalindrome(212));
    }
    public static boolean isPalindrome(int number){
        String n1= String.valueOf(number);
        StringBuilder sb1= new StringBuilder(n1);
        StringBuilder sb= new StringBuilder(n1);
        sb.reverse();
        if(sb1.toString().equals(sb.toString())) {
            return  true;
        }
        else{
            return false;
        }
    }
}
