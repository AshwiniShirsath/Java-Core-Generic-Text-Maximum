package com.bridgelabz.javacoregenerictestmaximum;
/*
 * @author : Ashwini
 * Given 3 Integers find the maximum 
 * - Ensure to test code with the Test Case.
 * - To ensure your Code works you need 3 test cases with Max Number at 1st, 2nd and 3rd
 * - Use Integer Object and compareTo UC 1 method to test the maximum number
 */
public class JavaGenericDemo {
	//compareTo method for Checking Maximum from 3 Integer Object
    public static Integer compareTo(Integer a,Integer b,Integer c) {
        if(a > b){
            if(a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Welcome message for User
        System.out.println("Welcome to Java Core - Generics Test Maximum.");

        System.out.println("Maximum from 3 Integer Object : "+compareTo(90,120,20));
	}
}
        



