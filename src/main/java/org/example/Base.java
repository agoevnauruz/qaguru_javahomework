package org.example;

public class Base {
    public static void main(String[] args) {

        byte byteExample = 127;


        short shortExample = 32767;

        int varA = 2000000000;
        int varB = 2000000000;
        int overflowMaxResult = varA + varB;
        System.out.println(overflowMaxResult);

        int a = shortExample + 32767;
        System.out.println(a);

        int age = 11;
        if (age > 18 && age < 27)
            System.out.println("Мало лет");
        else if (age <= 10 || age >= 100)
            System.out.println("Оу");

        int plus=10+5;
        int minus=10-5;
        int um=10*5;
        int del=10/3;
        System.out.println(del);

        System.out.println(1+1.5);

        long longValue = 7_233_371_036_854_775_808L;
        float floatValue = 445F;
        double doubleValue = 332.99;
        boolean booleanValue = true;

        System.out.println("Example of long: " + longValue);
        System.out.println("Example of float: " + floatValue);
        System.out.println("Example of double: " + doubleValue);
        System.out.println("Example of boolean: " + booleanValue);
    }

}