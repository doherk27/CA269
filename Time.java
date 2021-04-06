public class Time
{
    // Private variables
    int hours;
    int minutes;

    // Constructor (with a String parameter)
   public Time(String time)
   {
       hours = Integer.parseInt(time.substring(0, 2));
       minutes = Integer.parseInt(time.substring(2));
   }

   // isLater(Time otherTime) // boolean method to compare two times
   public Boolean isLater(Time otherTime)
   {
       if (hours >= otherTime.hours && minutes > otherTime.minutes)
       {
           return true;
       }
       else
       {
           if (hours < otherTime.hours && minutes < otherTime.minutes)
           {
               return false;
           }
           else
           {
               if(hours > otherTime.hours && minutes < otherTime.minutes)
               {
                   return true;
               }
               else
                   {
                       return false;
                   }
           }
       }

   }

   // String toString() // return a String representation of the time (hh:mm)
   public String toString()
   {
       if(hours < 10 && minutes < 10)
       {
           return ("0" + hours + ":" + "0" + minutes);
       }
       else
       {
           if(hours >= 10 && minutes < 10)
           {
               return hours + ":" + "0" + minutes;
           }
           else
           {
               if(hours < 10 && minutes >= 10)
               {
                   return "0" + hours + ":" + minutes;
               }
               else
               {
                   return hours + ":" + minutes;
               }
           }
       }
   }
}
