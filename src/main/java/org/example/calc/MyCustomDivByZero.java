package org.example.calc;

public class MyCustomDivByZero extends Exception{

    public MyCustomDivByZero() {
        super("Крайне неприятное событие произошло, кто-то попытался поделить на 0 и тем самым вызвал взрыв в параллельной вселенной!");
    }
}
