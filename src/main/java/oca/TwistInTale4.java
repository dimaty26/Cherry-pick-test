package oca;

class Employee {
    String run() {
        System.out.println("Emp-run");
        return null;
    }
}

class Programmer extends Employee {
    String run() {
        System.out.println("Programmer-run");
        return null;
    }
}

class TwistInTale4 {
    public static void main(String[] args) {
        new Programmer().run();
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

    interface MyInterface extends BaseInterface1, BaseInterface2 {
        default void getName() throws RuntimeException {
            System.out.println("Just me");
        }
    }
}
