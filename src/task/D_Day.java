package task;




import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class D_Day {

   
   public int getDDay(int myear, int mmonth, int mday) {
       try {
          TimeZone dateFormat = TimeZone.getTimeZone("Asia/Soul");
         Date date = new Date();
           
           Calendar todaCal = Calendar.getInstance(); 
           Calendar ddayCal = Calendar.getInstance(); 
           
           mmonth -= 1; 
           ddayCal.set(myear,mmonth,mday);
   

           long today = todaCal.getTimeInMillis()/86400000; 
           long dday = ddayCal.getTimeInMillis()/86400000;
           long count = dday - today; 
           return (int) count;
       }
       catch (Exception e)
       {
           e.printStackTrace();
           return -1;
       }
   }
}