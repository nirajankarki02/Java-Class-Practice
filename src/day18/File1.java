package day18;

import java.io.File;
import java.io.IOException;

public class File1 {
//CREATE FILE name "Demo.txt"
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/neera/Desktop/Demo.txt";
        File file = new File(filePath);
        //Might have to use try catch to handle exception here
        if (file.createNewFile()){
            System.out.println("file Created...........");
        }
        else{
            System.out.println("file already exists.....");
        }
    }
}
