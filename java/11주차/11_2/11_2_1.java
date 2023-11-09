package org.javaro.lecture;
class Ex9_4 { /* Area 클래스의 면적 계산(인스턴스)를 사용한 사용 */
    public static void main(String[] args) {
        double sum;
        float x, y, z;
        x = Float.parseFloat(args[0]);
        y = Float.parseFloat(args[1]);
        z = Float.parseFloat(args[2]);
        AreaTest1 object1 = new AreaTest1(x); // 객체 생성
        sum = object1.CalArea(x);
        System.out.println("원 면적은 " + sum + "입니다");
        AreaTest1 object2 = new AreaTest1(x, y); // 객체 생성
        sum = object2.CalArea(x, y); // 면적 계산
        System.out.println("사각형 면적은 " + sum + "입니다");
        AreaTest2 object3 = new AreaTest2(x, y, z); // 객체 생성
        sum = object3.CalArea(x, y, z); // 면적 계산
        System.out.println("육면체는 " + sum + "입니다");
        object3.rtcal(x, y); object3.rhcal(x, y); object3.cccal(x);
    }
}
class AreaTest1 { // Area + volume
    float width, height, depth; // 변수 선언

    public AreaTest1(float h) { // 생성자 오버로딩
        height = h;
    }

    public AreaTest1(float h, float w) { // 생성자 오버로딩
        height = h;
        width = w;
    }

    public double CalArea(float a) { // 원 면적 계산
        double sum1;
        sum1 = a * a * 3.14;
        return sum1;
    }

    public float CalArea(float a, float b) { // 사각형 면적 계산
        float sum2;
        sum2 = a * b;
        return sum2;
    }
}
interface RectangleCal {
    // float base = 10.0, height = 20.0;
    public float rtcal(float b, float h);
}

interface RhombusCal {
    // float diagonal1 = 5.0, diagonal2 = 4.5;
    public float rhcal(float d1, float d2);
}

interface AreaCal extends RectangleCal, RhombusCal {
}

interface CircleCal {
    // float radius = 10.0;
    double cccal(float r);
}
class AreaTest2 extends AreaTest1 implements AreaCal, CircleCal {
    public AreaTest2(float h, float w, float d) { // 생성자 overriding
        super(h, w);
        depth = d;
    }

    public float CalArea(float a, float b, float c) { // 육면체의 면적
        float sum3;
        sum3 = (a * b) * c;
        return sum3;
    }

    public float rtcal(float a, float b) {
        float rtarea;
        rtarea = a * b;
        System.out.println("사각형의 면적은 " + rtarea + "입니다");
        return rtarea;
    }

    public float rhcal(float a, float b) {
        float rharea;
        rharea = a * b / 2;
        System.out.println("마름모의 면적은 " + rharea + "입니다");
        return rharea;
    }

    public double cccal(float a) {
        double ccarea;
        ccarea = a * a * 3.14;
        System.out.println("원의 면적은 " + ccarea + "입니다");
        return ccarea;
    }
}
