package day19;

public class FileUploadTest {

    public static void main(String[] args) {
        /*
        //File uploads can be done as follows, but need to do for each file (f1,f2,..), so thread is USED:
        FileUpload f1 = new FileUpload();
        f1.upload("f1");
        FileUpload f2 = new FileUpload();
        f1.upload("f2");
        */

        FileUploader f1 = new FileUploader("file1");
        FileUploader f2 = new FileUploader("file2");
        FileUploader f3 = new FileUploader("file3");

        f1.start();
        f2.start();
        f3.start();

    }
}
