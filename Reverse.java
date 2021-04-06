import java.util.Scanner;

public class Reverse 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num = in.nextInt();
        System.out.print("Enter " + num + " numbers: ");
        int[] numlist = new int[num];
        for (int i = 0;i<num;i++)
        {
            int numbers = in.nextInt();
            numlist[i] = numbers;
        }
        
        System.out.print("The numbers reversed are:");
        for (int i=numlist.length - 1;i>=0;i--)
        {
            System.out.print(" " + numlist[i]);
        }
        System.out.println();
    }    
}
