package com.example.demo;

public class CountofEvenOdd {
    public static void main(String[] args) {
        Integer num =1267656865;
        int  count = 0;
        int even_count =0;
        int odd_count = 0;
        while (num>0){
            //int rem = num % 10;
            if(num%2==0){
                even_count++;
            }else{
                odd_count++;
            }
            num=num /10;
        }
        System.out.println("evenCount: " + even_count +" AND " +"oddCount "+odd_count);
    }
}
