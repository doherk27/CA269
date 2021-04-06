/*
    This code is supplied and may be used to solve this problem.
    
    Note that the output matching is exact (down to spaces and newlines)
    It will be difficult to get this correct if you do not use the supplied 
    System.out.print statements
*/
import java.util.Scanner;

public class FindMatchingLetters
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two lines:");
        // Read in the two lines
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        int numMatching = 0;
        // INSERT YOUR CODE HERE
        int i = 0;
        while (i < line1.length())
        {
            if (line1.substring(i, i + 1).equals(line2.subSequence(i, i + 1)))
            {
                numMatching++;
            }
            i++;
        }
        // it should work out what the number of matching characters is
        
        // Print out the solution
        System.out.println("There are " + numMatching + " corresponding characters.");
    }
}