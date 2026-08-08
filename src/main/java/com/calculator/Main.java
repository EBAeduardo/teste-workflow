package com.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Calculadora iniciada.");
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("5 * 6 = " + calc.multiply(5, 6));
        
        try {
            System.out.println("20 / 4 = " + calc.divide(20, 4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}