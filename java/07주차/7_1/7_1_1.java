package org.javaro.lecture;

public class Ex6_4 {

    public static void main(String[] args) {
        double x, y, area; // 밑변, 높이, 면적
        int idx; // idx==직사각형, idx=-직삼각형

        x = 10;
        y = 20;
        idx = 1; // 직사각형
        area = fn_area(idx, x, y);
        System.out.println("사각형 면적: " + area);

        idx = 2; // 삼각형
        area = fn_area(idx, x, y);
        System.out.println("삼각형 면적: " + area);
    }

    static double fn_area(int a, double b, double c) {
        double result = 0;
        if (a == 1) {
            result = b * c;
        } else if (a == 2) {
            result = 0.5 * b * c;
        }
        return result;
    }
}
