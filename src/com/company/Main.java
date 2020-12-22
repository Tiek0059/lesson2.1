package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println(isGoOutside(0, 6));
        System.out.println(isGoOutside(6, 0));
        System.out.println(isGoOutside(6460, 57));
        System.out.println(isGoOutside(77, 6));
        System.out.println(isGoOutside(0, 8));
    }

    public static String isGoOutside(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30)
            return "Можно идти гулять";
        else if (age < 20 && temp > 0 && temp < 28)
            return "Можно идти гулять";
        else if (age > 45 && temp > -10 && temp < 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }

}