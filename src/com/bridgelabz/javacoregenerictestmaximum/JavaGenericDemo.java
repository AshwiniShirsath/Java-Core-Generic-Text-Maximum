package com.bridgelabz.javacoregenerictestmaximum;
/*
 * @author : Ashwini
 * Given 3 Floats find the maximum
 * - Ensure to test code with the Test Case and repeat with the similar 3 Test cases in UC 1
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
    //compareTo method for Checking Maximum from 3 Float Object
    public static Float compareTo(Float a,Float b,Float c) {
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
        System.out.println("Maximum from 3 Float Object : "+compareTo(90.0F,120.0F,190.0F));
     }
}   



