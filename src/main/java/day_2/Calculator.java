package day_2;

import day_3.exeption.DivByZeroExeption;

public class Calculator {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println(add(a,b));
        System.out.println(minus(a,b));
        System.out.println(mult(a,b));
        System.out.println(divide(a,b));
    }

    private static int add(int a, int b) {
        return a+b;
    }

    private static int minus(int a, int b) {
        return a-b;
    }

    private static int mult(int a, int b) {
        return a*b;
    }

    public static int divide(int a, int b) {
        if (b==0) try {
            throw new DivByZeroExeption();
        } catch (DivByZeroExeption e) {
            e.printStackTrace();
        }
        return a/b;
    }
}
