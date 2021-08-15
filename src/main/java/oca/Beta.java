package oca;

import java.io.IOException;

class Baap {
    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class Beta extends Baap implements IInt {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) throws IOException {


        Baap b = new Beta();
        System.out.println(b.h);
        System.out.println("b.h: " + b.h + " " + b.getH());
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());

        String s = "MINIMUM";
        System.out.println(s.substring(4, 7)); //1
        System.out.println(s.substring(5)); //2
        System.out.println(s.substring(s.indexOf('I', 3))); //3
        Beta ss = new Beta();  //1
        int j = ss.thevalue;       //2
        int k = IInt.thevalue;    //3
        int l = thevalue;         //4

        StringBuilder sb = new StringBuilder("How are you?");
        System.out.println("Hello, " + sb);


        int i = 0;
        int[] iA = {10, 20};
        iA[i] = i = 30;
        System.out.println("" + iA[0] + " " + iA[1] + "  " + i);

//        int c = 0;
//        JACK: while (c < 8){
//            System.out.println(c);
//            JILL: if (c > 3) {
//                break JILL;
//            } else {
//                c++;
//            }
//        }

        char cha = 1;
        printSum('a', cha);

        int g = 1_3;

        int[] a = {1, 2, 3, 4};
        int[] ba = {2, 3, 1, 0};
        System.out.println(a[(a = ba)[3]]);
        System.out.println(a[0]);
    }

    public static void printSum(double a, double b) {
        System.out.println("In double " + (a + b));
    }

    public static void printSum(float a, float b) {
        System.out.println("In float " + (a + b));
    }

    public static void printSum(int a, int b) {
        System.out.println("In int " + (a + b));
    }

    public static void printSum(char a, char b) {
        System.out.println("In char " + (a + b));
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println("In Integer " + (a + b));
    }
}

interface IInt {
    int thevalue = 0;
}


class Base {
    public short getValue() {
        return 1;
    } //1

    public long valid() throws Exception {
        return 1l;
    }
}

class Base2 extends Base {
    public short getValue() {
        return 2;
    } //2

    public long valid() {
        return 1l;
    }
}
