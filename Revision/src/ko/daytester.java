package ko;

import java.util.Scanner;

public class daytester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner stdIn=new Scanner(System.in);
	      
	      System.out.println("day1을 입력하십시오.");
	      System.out.print("년 : "); int y =stdIn.nextInt();
	      System.out.print("월 : "); int m =stdIn.nextInt();
	      System.out.print("일 : "); int d =stdIn.nextInt();
	      
	      day day1=new day(y,m,d);
	      System.out.println("day1은 ="+day1);
	      
	      day day2 = new day(day1);
	      System.out.println("day1을 day2와 같은 날짜로 만들었습니다");
	      System.out.println("day2 ="+ day2);
	      
	      if(day1.equalto(day2))
	         System.out.println("같습니다");
	      else
	         System.out.println("다릅니다");
	      
	      
	      day d1=new day();
	      day d2= new day(2010);
	      day d3=new day(2010,10);
	      day d4=new day(2010,10,5);
	      
	      
	      
	      System.out.println("d1  ="+d1);
	      System.out.println("d2  ="+d2);
	      System.out.println("d3  ="+d3);
	      System.out.println("d4  ="+d4);
	      
	      day [] a= new day[3];
	      for(int i=0;i<a.length;i++)
	         {a[i]=new day();
	         }
	      for(int i=0;i<a.length;i++) {
	         System.out.println("a["+i+"]="+a[i]);
	      }


	}

}
