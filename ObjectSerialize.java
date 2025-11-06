// Serialization converts an object into a byte stream for storage or transmission,
//deserialization reconstructs the object from the byte stream.
// object output stream (for serialization) , object input stream (for deserialization). Objects must implement Serializable interface.
//Serialization writes object state (fields) recursively if nested objects are serializable
//use case => for sending the data in packets over network or db

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


class Person{
    String name;
    int age;
    String Password;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        Password = password;
    }

    
}


public class ObjectSerialize {
    public static void main(String[] args) {
        Person MyPerson = new Person("John Doe", 30, "password123");
        // Serialization and deserialization logic will be implemented here
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))){
            oos.writeObject(MyPerson);

        }catch(IOException e){
            e.printStackTrace();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Name: " + deserializedPerson.name);
            System.out.println("Age: " + deserializedPerson.age);
            System.out.println("Password: " + deserializedPerson.Password);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
    }
}}
