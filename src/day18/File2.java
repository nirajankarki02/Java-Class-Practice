package day18;

import java.io.File;
import java.io.IOException;

public class File2 {
//CREATE FOLDER(DIRECTORY) DEMO:
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/neera/Desktop/Demo";
        File file = new File(filePath);
        file.mkdir();
        System.out.println("directory created...");
    }
}
