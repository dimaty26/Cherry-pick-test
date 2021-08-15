package oca;

class Super {
    static String ID = "QBANK";

    protected int value;
}

class Sub extends Super {
    static String ID = "QBANK";

    static {
        System.out.print("In Sub");
    }

    public long methodX(byte by) {
        double d = 10.0;
        return (long) ((long) by / d * 3);
    }

    public static void main(String[] args) {
        int a = new Super().value;
        System.out.println(new Sub().value);
    }
}

public class Test {
    static char c = '\u0102';

    public static void main(String[] args) {
        System.out.println(Sub.ID);
        System.out.println(c);

        System.out.println(new Super().value);
        System.out.println(new Sub().value);

        char i;
        LOOP:
        for (i = 0; i < 5; i++) {
            switch (i++) {
                case '0':
                    System.out.println("A");
                case 1:
                    System.out.println("B");
                    break LOOP;
                case 2:
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("D");
                    break;
                case 4:
                    System.out.println("E");
                case 'E':
                    System.out.println("F");
            }
        }

        switch (5) {
            default:
            case 1:
                System.out.println(1);
            case 0:
                System.out.println(0);
            case 2: {
                System.out.println(2);
                System.out.println(4);
                System.out.println(5);
                System.out.println(6);
                break;
            }
            case 3:
                System.out.println(3);
        }


        changeIt(str);
        System.out.println(str);

        byte be = (byte) 320;
        System.out.println(be);

        char ik = 3;
        double doi = 3.0;

        System.out.println(doi == ik);

        System.out.println(new MyClass().value);
    }

    static class MyClass {

        protected int value = 10;

    }

    void crazyLoop() {
        int c = 0;
        JACK:
        while (c < 8) {
            JILL:
            c = 3;
            System.out.println(c);
            if (c > 3) break JACK;
            else c++;
        }
    }

    static String str = "Hello World";

    public static void changeIt(String s) {
        str = "Good bye world";
    }
}
