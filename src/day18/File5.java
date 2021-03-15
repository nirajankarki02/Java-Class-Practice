package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//Different way of using try: (TRY WITH RESOURCE)
//Writing Through Byte Stream
public class File5 {
    public static void main(String[] args) throws IOException {
        String readFilePath = "C:/Users/neera/Desktop/NORMA.txt";
        String writeFilePath = "C:/Users/neera/Desktop/Stream Links2.txt" ;


        try(
                FileInputStream fis = new FileInputStream(readFilePath);
                FileOutputStream fos = new FileOutputStream(writeFilePath);
                ) {

            int len;
            while ((len = fis.read())!=-1){
                System.out.println(len);
                fos.write(len);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
