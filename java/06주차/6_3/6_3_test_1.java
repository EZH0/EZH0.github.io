package org.javaro.lecture;

public class Ex5_test_1 {
	public static void main(String[] args) {

       int max = 30;
       for(int i = 2;i<=max;i++) {
           boolean isit = true;
           for(int j = 2;j<i;j++) {
        	   if(i%j==0) {
        		   isit = false;
        		   break;
        	   }   
           }
           if(isit) {
        	   System.out.println(i);
           }
       }
   }
}
