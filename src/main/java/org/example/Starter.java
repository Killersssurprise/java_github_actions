package org.example;

import org.example.calc.Calculator;
import org.example.exceptions.NoMathParameterException;
import org.example.parameter.Gen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Starter {

    public static void main(String[] args) throws NoMathParameterException {

        int aaaaa = 10;

//
//        BaseBook myBook = new BaseBook("Vasya Pupkin", 1970, "Бытие мое");
////        BaseBook book2 = new BaseBook("Vasya Pupkin", "Какое бытие твое?");
//
//
//        PaperBook pb = new PaperBook("Vasya Pupkin", 1965, "Моя истори11111");
//        pb.setAuthor("Vasya Pupkin");
//        pb.setMaterial_type("Бумага");
//        pb.setWeight(4.2f);
////        pb.print();
//
//        ElectronicBook eb = new ElectronicBook("Vasya Pupkin", 1966, "История2222", 34);
////        eb.print();
//
//        BaseBook someBook = new PaperBook("Vasya Pupkin", 1966, "История3333");
////        BaseBook.print(someBook);
//
//        BaseBook[] books = new BaseBook[3];
//
//        books[0] = pb;
//        books[1] = eb;
//        books[2] = someBook;
//
//
//        for (BaseBook b : books) {
//            b.print();
//            System.out.println();
//        }
//
//        IBook iBook = eb;
//
//        iBook.getPagesCount();
//        iBook.getDescription();
//
//        OnDownload onDownload = eb;
//
//        onDownload.download();
//
//
//        OnDownload callback = new OnDownload() {
//            @Override
//            public void onDownloadedComplete() {
//                System.out.println("Книга загружена! ");
//            }
//
//            @Override
//            public void onDownloadFail() {
//                System.out.println("Книга не загружена! ");
//            }
//
//            @Override
//            public void download() {
//                System.out.println("Загружаем книгу! ");
//            }
//        };
//
//        connectToTheServer(callback);
//
//
////        BaseBook.print(myBook);
////        BaseBook.print(book2);
//
//    }
//
//
//     static void connectToTheServer(OnDownload callback){
//        ///Логика обращения к серверу
//
//        long dt = System.currentTimeMillis();
//
//        boolean isFail = false;
//
//        if(dt%2==0){
//            isFail = true;
//        }
//
//
//        //ответ от базовой логики
//        if(isFail){
//            callback.onDownloadFail();
//        }else{
//            callback.onDownloadedComplete();
//        }
//
//        ///
//
//


//        BasePlane testPlane = new TestPlane();
//
//        System.out.println("Наш тип мотора: "+testPlane.getEngine().getName());
//
//
//        BasePlane.PlaneFabric planeFabric = new BasePlane.PlaneFabric();
//
//        BasePlane somePlane = new BasePlane().setName("Имя").setType(BasePlane.LORRY).setEngine(new JetEngineModel26());
//        BasePlane somePlane2 = new BasePlane().setName("Имя 2").setType(BasePlane.LORRY).setEngine(new GasEngineModel5());
//        BasePlane somePlane3 = new BasePlane().setName("Имя 4").setType(BasePlane.LORRY).setEngine(new GasEngineModel5());

//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введите первое число");
//        int a = 0;
//
//
//
//        try {
//            a = in.nextInt();
//
////            Exception myException = new Exception("Моя личная ошибка!");
////            throw myException;
//
//
//        }catch(InputMismatchException e) {
//            System.out.println("Первое число введено некорректно, не совпадает тип переменной! Попробуйте ввести целое число!");
//            System.exit(-1);
//        }
//        catch (Exception e){
//            System.out.println("Ошибка программы, перезапустите!");
//            e.printStackTrace();
//            System.exit(-1);
//        }
//
//        System.out.println("Введите второе число");
//
//        int b = 0;
//
//        try {
//            b = in.nextInt();
//        }catch (Exception e){
//            e.printStackTrace();
//            System.exit(-1);
//        }
//
//        System.out.println("Введите математическую операцию");
//        char c = in.next().charAt(0);
//
//        if(c!='+' || c!= '-' || c!='*' || c!='/'){
//            throw new NoMathParameterException();
//        }
//
//
//        switch(c){
//
//            case '+':{
//                System.out.println("Сумма чисел: "+sum(a,b));
//                break;
//            }
//            case '-':{
//                System.out.println("Разность чисел: "+substraction(a,b));
//                break;
//            }
//            case '*':{
//                System.out.println("Произведение чисел: "+multiplication(a,b));
//                break;
//            }
//            case '/':{
//                System.out.println("Деление чисел: "+div(a,b));
//                break;
//            }
//            default:{
//                System.out.println("Я не знаю этот оператор...");
//                break;
//            }
//
//        }


//        List<Month> month = new ArrayList<>();
//
////        month.add("January");
////        month.add("February");
////        month.add("March");
////        month.add("April");
//
//        month.add(new Month("January", 1));
//        month.add(new Month("February", 2));
//        month.add(new Month("March", 3));
//        month.add(new Month("April", 4));
//
//
//        for (int i = 0; i < month.size(); i++) {
//            System.out.println(month.get(i).toString());
//        }

//        Gen<Integer, Integer> iOb;
//
//        iOb = new Gen<>(99, 99);
//
//        iOb.showType();
//
//        HashMap<Integer, String> monthes= new HashMap<>();
//
//        monthes.put(1, "January");
//        monthes.put(2, "Fabruary");
//        monthes.put(3, "March");
//        monthes.put(4, "April");
//
//
//        System.out.println("Для ключа "+2+" значением является "+monthes.get(2));


//        System.out.println("Сумма двух чисел равна: "+(Calculator.sum(2,3)));
//
//        int value = Calculator.sum(2,3);
//
//        if(value!=5){
//            System.err.println("АХТУНГ, ЧТО-ТО СЛОМАЛОСЬ!");
//        }


    }

//    static class Month{
//        String title;
//        int yearPosition;
//
//        public Month(String title, int yearPosition) {
//            this.title = title;
//            this.yearPosition = yearPosition;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public int getYearPosition() {
//            return yearPosition;
//        }
//
//        @Override
//        public String toString() {
//            return "Month{" +
//                    "title='" + title + '\'' +
//                    ", yearPosition=" + yearPosition +
//                    '}';
//        }
//    }

//    static int sum(int a, int b) {
//        return a + b;
//    }
//
//    static int div(int a, int b) {
//        return a / b;
//    }
//
//    static int substraction(int a, int b) {
//        return a - b;
//    }
//
//    static int multiplication(int a, int b) {
//        return a * b;
//    }


}
