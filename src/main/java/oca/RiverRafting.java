package oca;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FallInRiverException extends Exception {
}

class RiverRafting {
    void crossRapid(int degree) throws FallInRiverException {
        System.out.println("Cross Rapid");
        if (degree > 10) throw new FallInRiverException();
    }
}

class TestRiverRafting {
    public static void main(String[] args) {
        RiverRafting riverRafting = new RiverRafting();
        try {
            riverRafting.crossRapid(9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
            fis.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("file not found");
        } catch (IOException ioe) {
            System.out.println("IOException");
        }
        int a = 10;
        int y = a++;
        int z = y--;
        int x1 = a - 2 * y - z;
        System.out.println(x1);
        System.out.println(0.0 / (0 + 10));

        int[] eArr5;
        eArr5 = new int[]{10, 20};

        int ctr = 10;
        char[] arrC1 = new char[]{'P', 'a', 'u', 'l'};
        char[] arrC2 = {'H', 'a', 'r', 'r', 'y'};
        for (char c1 : arrC1) {
            for (char c2 : arrC2) {
                if (c2 == 'a') continue;
                ++ctr;
            }
        }
        System.out.println(ctr);
    }
}
