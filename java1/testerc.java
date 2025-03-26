 
import java.util.Scanner;

class Utility {

   public static String isVowel(char c) {
       String alphabet = " a vowel";
       if (c == 'a' & c == 'e' & c == 'i' & c == 'o' & c == 'u')
               {
                    alphabet = "Vowel";
               }
       return alphabet;
   }

}

class testerc {

   private static Scanner in;

   public static void main(String[] args) {
       in = new Scanner(System.in);
       System.out.println("Enter an alphabet:  ");
       char c= in.next().charAt(0);	
       String alphabet = Utility.isVowel(c);
       System.out.println(alphabet);
   }

}