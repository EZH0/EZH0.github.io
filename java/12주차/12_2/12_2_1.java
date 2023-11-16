package org.javaro.lecture;
import java.io.*;

class Ex11_5 {
    public static void main(String[] args) {
        byte[] data = {75,79,82,69,65}; // KOREA

        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\Public\\Documents\\bytewrite.txt");
            fout.write(data);
            for(int i=0; i<5; i++) System.out.print(data[i]);
            for(int i=0; i<5; i++) System.out.print((char)data[i]);
            fout.close();
        } catch(IOException ioe) {
            System.out.println("파일 입출력 오류");
        } catch(Exception e) {
            System.out.println("파일 입출력 예외 발생");
        }
    }
}
