import java.util.Scanner;

class Word
{
    public static boolean containsLetter(String x, Char y)
    {
        for (int i=0; i<x.length() -1; i++)
        {
            if (y == x.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}

public class TestContainsLetter
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user for a word and a letter
        System.out.print("Enter a word and a letter: ");
        String word = in.next();
        char letter = in.next().charAt(0);
        
        if(Word.containsLetter(word, letter))
            System.out.println(letter + " is in " + word);
        else
            System.out.println(letter + " is not in " + word);
    }
}