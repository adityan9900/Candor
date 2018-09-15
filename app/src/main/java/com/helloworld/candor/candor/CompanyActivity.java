package com.helloworld.candor.candor;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class CompanyActivity {
    public static final double aPlus = 83.70;
    public static final double am = 60.00;
    public static final double aMinus = 48.30;
    public static final double bPlus = 43.20;
    public static final double bm = 38.10;
    public static final double bMinus = 31.80;
    public static final double cPlus = 27.50;
    public static final double cm = 20.70;
    public static final double cMinus = 15.00;
    public static final double dPlus = 9.80;
    public static final double dm = 5.60;
    public static final double dMinus = 3.90;
    public static final double fm = 0.80;

    HashMap<String, Double> hmap = new HashMap<>();

    public CompanyActivity () {
        hmap.put("Cisco Systems", 83.70);
        hmap.put("Ecolab", 81.60);
        hmap.put("Hasbro", 80.00);
    }

    public double getScoreNum(String x) {
        if (hmap.containsKey(x)) {
            return hmap.get(x);
        }
        return -1.0;
    }

    public String getScoreGrade(String x) {
        if (getScoreNum(x)>60.00) {
            return "A+";
        }
        else if (getScoreNum(x)>48.30) {
            return "A";
        }
        else if (getScoreNum(x)>43.20) {
            return "A";
        }
        else if (getScoreNum(x)>38.10) {
            return "B+";
        }
        else if (getScoreNum(x)>31.80) {
            return "B";
        }
        else if (getScoreNum(x)>27.50) {
            return "B-";
        }
        else if (getScoreNum(x)>20.70) {
            return "C+";
        }
        else if (getScoreNum(x)>15.00) {
            return "C";
        }
        else if (getScoreNum(x)>9.80) {
            return "C-";
        }
        else if (getScoreNum(x)>5.60) {
            return "D+";
        }
        else if (getScoreNum(x)>3.90) {
            return "D";
        }
        else if (getScoreNum(x)>0.80) {
            return "D-";
        }
        return "F";
    }

    public String getCompNameNum(double x) {
        if (hmap.containsValue(x)) {
            String m = "";
                for ( String key : hmap.keySet() ) {
                    if (hmap.get(key) ==  x) {
                        m += key + "\n";
                    }
                }
            return m;

        }
        else if (x > 100 || x < 0) {
            return "That's not a valid value";
        }
        else if (!hmap.containsValue(x)) {
            String d = "";
            double count = 0.1;
            boolean status = true;
            while (status) {
                for ( String key : hmap.keySet() ) {
                    if (hmap.get(key) ==  x + count) {
                        d += key;
                        status = false;
                    }
                }
                count += 1;
            }
            return d;
        }
        else {
            return "Sorry there's an error";
        }
    }

    public String getCompNameLetter(String x) {
        String compare = x.toLowerCase();
        if (compare.equals("a+")) {
            return getCompNameNum(83.70);
        }
        else if (compare.equals("a")) {
            return getCompNameNum(60.00);
        }
        else if (compare.equals("a-")) {
            return getCompNameNum(48.30);
        }
        else if (compare.equals("b+")) {
            return getCompNameNum(43.20);
        }
        else if (compare.equals("b")) {
            return getCompNameNum(38.10);
        }
        else if (compare.equals("b-")) {
            return getCompNameNum(31.80);
        }
        else if (compare.equals("c+")) {
            return getCompNameNum(27.50);
        }
        else if (compare.equals("c")) {
            return getCompNameNum(20.70);
        }
        else if (compare.equals("c-")) {
            return getCompNameNum(15.00);
        }
        else if (compare.equals("d+")) {
            return getCompNameNum(9.80);
        }
        else if (compare.equals("d")) {
            return getCompNameNum(5.60);
        }
        else if (compare.equals("d-")) {
            return getCompNameNum(3.90);
        }
        else if (compare.equals("f")) {
            return getCompNameNum(0.80);
        }
        else {
            return "That isn't a valid letter grade";
        }
    }

    public String getLowest() {
        return "1. Windstream Holdings\n" +
                "2. World Fuel Services\n +" +
                "3. XPO Logistics";
    }

    public String getHighest() {
        return "1. Cisco Systems\n" +
                "2. Ecolab\n +" +
                "3. Hasbro";
    }
}