package org.javaro.lecture;

public class Ex8_17 {
    public static void main(String[] args) {
        WebCount3 c1 = new WebCount3();
        WebCount3 c2 = new WebCount3();
        System.out.println(WebCount3.getCount());
    }
}

class WebCount3 {
    static int count = 0;

    WebCount3() {
        count++;
        System.out.println(count);
    }

    public static int getCount() {
        return count;
    }
}
