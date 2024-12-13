package files.oldFasioned;

import java.io.FileWriter;
import java.io.IOException;

public class FilesWriterDemo {

    private static  final String FILE_PATH = "C:\\Users\\bp700\\Downloads\\FileDEmo";
    private static  final String FILE_NAME = "TEXT.txt";

    public static void main(String[] args) throws IOException {
        FileWriter fileWrite = null;
        try {
            fileWrite = new FileWriter(FILE_PATH + FILE_NAME);
            fileWrite.write("This is sample data written to file..\n\nThis data is written to new line in this file.");
            System.out.println("Content is successfully wrote to the file.");
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("closing file write..");
            fileWrite.close();
        }

    }
}
