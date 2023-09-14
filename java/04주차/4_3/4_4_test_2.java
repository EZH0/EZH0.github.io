package org.javaro.lecture;

public class test2 {
    public static void main(String[] args) {
        int a = 100, b = 100;
        
        System.out.println("a와 b는 같은 크기?" + (a==b));
    	
    	System.out.println("a가 b보다 큰가요?" + (a>b));
    	
    	System.out.println("a=b이고 a>30인가요?" + ((a==b)&&(a>b)));
    	
    	System.out.println("a가 50이 아닌가요?" + !(a==50));
    	
    	a = 100;
    	b = 50;
    	System.out.println("a>b?" + ((a>b)?a:b));
    	
    	double aa = Math.pow(2.0, 32.0); //2.0의 32제곱
    	System.out.println("2.0의 32.0제곱은 " + (int)aa +"입니다");
    	
    }
}
