package org.javaro.lecture;
import java.io.*;
class Ex11_11 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\Public\\Documents\\write.txt");
            InputStreamReader uin = new InputStreamReader(fin, "utf-8");
            
            int c;
            while ((c = uin.read()) != -1) {
                System.out.print((char)c);
            }
            fin.close();
        } catch(IOException ioe) {
            System.out.println("파일 입출력 오류");
        } catch(Exception e) {
            System.out.println("파일 입출력 예외 발생");
        }
    }
}
