//import java.io.FileWriter;
//
//public class hello {
//    static    void   writeData(String data){
//        try {
//            FileWriter writer=new FileWriter("New.txt",true);
//            writer.write(data);
//            writer.close();
//
//        } catch (Exception e) {
//        }
//
//    }
    // crud
//    public static void main(String[] args) {
//        writeData("hello old data  hiiiii");
        // File file =new File("Data.java");
        // try {
        //     if(file.createNewFile()){
        //         System.out.println("file cretedddddd"+ file.getName()) ;
        //         System.out.println("file cretedddddd"+ file.getAbsoluteFile()) ;

        //     }else{
        //         System.out.println("file already exitssssss");
        //     }

        // } catch (Exception e) {
        //     System.out.println(e);
        // }


//    }
//
//
//}





import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class file {

    // Write data to file
    static void writeData(String data) {
        try {
            FileWriter writer = new FileWriter("New.txt", true); // append mode
            writer.write(data);
            writer.close();
            System.out.println("Data written successfully.");
        } catch (Exception e) {
            System.out.println("Error writing file: " + e);
        }
    }

    // Read file data
    static void fileRead() {
        try {
            FileReader read = new FileReader("New.txt");
            int ch;

            while ((ch = read.read()) != -1) {
                System.out.print((char) ch);
            }
            read.close();

            System.out.println();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e);
        }
    }

     //Delete file
    static void fileDel() {
        try {
            File file = new File("New.txt");

            if (file.delete()) {
                System.out.println("File deleted.");
            } else {
                System.out.println("File delete failed or file not found.");
            }
        } catch (Exception e) {
            System.out.println("Error deleting file: " + e);
        }
    }

    public static void main(String[] args) {

        writeData("Hello old data hiiiii\n");
        fileRead();
        fileDel();
    }
}
