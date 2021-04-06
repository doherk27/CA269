import java.util.Scanner;

public class HowManyNumbers 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int count = 0;

        while (input.nextInt() != -1)
        {
            count++;
        }
        System.out.print(count + " numbers were entered.");
        System.out.println();
    }  
}
