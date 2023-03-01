package filehandling;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        System.out.println("For file Creation=============>>>>>>>>>>>>>>>>>");
        FileCraetion f1=new FileCraetion();
        f1.fileCreation();

        System.out.println("For file data writing=================>>>>>>>>>>>>");
        FileWriters r=new FileWriters();
        r.filewriter();

        System.out.println("For file data reading================>>>>>>>>>>>>>>>>");
        FileDataReading f2=new FileDataReading();
        f2.fileDataReading();

        System.out.println("One file data copy to another file==========>>>>>>>>>>>>>>");
        FileDataCopy f3=new FileDataCopy();
        f3.fileDataCopy();
    }
}
class FileCraetion{
    void fileCreation()throws IOException{

        File f = new File("C:\\Users\\Ashish kumar\\Desktop\\new file.txt");
        if (f.createNewFile()) {
            System.out.println("File successfully created");
        }
        else{
            System.out.println("file already exists");
        }
        if(f.exists()){
            System.out.println("file name:"+f.getName());
            System.out.println("File location:"+f.getAbsolutePath());
            System.out.println("File readable:"+f.canRead());
            System.out.println("File writeable:"+f.canWrite());
            System.out.println("file size:"+f.length());

        }
        else{
            System.out.println("file does't exists");
        }
    }

}
class FileWriters{


    void filewriter() throws  IOException{
        FileWriter f=new FileWriter("C:\\Users\\Ashish kumar\\Desktop\\new file.txt");
        f.write("This is the java file handling program");
        f.close();
        System.out.println("written successfully ");
        }

    }
class FileDataReading{
    void fileDataReading()throws IOException{
        FileReader f=new FileReader("C:\\Users\\Ashish kumar\\Desktop\\new file.txt");
        int i;
        System.out.println("this is the file data------->>>>");
        while((i=f.read())!=-1){
            System.out.print((char)i);

        }

    }
}
class FileDataCopy{
    void fileDataCopy() throws IOException{
        FileInputStream f=new FileInputStream("C:\\Users\\Ashish kumar\\Desktop\\new file.txt");
        FileOutputStream f1=new FileOutputStream("C:\\Users\\Ashish kumar\\Desktop\\Copied file.txt ");
        int i;
        System.out.println("File data copied successfully");
        while((i=f.read())!=-1){
            f1.write((char)i);

        }
    }
}