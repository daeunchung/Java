package ko;

import java.util.Scanner;

public class daytester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner stdIn=new Scanner(System.in);
	      
	      System.out.println("day1�� �Է��Ͻʽÿ�.");
	      System.out.print("�� : "); int y =stdIn.nextInt();
	      System.out.print("�� : "); int m =stdIn.nextInt();
	      System.out.print("�� : "); int d =stdIn.nextInt();
	      
	      day day1=new day(y,m,d);
	      System.out.println("day1�� ="+day1);
	      
	      day day2 = new day(day1);
	      System.out.println("day1�� day2�� ���� ��¥�� ��������ϴ�");
	      System.out.println("day2 ="+ day2);
	      
	      if(day1.equalto(day2))
	         System.out.println("�����ϴ�");
	      else
	         System.out.println("�ٸ��ϴ�");
	      
	      
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
