package com.example.demo;

public class ReverseString {
    public static void main(String[] args) {

        //Using Concatenation Operator
        String str = "Rohan";
        String rev = "";
        /*for(int i = str.length()-1; i>=0;i--){
            rev = rev + str.charAt(i);
        }*/
        //using Character Arrray
        /*char []a = str.toCharArray();
        for(int i= str.length()-1 ; i>=0; i--){
            rev = rev + a[i];
        }*/

        //Using StringBuffer Class
        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev1= sb.reverse();
        System.out.println(rev1);
        //Using StringBuilder
        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder rev2 = sb1.reverse();
        System.out.println(rev2);

    }
}
