package org.example.exceptions;

public class NoMathParameterException extends Exception{

    public NoMathParameterException() {
        super("Нет нужного параметра");
    }
}
