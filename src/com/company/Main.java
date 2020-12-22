package com.company;


import java.util.Random;




public class Main {
    public static void main(String[] args) {
        System.out.println(isGoOutside(generateRandomAge(),10));
        System.out.println(isGoOutside(generateRandomAge(),-10));
        System.out.println(isGoOutside(generateRandomAge(),0));
        System.out.println(isGoOutside(generateRandomAge(),20));
        System.out.println(isGoOutside(generateRandomAge(),17));
        System.out.println(generateRandomAge());
    }
    private static int generateRandomAge() {
        Random r = new Random();
        int rand = r.nextInt(60);
        return rand;
    }

    public static String isGoOutside(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять";
        }else if(age > 45 && temp > -10 && temp < 25){
            return "Можно идти гулять";
        }else {
            return "Оставайся дома";
        }


    }

}