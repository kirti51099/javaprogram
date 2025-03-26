
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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

class Testerk {
    public static void main(String[] arr){
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<String> numbers = Arrays.stream(inputString.split(","))
                .collect(Collectors.toList());
        String houseNumber = numbers.get(0);
        String streetName =  numbers.get(1);
        String city =  numbers.get(2);
       
        Utility.printMessage(houseNumber, streetName, city);
    }
}