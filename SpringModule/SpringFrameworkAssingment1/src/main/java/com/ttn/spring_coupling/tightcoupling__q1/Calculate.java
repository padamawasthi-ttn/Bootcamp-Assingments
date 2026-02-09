package com.ttn.spring_coupling.tightcoupling__q1;

/*
Q)3)
Write a program to demonstrate Tightly Coupled code.
 */
public class Calculate {
    public static void main(String[] args) {

        //here these are tightly coupled to each other
        Addition addition= new Addition();
        Subtraction subtraction = new Subtraction();



        System.out.println(addition.add(5,65));
        System.out.println(subtraction.sub(65,5));
    }
}
