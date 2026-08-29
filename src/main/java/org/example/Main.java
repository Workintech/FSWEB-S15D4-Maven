package org.example;


import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("********************************************");

        System.out.println(checkForPalindrome("hello"));


        System.out.println("*****************************************");


        WorkintechList workintechList = new WorkintechList();

        workintechList.add("Kenan");
        workintechList.add("Ali");
        workintechList.add("Zeynep");
        workintechList.add("Ayfer");
        workintechList.add("Berat");

        workintechList.sort();
        workintechList.remove("Kenan");

        System.out.println(workintechList);


        System.out.println("********************************");

        System.out.println(convertDecimalToBinary(13));
    }

    public static boolean checkForPalindrome(String name){
        // Karakterleri temizleyelim ve küçük harfe çevirelecek.
        name = String.join("", name.split("[.,?!_ \\-;]+")).toLowerCase();

        // Tersini oluşturmak için StringBuilder kullanıldı.
        StringBuilder reversed = new StringBuilder(name).reverse();

        // Asıl isim ile tersini karşılaştırır.
        return name.equals(reversed.toString());
    }

    public static String convertDecimalToBinary(int number){
        LinkedList<Integer> binaryList = new LinkedList<>();
        while(number>0){
            int reminder = number %2;
            binaryList.addFirst(reminder);
            number = number /2;
        }

        StringBuilder stringBuilder =new StringBuilder();
        for(int digit:binaryList){
            stringBuilder.append(digit);
        }

        return stringBuilder.toString();
    }

}