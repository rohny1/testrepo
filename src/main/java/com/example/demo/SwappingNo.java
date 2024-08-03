package com.example.demo;

public class SwappingNo {
    public static void main(String[] args) {
        int a =10, b=20;
        System.out.println("Before Swapping:" +a+" "+b);

        int t=a;//with the use of third variable
        a=b;
        b=t;

        a=a+b;//30
        b=a-b;//10
        a=a-b; //20  //without using third variable

        b=(a+b)-(a=b);  //with one statement


        System.out.println("After Swapping:" +a+ " "+b);
    }



}
