package testMentor;

import java.util.TreeMap;

public class RomanNumber {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(1000000, "Ṁ");
        map.put(900000, "ĆṀ");
        map.put(500000,"Ď");
        map.put(400000,"ĆĎ");
        map.put(100000,"Ć");
        map.put(90000,"ẊĆ");
        map.put(50000,"Ĺ");
        map.put(40000,"ẊĹ");
        map.put(10000, "Ẋ");
        map.put(9000, "MẊ");
        map.put(5000, "Ṽ");
        map.put(4000, "MṼ");
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
}
