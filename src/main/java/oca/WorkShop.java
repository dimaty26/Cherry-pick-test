package oca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Laptop {
    String memory = "1 GB";
}

class Workshop {
    public static void main(String[] args) {
        Laptop life = new Laptop();
        repair(life);
        System.out.println(life.memory);

        String eVal = "123456789";
        //System.out.println(eVal.substring(eVal.indexOf("2"), eVal.indexOf("0")).concat("0"));

        Integer i = new Integer(1);
        String m = "1";
        if (i.equals(m)) System.out.println("equal");   // 1
        else System.out.println("not equal");
    }

    public static void repair(Laptop laptop) {
        laptop.memory = "2 GB";
        String str = "";
        str.concat("as");
        List s = new ArrayList();
        s.add("a");
        List s2 = new ArrayList(s.subList(1, 1));
        filterData(new ArrayList<>(), x -> x.value % 2 == 0);
        boolean b = true | false;
    }

    public static void filterData(ArrayList<Data> dataList, Predicate<Data> p) {
        Iterator<Data> i = dataList.iterator();
        while (i.hasNext()) {
            if (p.test(i.next())) {
                i.remove();
            }
        }
    }

    class Data {
        int value;

        Data(int value) {
            this.value = value;
        }

        public String toString() {
            return "" + value;
        }
    }
}
