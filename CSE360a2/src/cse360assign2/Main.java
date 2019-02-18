package cse360assign2;

/**
 * Student name : Hsin-Jung Lee
 * Class ID: 451
 * Assignment 2
 * Description: This program will calculator numbers and print history.
 * https://github.com/hsinjlee/cse360assign2
 */

/**
 * main class test Calculator java file
 */
public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        myCalculator.add(3);
        myCalculator.subtract(1);
        myCalculator.multiply(2);
        myCalculator.divide(3);
        myCalculator.divide(0);
        myCalculator.add(1);
        myCalculator.multiply(3);
        myCalculator.divide(2);
        myCalculator.divide(-2);
        myCalculator.divide(0);
        myCalculator.divide(20);
        myCalculator.add(100);
        myCalculator.subtract(-101);
        myCalculator.subtract(202);
        myCalculator.multiply(5);
        myCalculator.divide(-4);
        myCalculator.divide(0);
        System.out.println(myCalculator.getTotal());
        System.out.println(myCalculator.getHistory());
    }
}
