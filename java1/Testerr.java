import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
class Utility{
    //This solution is not optimal. 
    public static int findGreatest(int firstNumber,int secondNumber, int thirdNumber){
        int greatestNumber = 0;
        //compare the first number with second and third number
        if (firstNumber>secondNumber && firstNumber > thirdNumber){
            //first number is the greatest
            greatestNumber =  firstNumber;
        //compare the second number with first and third number
        }
        if (secondNumber > firstNumber && secondNumber > thirdNumber){
            //second number is the greatest
            greatestNumber = secondNumber;
        //compare the third number with second and first number
        }
        if(thirdNumber > firstNumber && thirdNumber > secondNumber){
            //third number is the greatest
            greatestNumber = thirdNumber;
        }
        //return the greatest
        return (greatestNumber);
    }
}
class Testerr
 {
    public static void main(String[] arr){
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        List<Integer> numbers = Arrays.stream(inputString.split(","))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
        int greatestNumber = Utility.findGreatest(numbers.get(0),numbers.get(1),numbers.get(2)); 
        System.out.println(greatestNumber);
    }
    
}


