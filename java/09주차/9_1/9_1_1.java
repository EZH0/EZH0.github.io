package org.javaro.lecture;

public class Ex7_5 {
    // 객체 프로그램
    public static void main(String[] args) {
        Vadd5 add1 = new Vadd5();

        add1.x = 10.0; // 보안 취약
        add1.y = 20.0;

        double add_value = add1.fn_add();
        System.out.println("Col=" + add_value);
    }
}

class Vadd5 {
    double x, y;

    Vadd5() {
        // 생략가능
    }

    public double fn_add() {
        double result;
        result = this.x + this.y;
        return result;
    }
}
