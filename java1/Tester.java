
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Utility {
    public static void printMessage(String houseNumber, String streetName, String city){
        //Multi-line Output
        // System.out.println("House Number: "+houseNumber);
        // System.out.println("Street Name: "+ streetName);
        // System.out.println("City: "+city);
        
        //Single line output
         System.out.println("House Number: "+houseNumber+ " Street Name: "+ streetName+ " City: "+city);
    }
}

  public class Tester
 {
    public static void main(String[] arr)
    {
        Scanner obj=new Scanner(System.in);
        String inputstring = obj.nextLine();
        List<String> numbers = Arrays.stream(inputstring.split(","))
                .collect(Collectors.toList());
        String houseNumber = numbers.get(0);
        String streetName =  numbers.get(1);
        String city =  numbers.get(2);
       
        Utility.printMessage(houseNumber, streetName, city);
   
     }
 }

