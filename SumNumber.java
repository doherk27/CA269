import java.util.Scanner;

public class SumNumber 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = number * (number + 1) / 2;
        System.out.println("The sum of the numbers from 1 to " + number + " is " + sum);
    }    
}
