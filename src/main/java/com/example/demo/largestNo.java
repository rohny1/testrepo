package com.example.demo;

public class largestNo {
    public static void main(String[] args) {
        int a=10,b=30,c=15;
        int largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest);
    }
}
