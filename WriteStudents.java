import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteStudents 
{
    public static void main(String[] args) throws IOException
    {
        if (args.length < 2)
        {
            System.out.println("Usage: WriteStudents <inputfile> <outputfile>");
        }
        else
        {
            Scanner in = null;
            try 
            {
                FileWriter fileWriter = new FileWriter(new File(args[1]));
                PrintWriter printWriter = new PrintWriter(fileWriter);
                in = new Scanner(new File(args[0]));
                int numStudents = in.nextInt();
                String [] students = new String[numStudents];
                for (int i=0;i<numStudents;i++)
                {
                    String name = in.next();
                    
                    int markPlus1 = in.nextInt() + 1;

                    String mark = String.valueOf(markPlus1);

                    students[i] = String.join(" ", name, mark) + "\n";
                }
                for (int j = 0; j < numStudents; j++)
                {
                    printWriter.printf(students[j]);
                }

                printWriter.close();
            } 
            
            catch (FileNotFoundException e) 
            {
                System.out.println("File not found.");
            }

            finally
            {
                in.close();
            }
        }
    } 
}
