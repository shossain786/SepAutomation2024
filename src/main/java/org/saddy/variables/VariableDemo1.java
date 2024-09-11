package org.saddy.variables;

public class VariableDemo1 {
    static  int a  = 10;   //Global/Class level variable
    static String name = "Rahul";

    public static void main(String[] args) {
        System.out.println("Name: " + name);
        display();
        print();
    }

    public static void display(){
        int x = 100;        //local variable
        System.out.println("Value of a: " + a);
        System.out.println("Person name: " + name);
        System.out.println("Value of x: " + x);
    }

     public static void print(){
        int y = 200;
         System.out.println("Value of y: " + y);
    }
}
