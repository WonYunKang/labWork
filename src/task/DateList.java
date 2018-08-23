package task;

import java.util.Scanner;

public class DateList {
	
   public static void main(String[] args) {
	 
      java.util.Calendar cal = java.util.Calendar.getInstance();
      long nowday = cal.getTimeInMillis();
      int year;
      int T ;
      int month;
      int Chose;
      int number;
 //프레임 열기
		GUI frameExam = new GUI();
	
	
   
    	 
      Scanner sc = new Scanner(System.in);
      System.out.println("------------------------------------------------------------------------");
      System.out.println("          1.달력    2.양음력변환    3.날짜계산    4.전역일계산    5.만나이계산");
      System.out.println("------------------------------------------------------------------------");
      number = sc.nextInt();
      System.out.println("년도를 입력해보세요 :");
      year = sc.nextInt();
      System.out.println("월을 입력해보세요");
      month = sc.nextInt();
      
      
      switch(number) {
      case 1:{
         System.out.println("====================["+year+"년"+month+"월]=====================");
         try {
            CalendarPrint Wal = new CalendarPrint(year, month);
            Wal.printCal();
            System.out.println();
            System.out.println("===================================================");
         } catch (Exception e) {
            e.printStackTrace();
         }
            
         break;
      }
      case 2:{
         System.out.println("====================["+year+"년"+month+"월]=====================");
         try {
            CalendarPrint Wal = new CalendarPrint(year, month);
            Wal.printCal();
            System.out.println();
            System.out.println("===================================================");
         } catch (Exception e) {
            e.printStackTrace();
         }
         
         
         System.out.println("오늘의 날짜 정보");
         System.out.println("양력 날짜 ");
         System.out.println("음력 날짜 ");
         System.out.println("음력 간지");
         
         break;
      }
      case 3:{
         System.out.println("====================["+year+"년"+month+"월]=====================");
         try {
            CalendarPrint Wal = new CalendarPrint(year, month);
            Wal.printCal();
            System.out.println();
            System.out.println("===================================================");
         } catch (Exception e) {
            e.printStackTrace();
         }
         
         System.out.println("비교하고자하는 년을 입력해주세요");
         int user_year = sc.nextInt();
         System.out.println("비교하고자하는 월을 입력해주세요");
         int user_month = sc.nextInt();
         System.out.println("비교하고자하는 일을 입력해주세요");
         int user_day = sc.nextInt();
         
         try {
            D_Day d = new D_Day();
            int q = d.getDDay(user_year, user_month, user_day);
            System.out.println("일수는 : "+ q +" 일 차이납니다" );
            
         }catch(Exception e) {
            System.out.println("ERROR");
         }
      
         
         break;
      }
      case 4:{
         System.out.println("====================["+year+"년"+month+"월]=====================");
         try {
            CalendarPrint Wal = new CalendarPrint(year, month);
            Wal.printCal();
            System.out.println();
            System.out.println("===================================================");
         } catch (Exception e) {
            e.printStackTrace();
         }

         System.out.println("전역하는 년도를 입력해주세요");
         int user_year = sc.nextInt();
         System.out.println("전역하는 월을 입력해주세요");
         int user_month = sc.nextInt();
         System.out.println("전역하는는 일을 입력해주세요");
         int user_day = sc.nextInt();
         
         try {
            Mar d = new Mar();
            int q = d.getDDay(user_year, user_month, user_day);
            System.out.println("전역까지 : "+ q +" 일 남았습니다" );
            
         }catch(Exception e) {
            System.out.println("ERROR");
         }
      
         
         break;
      }
      case 5:{
         System.out.println("====================["+year+"년"+month+"월]=====================");
         try {
            CalendarPrint Wal = new CalendarPrint(year, month);
            Wal.printCal();
            System.out.println();
            System.out.println("===================================================");
         } catch (Exception e) {
            e.printStackTrace();
         }
         
         System.out.println("태어난 년도를 입력해주세요");
         int user_year = sc.nextInt();
         System.out.println("태어난 월을 입력해주세요");
         int user_month = sc.nextInt();
         System.out.println("태어난 일을 입력해주세요");
         int user_day = sc.nextInt();
         
         try {
            Age d = new Age();
            int q = d.getAge(user_year, user_month, user_day);
            if(q>12) {
               T=q-12;
               switch(T) {
               case 1:{
                  System.out.println("");
                  break;
               }
               }
               System.out.println("나이는 : "+ q +" 살 입니다" );
            }
            
         }catch(Exception e) {
            System.out.println("ERROR");
         }
      
         
         
         break;
      }
      
      }
   
   }
   
}