package task;


import java.util.Calendar;

public class Age {

   public int getAge(int birthYear, int birthMonth, int birthDay) {
      boolean x = true;
      Calendar sum = Calendar.getInstance();

      int currentYear = sum.get(Calendar.YEAR);
      int currentMonth = sum.get(Calendar.MONTH) + 1;
      int currentDay = sum.get(Calendar.DAY_OF_MONTH);

      int age = currentYear - birthYear;

      if (birthMonth * 100 + birthDay > currentMonth * 100 + currentDay) {
         age--;

      }
      

      return age;
   }

}