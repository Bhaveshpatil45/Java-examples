package files.oldFasioned;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {

    private static final String FILE_PATH = "C:\\Users\\bp700\\Downloads\\MyFolder\\";
    private static final String FILE_NAME = "LibrarySystem.txt";

    public static void main(String[] args) {
        BufferedReader buffer = null;
        try{
            Reader fileReader = new FileReader(FILE_PATH+ FILE_NAME);
            buffer = new BufferedReader(fileReader);

            System.out.println("----------- Start of file -----------");
            String strCurrentLine;
            while ((strCurrentLine = buffer.readLine()) !=null){
                System.out.println(strCurrentLine);
            }
            System.out.println("----------- end of file -----------");
        }catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }finally {
            try{
                if (buffer != null)
                        buffer.close();

            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
