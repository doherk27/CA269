import java.util.Scanner;

public class Test
{
    public static Movie readMovie(Scanner in)
    {
        String name = in.nextLine();
        int code = in.nextInt();
        
        return new Movie(name, code);
    }
    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Movie movie = readMovie(in);
        
        int numDays = in.nextInt();
        
        System.out.println(movie.getCharge(numDays));
    }
}