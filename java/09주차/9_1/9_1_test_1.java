package org.javaro.lecture;

public class Ex7_test_1 {

	public static double multiply(double a, double b) {
	    return a * b;
	}
	
	public static double rectangleArea(double length, double width) {
	    return length * width;
	}
	
	public static double triangleArea(double base, double height) {
	    return 0.5 * base * height;
	}
	
    public static void main(String[] args) {
    	
    	System.out.println("절차 프로그램");
    	double a = 10.0;
    	double b = 20.0;
    	double result = a * b;
    	System.out.println("multply 10* 20: " + result);

    	double length = 10.0;
    	double width = 5.0;
    	double areaRectangle = length * width;
    	System.out.println("length: 10, width: 5, area of square: " + areaRectangle);

    	double base = 10.0;
    	double height = 5.0;
    	double areaTriangle = 0.5 * base * height;
    	System.out.println("height: 10, base: 5, area of triangle: " + areaTriangle);
    	
    	
    	System.out.println("함수 프로그램");
    	System.out.println("multply 10* 20: " + multiply(10.0, 20.0));
    	System.out.println("length: 10, width: 5, area of square: " + rectangleArea(10.0, 5.0));
    	System.out.println("height: 10, base: 5, area of triangle: " + triangleArea(10.0, 5.0));
    	
    	
    	System.out.println("객체 프로그램");
    	Calculator1 calc = new Calculator1();
    	calc.multiply(10.0, 20.0);
    	System.out.println("multply 10* 20: " + calc.result);
    	calc.rectangleArea(10.0, 5.0);
    	System.out.println("length: 10, width: 5, area of square: " + calc.result);
    	calc.triangleArea(10.0, 5.0);
    	System.out.println("height: 10, base: 5, area of triangle: " + calc.result);
    	
    	
    	System.out.println("자바빈 프로그램");
    	CalculatorBean calcBean = new CalculatorBean();
    	calcBean.setA(10.0);
    	calcBean.setB(20.0);
    	System.out.println("곱하기: " + calcBean.multiply());
    	calcBean.setA(10.0);
    	calcBean.setB(5.0);
    	System.out.println("사각형의 면적: " + calcBean.rectangleArea());
    	System.out.println("삼각형의 면적: " + calcBean.triangleArea());
    }
    static class Calculator1 {
        double result;

        void multiply(double a, double b) {
            result = a * b;
        }

        void rectangleArea(double length, double width) {
            result = length * width;
        }

        void triangleArea(double base, double height) {
            result = 0.5 * base * height;
        }
    }
    static class CalculatorBean {
        private double a;
        private double b;

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double multiply() {
            return a * b;
        }

        public double rectangleArea() {
            return a * b;
        }

        public double triangleArea() {
            return 0.5 * a * b;
        }
    }
}


