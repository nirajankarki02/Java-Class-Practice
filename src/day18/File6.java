package day18;

import java.io.*;

public class File6 {
    //Through CHARACTER STREAM
    public static void main(String[] args) throws IOException {
        String readFilePath = "C:/Users/neera/Desktop/NORMA.txt";
        String writeFilePath = "C:/Users/neera/Desktop/Stream Links3.txt" ;


        try(
                FileReader fr = new FileReader(readFilePath);
                FileWriter fw = new FileWriter(writeFilePath);
        ) {

            int len;
            while ((len = fr.read())!=-1){
                System.out.println(len);
                fw.write(len);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
