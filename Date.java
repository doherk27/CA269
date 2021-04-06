import java.util.*;
public class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(String input)
    {
        String[] arrOfString = input.split(" ");

        day = Integer.parseInt(arrOfString[0]);
        month = Integer.parseInt(arrOfString[1]);
        year = Integer.parseInt(arrOfString[2]);
    }

    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    public boolean isOnOrAfter(Date day2)
    {
        if (year > day2.year)
        {
            return true;
        }
        else if (year < day2.year)
        {
            return false;
        }
        else
        {
            if (month > day2.month)
            {
                return true;
            }
            else if (month < day2.month)
            {
                return false;
            }
            else
            {
                if (day > day2.day)
                {
                    return true;
                }
                else if (day < day2.day)
                {
                    return false;
                }
                return true;
            }
        }
    }

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        List<Date> dates = new ArrayList<Date>();
        String line = in.nextLine();

        while(!line.isEmpty()) // while input does not equal a blank line
        {
            Date date = new Date(line);  // turn strings to dates
            dates.add(date);  //add dates to a list object
            line = in.nextLine(); //keep loop going

        }
        
        int i=0, j=1;
        Date mostRecent;
        while(i < dates.size())
        {
            if (date.get(i).year.isondate.get(j).year)
            {
            }
        }
        System.out.println(???); // Print the latest date
    }
}
