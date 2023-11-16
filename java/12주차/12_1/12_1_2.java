package org.javaro.lecture;
import java.io.*;
class Ex11_2 {
    public static void main(String [] args) {
        try {
        	FileWriter fout = new FileWriter("C:\\Users\\Public\\Documents\\write.txt");
            int a=10, b=5;
            fout.write("여기에 a+b=" + (a+b) + "\n");
            fout.write("여기에 a-b=" + (a-b) + "\n");
            fout.close();
            System.out.println("파일 쓰기 완료");
        } catch(Exception e) {
            System.out.println("파일 쓰기 예외 발생");
        }
    }
}
