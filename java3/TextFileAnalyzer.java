//Program using file handling concepts
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TextFileAnalyzer {
 public static void main(String[] args) {
 String fileName = "sample.txt"; // Update with your file name
 int vowelsCount = 0;
 int wordsCount = 0;
 int aCount = 0;
 try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
 String line;
 while ((line = br.readLine()) != null) {
 // Count vowels
 vowelsCount += countVowels(line);
 // Count words
 String[] words = line.split("\\s+");
 wordsCount += words.length;
 // Count occurrences of 'a'
 aCount += countCharacter(line, 'a');
 }
 } catch (IOException e) {
 System.err.println("Error reading the file: " + e.getMessage());
 }
 System.out.println("Number of vowels: " + vowelsCount);
 System.out.println("Number of words: " + wordsCount);
 System.out.println("Number of 'a' occurrences: " + aCount);
 }
 private static int countVowels(String text) {
 int count = 0;
 for (char c : text.toCharArray()) {
 if ("aeiouAEIOU".indexOf(c) != -1) {
 count++;
 }
 }
 return count;
 }
 private static int countCharacter(String text, char ch) {
 int count = 0;
 for (char c : text.toCharArray()) {
 if (c == ch) {
 count++;
 }
 }
 return count;
 }
}