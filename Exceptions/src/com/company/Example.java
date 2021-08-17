package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
        int result = divide();
        System.out.println(result);}
        catch (ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }
    private static int divide() throws NoSuchElementException{
        int x,y;
        try{
             x = getInt();
             y = getInt();
            System.out.println("x is "+ x + ", y is "+ y);
            return x/y;
        }catch (NoSuchElementException e){
                throw  new NoSuchElementException("no suitable input");
        } catch (ArithmeticException e){
            throw new ArithmeticException("attempt to divide by zero");
        }
    }
    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while (true){
            try{
                return s.nextInt();
            }catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Please enter an number using only digits 0 to 9");
            }
        }
    }
}
