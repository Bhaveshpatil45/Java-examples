package externalization;

import java.io.*;

public class FileExternalizationDemo {
    private  static final File EMPLOYEE_DATA_FILE = new File("employee-data.txt");

    public static void main(String... args) throws Exception{
        Employee employee = new Employee(1, "Amit", "Pune");
        ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(EMPLOYEE_DATA_FILE));
        outStream.writeObject(employee);
        outStream.flush();
        System.out.println("Data stored to file...");

        System.out.println("Now, reading data from stored files...");
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(EMPLOYEE_DATA_FILE));
        Employee readEmployeeObject = (Employee) inputStream.readObject();

        System.out.println("After de externalization of employee: "
        + "\nEmployee Id:" + readEmployeeObject.getEmpId()
        + "\nName:" + readEmployeeObject.getName()
        + "\nAddress:" + readEmployeeObject.getAddress());
    }
}
