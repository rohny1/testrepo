package com.example.demo;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        //Using Algorithm
        int num  = scanner.nextInt();
        /*int rev = 0;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num =num /10;
        }*/
        /*StringBuffer sb =new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();*/

        StringBuilder builder = new StringBuilder();
        builder.append(num);
        StringBuilder rev = builder.reverse();
        System.out.println("OutPut: " +rev);
    }
}
