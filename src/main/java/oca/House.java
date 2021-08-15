package oca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class House extends Book {

    static class Phone {
        public Phone() {
            //can't be a recursive constructor
            //this();
        }

        String phoneNumber = "123456789";

        void setNumber() {
            String phoneNumber;
            phoneNumber = "987654321";
        }
    }

    void getBook() {
        Book book = new Book();
        System.out.println(book.author);
    }

    interface MyInterface {
    }

    static class MyClass1 implements MyInterface {
    }

    static abstract class Vehicle {
    }

    static class Car extends Vehicle {
    }

    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<String>();
        String one = "One";
        String two = "Two";
        myArrList.add(one);
        myArrList.add(two);
        ArrayList<String> yourArrList = myArrList;
        one += one.replace("O", "B");
        for (String val : myArrList)
            System.out.print(val + ":");
        for (String val : yourArrList)
            System.out.print(val + ":");
        LocalTime time = LocalTime.parse("12:09:32");
        System.out.println(time.plusHours(1));
        int worldRecord = 20;
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
            System.out.println("New world record");
        else
            System.out.println("Try harder");

        System.out.println(Period.parse("P4W"));

        LocalDateTime dateTime = LocalDateTime.parse("2051-01-01T14:18:36");
        System.out.println(dateTime.plus(Period.ofMonths(1)));

        Period period = Period.of(2, 40, 40);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("MM-yyyy-dd");
        LocalDate date = LocalDate.parse("01-2057-29", d1);
        System.out.println(date);

        int[] arr = new int[5];
//        byte b = 4; char c = 'c'; long longVar = 10;
//        arr[0] = b;
//        arr[1] = c;
//        arr[3] = (int) longVar;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);

        StringBuilder sb1 = new StringBuilder("123456");
        sb1.subSequence(2, 4);
        sb1.deleteCharAt(3);
        sb1.reverse();
        System.out.println(sb1);

        String printDate = LocalDate.parse("2057-08-11")
                .format(DateTimeFormatter.ISO_DATE);
        System.out.println(printDate);

        boolean allow = false;
        if (allow = true)
            System.out.println("value is true");
        else
            System.out.println("value is false");

        long bill = 1000L;
        System.out.println(bill);

        Integer value = 10;
        switch (value) {
            default:
                System.out.println("value is not 10");
                break;
            case 10:
                System.out.println("value is 10");
                break;
        }

        int i = 10;
        do
            while (i++ < 15)
                i = i + 20;
        while (i < 2);
        System.out.println(i);

        int num = 10;
        final int num2 = 20;
        switch (num) {
            case 10 / 3:
                System.out.println(4);
                break;
            default:
                System.out.println("default");
        }

        int ctr = 12;
        for (int j = 10, k = 14;
             j <= k;
             ++j, k = k - 1, ctr--) {
            System.out.println(j + ":" + k + ":" + ctr);
        }

        int[] myArr = {
                1, 2, 3
        };
        for (int val : myArr)
            System.out.println(val);
        for (int val : myArr)
            System.out.println(++val);
        for (int val : myArr)
            System.out.println(val);

        System.out.println(10 / 3);

        byte foo = 120;
        switch (foo) {
            default:
                System.out.println("ejavaguru");
                break;
            case 2:
                System.out.println("e");
                break;
            case 120:
                System.out.println("ejava");
            case 121:
                System.out.println("enum");
            case 127:
                System.out.println("guru");
                break;
        }
    }

    private interface Runner {
        class Bob {
        }
    }

    interface BaseInterface1 {
        default void getName() {
            System.out.println("Base 1");
        }
    }

    interface BaseInterface2 {
        default void getName() {
            System.out.println("Base 2");
        }
    }

    interface MyInterface2 extends BaseInterface1, BaseInterface2 {
        default void getName() {
            BaseInterface1.super.getName();
            System.out.println("Just me");
        }
    }

}
