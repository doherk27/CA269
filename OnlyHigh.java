import java.util.*;

public class OnlyHigh 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String word = input.nextLine();
        int count = 0;
        int i = 0;
        int j = 1;

        while (j + 1 <= word.length())
        {
            if (word.substring(i, j + 1).equals("hi"))
            {
                count++;
            } 
            i++;
            j++;
        }
        System.out.println(count);

    }    
}
