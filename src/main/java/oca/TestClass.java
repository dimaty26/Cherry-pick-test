package oca;

import java.util.function.Predicate;

class Employee1 {
    int age;   //1
}

public class TestClass {

    static Integer t;

    public static boolean validateEmployee(Employee1 e, Predicate<Employee1> p) {
        return p.test(e);
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1(); //2
        System.out.println(validateEmployee(e, emp -> emp.age < 10000)); //3
        System.out.println(t);
        for (int i = 0; i < args.length; i++) System.out.print(i == 0 ? args[i] : " " + args[i]);

        String a = "10";
        new TestClass().probe(a);
    }

    void probe(Object x) {
        System.out.println("In Object");
    } //3

    void probe(Number x) {
        System.out.println("In Number");
    } //2

    void probe(Integer x) {
        System.out.println("In Integer");
    } //2

    void probe(Long x) {
        System.out.println("In Long");
    } //4
}
