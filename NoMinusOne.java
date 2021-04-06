import java.util.Scanner;

public class NoMinusOne 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int x = input.nextInt();
        while (x != -1)
        {
            x = input.nextInt();
        }
        System.out.print("The penultimate number is: " + x);
        System.out.println();
    }   
}
