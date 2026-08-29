package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {


        String test = "I";
        System.out.println(test.toLowerCase());



    }

    public static boolean checkForPalindrome(String str){
        String lowerCase = str.replaceAll("[.,?!_\\-\\s]", "").toLowerCase(Locale.ENGLISH);

        for (int i = 0 ; i < lowerCase.length()/2 ; i++){
            if (lowerCase.charAt(i) != lowerCase.charAt(lowerCase.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int num){
        Stack<Integer> stack = new Stack<>();
        while(num != 0){
            stack.push(num%2);
            num = num/2;
        }
        StringBuilder str = new StringBuilder();

        while(!stack.isEmpty()){
            str.append(stack.pop());
        }


        return str.toString();
    }

}