package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        System.out.println(Math.PI);

//        JSONObject jo = new JSONObject();

        Integer val_integer = 10;
        int value = 10;

        //0 - 1 - бит
        //0 0 0 0 0 0 0 0 - байт

        //54 - 32 = 22 - 16 = 6 - 4 = 2
        //(2^7 = 128) (2^6 = 64) (2^5 = 32) (2^4 = 16) (2^3 = 8) (2^2 = 4) (2^1 = 2) (2^0 = 1)
        //0 0 1 1 0 1 1 0
        value = 100_010_000;


//        float val = Float.MAX_VALUE;
//        val = 30.10000334f;
//
//        double d = 30.1000000334d;
//
//        System.out.println(""+d);

        boolean bool = false;

        //> < >= <= != ==
        //&&  ||
//        int chislo = 4;
//
//        if (chislo != 5) {
//                System.out.println("Число не равно 5, урррра!!!");
//        } else{
//            System.out.println("Фу, выпало число 5");
//        }

        //UTF-8
        //WINDOWS 1251
        //ASCII
//        char a = 'a';
//
//        System.out.println(((int) a));

//        int a = 10; // "10"
//        int b = 5; // "5"
        String s = "3"; //+ "10" + "5" -> 3

//        double PI = Math.PI;
//
//
//        System.out.println((double)a);

        String stroka1 = "a";
//        System.out.println(stroka1.charAt(0));
        //0 1 2 3 4 5 6 7 8 9 10
        //P r i v e t   m i r !
        stroka1 = "Privet mir!";
//        System.out.println(stroka1.charAt(3));

//        int a = 10;
//        int b = 5;

//        int c = a;
//        System.out.println("Element a is: "+a);
//        System.out.println("Element c is: "+c);
//
//        a = 12;
//        System.out.println("Element a is: "+a);
//        System.out.println("Element c is: "+c);

        String a = "abc";
        String b = a;
        String c = b;
//        System.out.println("Element a is: " + a);
//        System.out.println("Element b is: " + b);
//        System.out.println("Element b is: " + b);

//        if (a.equals(c)) {
//            System.out.println("Объекты идентичны");
//        } else {
//            System.out.println("Не идентичны");
//        }

        a = "cba";

//        if (a.equals(c)) {
//            System.out.println("Объекты идентичны");
//        } else {
//            System.out.println("Не идентичны");
//        }

//        a = new String("abc");
//
//        if (a == c) {
//            System.out.println("Объекты идентичны");
//        } else {
//            System.out.println("Не идентичны");
//        }
//
//        if (a.equalsIgnoreCase(c)) {
//            System.out.println("Объекты имеют одинаковое значение");
//        } else {
//            System.out.println("Не одинаковое значение");
//        }

//        System.out.println("Выводим на консоль 0");
//        System.out.println("Выводим на консоль 1");
//        System.out.println("Выводим на консоль 2");
//        System.out.println("Выводим на консоль 3");
//        System.out.println("Выводим на консоль 4");
//        System.out.println("Выводим на консоль 5");
//        System.out.println("Выводим на консоль 6");

        int iterator = 0;
//        while(iterator < 10){
//            System.out.println("Выводим на консоль "+iterator);
//            iterator++; // iterator = iterator +1;
//        }

//        iterator = 0;
//        do {
//            System.out.println("Выводим на консоль "+iterator);
//            iterator++; // iterator = iterator +1;
//        }while(iterator < 10);

//        String hello_world = "Привет, мир!";
        char literals[] = new char[11];// {'П','р','и','в','е','т',' ','м','и','р','!'};
        literals[0] = 'П';
        literals[1] = 'р';
        literals[2] = 'и';
        literals[3] = 'в';
        literals[4] = 'е';
        literals[5] = 'т';
        literals[6] = ' ';
        literals[7] = 'м';
        literals[8] = 'и';
        literals[9] = 'р';
        literals[10] = '!';
//        for(int i = 0; i< literals.length; i++){
//            System.out.println("Выводим на консоль литерал: "+literals[i]);
//
////            tmp = i;
//        }

        //{'П','р','и','в','е','т',' ','м','и','р','!'}

        int[] mas = new int[] {1,20,33,41,57};

