package com.company;

public class AreaCalculator {
    public static void main(String args[]){
            System.out.println(area(2,2));
    }
    public static double area(double radius){
        double area;
        if(radius<=0){
            area=-1.0;
        }else {
            area = 3.14*radius*radius;
        }
        return area;
    }
    public static double area(double order1,double order2){
        return order1*order2;
    }
}
