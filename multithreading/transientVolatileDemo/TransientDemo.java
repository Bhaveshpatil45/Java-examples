package multithreading.transientVolatileDemo;

import java.io.*;

class User implements Serializable {
    private String username;

    // The transient keyword is used to indicate that a field should not be serialized.
    // Serialization is the process of converting an object into a byte stream,
    // which can be saved to a file or transmitted over a network.
    // When an object is deserialized, transient fields are initialized with their default values.
    private transient String password; // this field will not be serialized

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "username= " + username + ", password= " + password;
    }
}

public class TransientDemo {
    public static void main(String[] args) {
        User user = new User("Bhavesh_Patil", "12345");

        //Serialize the object
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))){
            oos.writeObject(user);
        }catch (IOException e){
            e.printStackTrace();
        }

        // Deserialize the object
        User deserializeUser = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))){
            deserializeUser = (User) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.err.println(e.getMessage());
        }

        //Print the deserialized object
        System.out.println(deserializeUser);
    }
}