//        for (char element: literals) {
//            System.out.println("Очередной элемент массива: "+element);
//        }
        //0  1  2  3
        //11 22 33 44  //кол-во 4
//        for (int i = literals.length-1; i >= 0; i--) {
//            System.out.println("Выводим на консоль литерал: " + literals[i]);
//
////            tmp = i;
//        }

        int[][] mas2d = new int[3][3];

        mas2d = new int[][]{{0, 1, 2, 6, 9},
                            {3, 4, 5, 7},
                            {7, 8, 3}};


//        System.out.println("Выводим на консоль "+tmp);

//        System.out.println(mas2d[1][2]);


        //    0 1 2 3 4 5 6 7 8
        //  ------------------------------->
        // 0| 0 1 2
        // 1| 3 4 5
        // 2| 7 8 3
        // 3|
        // 4|
        // 5|
        // 6|
        // 7|
        // 8|
        // V

//        System.out.println(" "+mas2d[0][i]);

        //сверху вниз или снизу вверх идем

//        for(int i =0; i<mas2d.length;i++){
//
//
//            // слева на право или справа налево
//            for(int j = 0; j<mas2d[i].length; j++){
//                System.out.print(" "+mas2d[i][j]);
//            }
//
//            System.out.println();
//
//        }

//        for(int i =mas2d.length - 1; i>=0;--i){
//
//
//            // слева на право или справа налево
//            for(int j = mas2d[i].length-1; j>=0; --j){
//                System.out.print(" "+mas2d[i][j]);
//            }
//
//            System.out.println();
//
//        }


        int aaa = 0;
        int bbb = 6;

        //aaa /= bbb; // aaa = aaa/bbb;

        //  32/10 = 32-10 = 22 - 10 = 12 - 10 = 2

        // 15%6 = 15-6 = 9 - 6 = 3

        // 15%7 = 15-7 = 8 - 7 = 1

        // 14%7 = 14 - 7 = 7 - 7 = 0

        //aaa = 22%2;

        //aaa = 15/6;
        //aaa = 15%6;

        //aaa %= bbb; /// aaa = aaa%bbb


//        if(aaa%2 == 0){
//            System.out.println("Число: "+aaa+" является четным!");
//        }else {
//            System.out.println("Число: "+aaa+" не является четным!");
//        }
//
//        System.out.println(aaa);
//        System.out.println(aaa);



        //~ отрицание или операция НЕ
        //& операция логическая И
        // | - операция логическая ИЛИ
        // ^ - логическая операция исключающее ИЛИ
        // >> - сдвиг вправо
        // << - сдвиг влево
        // >>> сдвиг вправо с заполнением нулями
        //&= Поразрядная И с присваиванием
        // |=  --=-- ИЛИ
        // ^= --=-- исключающая ИЛИ
        // >>=
        // >>>=
        // <<=




        byte x = 50;  //101010110
        //int x = 342;  //101010110
        int y = 42;   //10110
        System.out.println("X = "+Integer.toBinaryString(x));
        System.out.println("Y = "+Integer.toBinaryString(y));

        //(2^8 = 256) (2^7 = 128) (2^6 = 64) (2^5 = 32) (2^4 = 16) (2^3 = 8) (2^2 = 4) (2^1 = 2) (2^0 = 1)
        //        256       0
        //System.out.println("Создали число: "+ (0 + 2 + 4 + 0 + 16 + 0 + 64 + 0 + 256));

        //___________________
        //|Знач A | Знач B |НЕ(~) A| И(&) | ИЛИ(|) | Искл ИЛИ(^)
        //| 0     |    0   |   1   |   0  |   0    |   1
        //| 0     |    1   |   1   |   0  |   1    |   0
        //| 1     |    0   |   0   |   0  |   1    |   0
        //| 1     |    1   |   0   |   1  |   1    |   0
        //|
        //|

        //110010
        //<<
        //0110010 //1 + 0 + 0 + 8 + 16 = 25
        //111111111
        //~
        //000000000
        int n = x<<2;
        System.out.println("N value = "+n+ "\nN binary = "+Integer.toBinaryString(n));



        //2 - 0, 5 - 1

        //i = i-1; // i--    --i




    }
}