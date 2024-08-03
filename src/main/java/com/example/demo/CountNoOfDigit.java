package com.example.demo;

public class CountNoOfDigit {
    public static void main(String[] args) {
        int num = 1256778;
        int count = 0;
        /*while (num>0){
            num = num/10;
            count++;
        }*/
        String numAsString = String.valueOf(num);
        // Get the length of the string, which equals the number of digits
        count = numAsString.length();
        System.out.println("count of number: " + count);
    }
}
