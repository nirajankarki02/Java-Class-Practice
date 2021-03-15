package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File4 {
//Write from NORMS.txt to Stream Links.txt
    public static void main(String[] args) throws IOException {
        String readFilePath = "C:/Users/neera/Desktop/NORMA.txt";
        String writeFilePath = "C:/Users/neera/Desktop/Stream Links.txt" ;
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(readFilePath);
            fos = new FileOutputStream(writeFilePath);
            int len;
            while ((len = fis.read())!=-1){
                System.out.println(len);
                fos.write(len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            fis.close();
            fos.close();

        }
    }
}
