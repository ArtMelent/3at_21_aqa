package day_3.exeption;

public class DivByZeroExeption extends Exception{
    public DivByZeroExeption(String message) {
        super("My DivByZeroExeption "+ message);

    }

    public DivByZeroExeption() {

    }
}
