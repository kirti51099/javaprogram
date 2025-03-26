import java.io.*;
public class FileHandling {
 public static void main(String[] args) {
 if (args.length == 0) {
 System.out.println("Please provide the file name as an argument.");
 return;
 }
 String fileName = args[0];
 File file = new File(fileName);
 try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
 String line;
 while ((line = reader.readLine()) != null) {
 System.out.println(line);
 }
 System.out.println("Do you want to add data at the end of the file? (Yes/No)");
 BufferedReader inputReader = new BufferedReader(new
InputStreamReader(System.in));
 String response = inputReader.readLine();
 if (response.equalsIgnoreCase("Yes")) {
 try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
 System.out.println("Enter data to append (type 'exit' to stop):");
 String newData;
 while (!(newData = inputReader.readLine()).equalsIgnoreCase("exit")) {
 writer.write(newData);
 writer.newLine();
 }
 System.out.println("Data appended successfully.");
 } catch (IOException e) {
 System.out.println("An error occurred while appending data to the file: " +
e.getMessage());
 }
 }
 } catch (FileNotFoundException e) {
 System.out.println("File not found. Creating a new file.");
 try {
 file.createNewFile();
 System.out.println("New file created: " + fileName);
 try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
 BufferedReader inputReader = new BufferedReader(new
InputStreamReader(System.in));
 System.out.println("Enter data to store in the file (type 'exit' to stop):");
 String newData;
 while (!(newData = inputReader.readLine()).equalsIgnoreCase("exit")) {
 writer.write(newData);
 writer.newLine();
 }
 System.out.println("Data stored successfully.");
 } catch (IOException ex) {
 System.out.println("An error occurred while writing data to the file: " +
ex.getMessage());
 }
 } catch (IOException ex) {
 System.out.println("An error occurred while creating a new file: " +
ex.getMessage());
 }
 } catch (IOException e) {
 System.out.println("An error occurred while reading the file: " + e.getMessage());
 }
 }
}