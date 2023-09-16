import org.example.calc.Calculator;
import org.example.calc.MyCustomDivByZero;
//import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private int a=1, b=0;

    @Test
    void sumTest(){
        Assertions.assertEquals(Calculator.sum(3,2), 7);
//        Assert.assertEquals(Calculator.sum(3,2), 5);
    }

    @Test
    void sumTestFloat1(){
        Assertions.assertEquals(5.4f,Calculator.sum(3.2f,2.2f), 0.00000000001f);
//        Assert.assertEquals(5.4f,Calculator.sum(3.2f,2.2f), 0.00000000001f);
    }

    @Test
    void divTest() throws MyCustomDivByZero {
        Assertions.assertEquals(Calculator.div(8,2), 4);
//        Assert.assertEquals(Calculator.div(8,2), 4);
    }

    @Test
    void divTest3() throws MyCustomDivByZero {
        Assertions.assertEquals(Calculator.div(16,2), 8);
//        Assert.assertEquals(Calculator.div(16,2), 8);
    }

    @Test
    void divTest2(){
        assertThrows(MyCustomDivByZero.class,
                ()->{
                    Calculator.div(8,0);
                });
    }

    @Test
    void multTest(){

        Assertions.assertEquals(Calculator.multiplication(8,2), 16);
    }

    @Test
    void subTest(){
        Assertions.assertEquals(Calculator.substraction(8,2), 6);
    }

}
