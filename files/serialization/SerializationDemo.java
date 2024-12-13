package files.serialization;

import java.io.*;
import java.util.List;

public class SerializationDemo {
    private static final String FILE_PATH = "C:\\Users\\bp700\\Downloads\\FileDEmo";
    private static final String FILE_NAME = "student.ser";

    public static void main(String[] args) {
        SerializationDemo serializationDemo = new SerializationDemo();

        Student.Address bhaveshAddress = new Student.Address("Pune");
        Student.Address patilAddress = new Student.Address("Mumbai");

        Student bhavesh = new Student(1,"bhavesh", bhaveshAddress);
        Student patil = new Student(2, "patil", patilAddress);

        serializationDemo.serialize(List.of(bhavesh, patil));
        System.out.println("--------------------------------------");

        for (Student student : serializationDemo.deserialize()){
            System.out.println(student);
        }
    }

    private void serialize(List<Student> students){
        try{
            FileOutputStream file = new FileOutputStream(FILE_PATH + FILE_NAME);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(students);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        }catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private List<Student> deserialize(){
        List<Student> students = null;

        try{
            FileInputStream file = new FileInputStream(FILE_PATH + FILE_NAME);
            ObjectInputStream in = new ObjectInputStream(file);

            students = (List<Student>) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println("-----------------------------");
        }catch (ClassNotFoundException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        return students;
    }

}
