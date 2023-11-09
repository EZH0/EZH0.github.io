package org.javaro.lecture;
import java.io.*;

class Ex11_1 {
    public static void main(String[] args) {
        String s = new String();
        try {
            FileReader fin = new FileReader("C:\\Users\\Public\\Documents\\test.txt");
            int c;
            while((c = fin.read()) != -1) {
                s = s + (char)c;
            }
            System.out.println(s);
            fin.close();
        } catch(IOException ioe) {
            System.out.println("파일없음");
        } catch(Exception e) {
            System.out.println("파일지정 하세요");
        }
    }
}
