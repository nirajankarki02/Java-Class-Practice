package day18;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public class File3 {

    public static void main(String[] args) {
        String filePath = "C:/Users/neera/Desktop/Demo.txt";
        File file = new File(filePath);

        //Path of the file
        System.out.println(file.getAbsolutePath());
        //Check the name of the file
        System.out.println(file.getName());
        //Check if it is file
        System.out.println(file.isFile());
        //Check if this is Directory
        System.out.println(file.isDirectory());
        //Check if the file exist
        System.out.println(file.exists());
        //Check if the file is readable
        System.out.println(file.canRead());
        //Check if the file is writable
        System.out.println(file.canWrite());
        //Check if the file is executable
        System.out.println(file.canExecute());
        //Check if the file is hidden
        System.out.println(file.isHidden());

        //Set the file to non writable
        file.setWritable(false);//cannot write on the file after this

        System.out.println(file.lastModified());
        System.out.println(LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), TimeZone.getDefault().toZoneId()));
//
        //Move and rename the file
        filePath = "C:/Users/neera/Desktop/Demo/test.txt";
        File f = new File(filePath);
        file.renameTo(f);

        //delete the file
        f.delete();
    }
}
