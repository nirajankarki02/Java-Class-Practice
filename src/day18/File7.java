package day18;

import java.io.*;

public class File7 {

    //Now Write LINE BY LINE
    public static void main(String[] args) throws IOException {
        String readFilePath = "C:/Users/neera/Desktop/NORMA.txt";
        String writeFilePath = "C:/Users/neera/Desktop/Stream Links5.txt" ;


        try(
                FileReader fr = new FileReader(readFilePath);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(writeFilePath);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {

            String len;
            while ((len = br.readLine())!= null){
                System.out.println(len);
                bw.write(len);
                bw.newLine();
                bw.flush();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
