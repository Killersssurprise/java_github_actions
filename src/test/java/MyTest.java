import org.example.calc.Calculator;
//import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MyTest {

    //TDD - Test Driven Development
    //TDD - Type Driven Development
    //BDD - Behaviour Driven Development

//    Scenario: Add two numbers
//        Given I have entered 50 into the calculator
//        Given I have entered 70 into the calculator
//        When I press add
//            THen The result should be 120 on the screen

    //DDD - Domain Driven Design
    //FDD - Features Driven Development
    //MDD - Model Driven Development
    //PDD - Panic Driven Development



    @BeforeEach
    public void myBeforeEach(){
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void myAfterEach(){
        System.out.println("AfterEach");
    }


//    @Test
//    public void two_plus_three_is_five(){
//
//        Assert.assertEquals(Calculator.sum(2,3), 5);
////        System.out.println("Я выполняю тест!");
//    }
//
//    @Test
//    public void two_plus_three_is_five2(){
//
//        Assert.assertEquals(Calculator.sum(3,2), 5);
////        System.out.println("Я выполняю тест!");
//    }

    @Test
    public void two_plus_three_is_five3(){

//        Assert.assertEquals(Calculator.sum(-3,2), -1);
//        System.out.println("Я выполняю тест!");

    }


    @Nested
    public class InnerClassTest{
        public void myBeforeEachInner(){
            System.out.println("BeforeEach Inner");
        }

        @AfterEach
        public void myAfterEachInner(){
            System.out.println("AfterEach Inner");
        }


//        @Test
//        public void inner1(){
//
//            Assert.assertEquals(Calculator.sum(2,3), 5);
//        }
//
//        @Test
//        public void inner2(){
//            Assert.assertEquals(Calculator.sum(3,2), 5);
//        }
    }


}
