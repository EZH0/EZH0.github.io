package org.javaro.lecture;
import java.io.*;

public class Ex11_test_1 {
    public static void main(String[] args) {
    	byte[] data1 = {67, 79, 77, 80, 85, 84, 69, 82};
    	byte[] data2 = {68, 65, 69, 74, 69, 79, 78, 32, 75, 79, 82, 69, 65};
        for(int i=0; i<8; i++) 
        	System.out.print((char)data1[i]);
        System.out.println();
        for(int i=0; i<13; i++) 
        	System.out.print((char)data2[i]);
    }
}
