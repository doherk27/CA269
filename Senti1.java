import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
    public static void main(String[] args)
    {
        if (args.length < 2)
        {
            System.out.println("Usage: java Senti1 <word> <filename>");
        }
        else
        {
            try 
            {
                String word = args[0];
                File movieReviewFile = new File(args[1]);
                int count = 0;
                Scanner movieReviewScanner = new Scanner(movieReviewFile);
                while(movieReviewScanner.hasNext())
                {
                    String words = movieReviewScanner.next();
                    if(words.equals(word))
                    {
                        count++;
                    }
                }
                System.out.println("The word " + word + " occurs " + count + " times.");
                
            } 
            catch (FileNotFoundException e) 
            {
                System.out.println("File not found. Try again.");
            }
        }
    }
}