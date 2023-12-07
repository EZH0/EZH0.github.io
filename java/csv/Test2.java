package javatest;
import java.io.*;
public class Test2 {
    public static void main(String[] args) {
        float[][] indat = new float[10][3];
        try {
            File csv = new File("C:\\Users\\Public\\123\\\\1.csv");
            BufferedReader br = new BufferedReader(new FileReader(csv));
            
            String line = null;
            int row=0;
            do {
                line = br.readLine(); // 한 줄 읽기
                if(line!=null){
                    String[] token = line.split(",", -1); // 한 줄을 쉼표로 분할
                    for(int i=0; i<3; i++) indat[row][i] = Float.parseFloat(token[i]);
                    // CSV에서 읽어온 문자열들을 파싱하여 float 형으로 변환
                    for(int i=0; i<3; i++) System.out.print(indat[row][i] + ", ");
                    System.out.println("");
                    row++;
                }
            } while(line != null);
            br.close();

            FileOutputStream out = new FileOutputStream("C:\\\\Users\\\\Public\\\\123\\\\\\\\2.csv");
            for(int i=0; i<10; i++) {
                for(int j=0; j<3; j++) {
                    out.write(Float.toString(indat[i][j]).getBytes("utf-8"));
                    out.write(",".getBytes("utf-8"));
                }
                out.write("\n".getBytes("utf-8"));
            }
            out.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
