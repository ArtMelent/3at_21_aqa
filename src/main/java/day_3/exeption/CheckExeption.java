package day_3.exeption;

import day_2.Calculator;

public class CheckExeption {
    public static void main(String[] args) {
        //1) Make your own Exception implementation. Use it in your CalcApp
        Calculator.divide(3, 0);
    }
}
