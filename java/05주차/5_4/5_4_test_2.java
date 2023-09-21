package org.javaro.lecture;

public class Ex4_test_2 {
	public static void main(String[] args) {
		 int i = 1;
	     int sum = 0;
	        
	     do {
	    	 sum += i;
	    	 i++;
	     } while(i <= 100);
	     System.out.println("1부터 100까지 합=" + sum);
    }
}
