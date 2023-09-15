package org.example.calc;

public class Calculator {

    public static int sum(int a, int b) {
        return (int)a+(int)b;
    }

    public static float sum(float a, float b) {
        return a+b;
    }
//
    public static int div(int a, int b) throws MyCustomDivByZero {

        if(b == 0){
            throw new MyCustomDivByZero();
        }

        return a/b;
    }
//
    public static int substraction(int a, int b) {
        return a-b;
    }

    public static int multiplication(int a, int b) {
        return a*b;
    }

}
