import java.util.Scanner;

public class OnlyAverage 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        System.out.print("Enter " + num + " numbers: ");

        // Read in the numbers (note that they could be floating point)
        int i = 0;
        float sum = 0;

        while (i < num)
        {
            float numbers = in.nextFloat();
            sum = sum + numbers;
            i++;

        }
        System.out.println("The average is " + sum / num);
    }
}
