package com.ttn.spring_coupling.loosecoupling_q2;
/*
	Q)2)
Write a program to demonstrate Loosely Coupled code.
 */
public class Calculate {
    public static void main(String[] args) {

        // Loosely coupled because Calculate depends on Calculator interface
        // and can work with any implementation
        Calculator addition = new Addition();
        Calculator subtraction= new Subtraction();

//        System.out.println(addition.calc(65,5));
//        System.out.println(subtraction.calc(65,5));
    }
}
