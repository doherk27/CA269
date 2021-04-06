import java.util.Scanner;

public class FirstMiddleLast 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        int len = word.length();
        String first = word.substring(0, 1);
        String middle = word.substring(1, len - 1);
        String last = word.substring(len - 1, len);

        System.out.print(first + "\n" + middle + "\n" + last);
        System.out.println();
    }   
}
