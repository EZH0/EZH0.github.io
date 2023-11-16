package org.javaro.lecture;
import java.io.*;
class Ex11_10 {
    public static void main(String[] args) {
        String s = new String();
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\Public\\Documents\\write.txt");
            InputStreamReader uin = new InputStreamReader(fin, "utf-8");

            int c;
            while ((c = uin.read()) != -1) {
                s = s + (char)c;
            }
            System.out.println(s);
            fin.close();
        } catch(IOException ioe) {
            System.out.println("파일 입출력 오류");
        } catch(Exception e) {
            System.out.println("파일 입출력 예외 발생");
        }
    }
}
