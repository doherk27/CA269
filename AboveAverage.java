import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        float [] numberlist = new float[num];
        
        System.out.print("Enter " + num + " numbers: ");

        // Now read in the numbers
        float sum = 0;
        for (int i = 0; i < num; i++)
        {
            float numbers = in.nextFloat();
            numberlist[i] = numbers;
            sum = sum + numbers;
        }
        float avg = sum / num;
        
        System.out.print("The above average numbers are:");
        for (int i = 0; i < numberlist.length; i++)
            if (numberlist[i] > avg)
                System.out.print(" " + numberlist[i]); // You may want to put this in a loop.

        System.out.println(); // Should finish with a new line
    }
}