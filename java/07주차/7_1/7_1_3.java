package org.javaro.lecture;

public class Ex6_6 {
    
    public static void main(String[] args) {
        double x, y; // 1, 2
        x = 10.0;
        y = 20.0;

        double add_value = fn_add(x, y);
        System.out.println("더하기=" + add_value);
    }

    public static double fn_add(double x, double y) {
        double result;
        result = x + y;
        return result;
    }
}

