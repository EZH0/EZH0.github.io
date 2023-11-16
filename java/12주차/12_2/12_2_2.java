package org.javaro.lecture;
import java.io.*;
/**
 * 
 */
class Ex11_6 {
    public static void main(String[] args) {
        byte data[] = {75,79,82,69,65};
        try {
            // WRITE
            FileOutputStream fout = new FileOutputStream("C:\\Users\\Public\\Documents\\bytewriteX.txt");
            for(int i=0; i<5; i++) fout.write(data[i]);
            fout.close();
            // READ
            FileInputStream fin = new FileInputStream("C:\\Users\\Public\\Documents\\bytewriteX.txt");
            int c;
            while((c=fin.read())!=-1) {
                System.out.print(c);
            }
            fin.close();
        } catch(IOException ioe) {
            System.out.println("파일 입출력 오류");
        } catch(Exception e) {
            System.out.println("파일 입출력 예외 발생");
        }
    }
}
