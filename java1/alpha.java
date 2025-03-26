
import java.util.*;
class alpha
{
    public static void main(String[]args)
    {
        int n=10;
        String names[]={"kirti","pavan","shravani","anand","aishwarya","anuradha","arpita","vaishnavi","kishor","vikram"};
        Arrays.sort(names);
        System.out.println("the names in alphabetical order are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }

    }
}