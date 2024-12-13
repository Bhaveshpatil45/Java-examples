package files.oldFasioned;

import java.io.File;
import java.util.Arrays;

public class FileOperationDemo {
    private  static  final String FILE_PATH = "C:\\Users\\bp700\\Downloads\\MyFolder\\";
    private  static  final String FILE_NAME = "LibrarySystem.txt";

    public static void main(String[] args) {

        File newFolder = new File(FILE_PATH);
        File newFile = new File(FILE_PATH + FILE_NAME);

        System.out.println("---------------------------------------");
        if (newFile.isFile()){
            System.out.println(FILE_NAME + "present at " + FILE_PATH + " is a file and not a folder");
        }

        if (!newFile.isDirectory()){
            System.out.println(FILE_PATH + "is a file and not  folder.");
        }

        System.out.println("---------------------------------------");

        if (!newFolder.isDirectory()){
            System.out.println(FILE_PATH + "is a folder and not  file.");
        }

        System.out.println("---------------------------------------");

        if (!newFile.exists()){
            System.out.println(FILE_NAME + "is already created.");
        }

        System.out.println("---------------------------------------");

        if (!newFolder.exists()){
            System.out.println(FILE_PATH + " folder is already created.");
        }

        System.out.println("---------------------------------------");

        if (!newFile.canRead()){
            System.out.println(FILE_PATH + "is readable.");
        }

        System.out.println("---------------------------------------");

        if (!newFolder.canRead()){
            System.out.println(FILE_NAME + "is readable.");
        }

        System.out.println("---------------------------------------");

        if (!newFile.canExecute()){
            System.out.println(FILE_NAME + "can be executed.");
        }

        System.out.println("---------------------------------------");

        if (!newFile.canWrite()){
            System.out.println(FILE_NAME + "file has edit permissions.");
        }

        System.out.println("---------------------------------------");

        if (!newFile.isHidden()){
            System.out.println(FILE_NAME + "is not hidden file.");
        }

        System.out.println("---------------------------------------");

        System.out.println("List of files present inside " + FILE_PATH + ":" + Arrays.stream(newFolder.list()).toList());
        System.out.println("---------------------------------------");
        System.out.println("PAresent folder of '" + FILE_PATH + "' -> " + newFolder.getParent());
        System.out.println("---------------------------------------");

        System.out.println("Free space in disk at " + FILE_PATH + ":" + (newFolder.getFreeSpace()/1024) + " Kb");
        System.out.println("Free space in disk at " + FILE_PATH + ":" + (newFolder.getFreeSpace()/1024/1024) + " mb");
        System.out.println("Free space in disk at " + FILE_PATH + ":" + (newFolder.getFreeSpace()/1024/1024/1024) + " gb");
        System.out.println("---------------------------------------");

        File newFolder1 = new File(FILE_PATH + "new-folder");
        if (newFolder1.mkdir()){
            System.out.println("new folder has been created inside "+ FILE_PATH + "named as new-folder");
        }

        System.out.println("---------------------------------------");
        if (newFolder1.delete()){
            System.out.println("New folder has been deleted from "+ FILE_PATH);
        }
        System.out.println("---------------------------------------");
    }
}
