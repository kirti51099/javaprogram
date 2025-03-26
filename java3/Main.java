//Program using file handling concept
import java.io.*;
class Student {
 private String name;
 private int age;
 private double weight;
 private double height;
 private String city;
 private String phone;
 public Student(String name, int age, double weight, double height, String city, String
phone) {
 this.name = name;
 this.age = age;
 this.weight = weight;
 this.height = height;
 this.city = city;
 this.phone = phone;
 }
 public String toString() {
 return "Name: " + name + ", Age: " + age + ", Weight: " + weight + " kg, Height: " +
height + " cm, City: " + city + ", Phone: " + phone;
 }
 public void writeToFile(DataOutputStream dos) throws IOException {
 dos.writeUTF(name);
 dos.writeInt(age);
 dos.writeDouble(weight);
 dos.writeDouble(height);
 dos.writeUTF(city);
 dos.writeUTF(phone);
 }
 public static Student readFromFile(DataInputStream dis) throws IOException {
 String name = dis.readUTF();
 int age = dis.readInt();
 double weight = dis.readDouble();
 double height = dis.readDouble();
 String city = dis.readUTF();
 String phone = dis.readUTF();
 return new Student(name, age, weight, height, city, phone);
 }
}
public class Main {
 public static void main(String[] args) {
 String fileName = "student_data.txt";
 // Writing student data to file
 try (DataOutputStream dos = new DataOutputStream(new
FileOutputStream(fileName))) {
 Student student1 = new Student("John Doe", 20, 70.5, 175.0, "New York",
"1234567890");
 student1.writeToFile(dos);
 Student student2 = new Student("Jane Smith", 22, 65.2, 160.0, "Los Angeles",
"9876543210");
 student2.writeToFile(dos);
 System.out.println("Student data has been written to file.");
 } catch (IOException e) {
 e.printStackTrace();
 }
 // Reading student data from file
 try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
 while (dis.available() > 0) {
 Student student = Student.readFromFile(dis);
 System.out.println(student);
 }
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
}
