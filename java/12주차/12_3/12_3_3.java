package org.javaro.lecture;
import java.io.*;
public class Ex11_12 {
    public static void main(String[] args) {
        float[][] indat = new float[10][3];
        try {
            File csv = new File("C:\\Users\\Public\\Documents\\1.csv");
            BufferedReader br = new BufferedReader(new FileReader(csv));

            String line = "";
            int row = 0, i;
            while ((line = br.readLine()) != null) {
                String[] token = line.split(",", -1);
                for(i=0; i<3; i++){
                    indat[row][i] = Float.parseFloat(token[i]);
                }
                for(int j=0; j<3; j++) System.out.print(indat[row][j] + " ");
                System.out.println("");
                row++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
