package day19;

public class FileUploader extends Thread{

    private String name;

    FileUploader (String name){
        this.name = name;
    }

    public void run(){
        FileUpload f = new FileUpload();
        f.upload(this.name);
    }
}
