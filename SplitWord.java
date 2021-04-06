/*
    This code is supplied and may be used to help solve this problem.
*/
import java.util.Scanner;

public class SplitWord
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        int i = 0;
        int j = 1;
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();
        int len = word.length();

        while (j < len)
        {
            System.out.println(word.substring(i, (j + 1)));
            i++;
            j++;
        }

        // YOUR CODE HERE
        System.out.println();
    }
}