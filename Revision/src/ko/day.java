package ko;

public class day {
	   private int year;
	   private int month;
	   private int date;
	//-----������-----//
	   public day()  {set(1,1,1);}
	   public day(int year) {set(year,1,1);}
	   public day(int year,int month) {set(year,month,1);}
	   public day(int year,int month,int date) {set(year,month,date);}
	   public day(day d)                 {set(d.year,d.month,d.date); }
	   
	   
	   //����� ���//
	   public int getyear() {return year;}
	   public int getmonth() {return month;}
	   public int getdate() {return date;}
	   //����� ����//
	   public void setYear(int year) {this.year=year ;}
	   public void setMonth(int month) {this.month= month;}
	   public void setDate(int date) {this.date= date;}
	   
	   public void set(int year,int month, int date) {
	      this.year=year;
	      this.month=month;
	      this.date=date;
	   }

	   public int dayofweek() {
	      int y =year;
	      int m = month;
	      if(m==1||m==2) {
	         y--;
	         m+= 12;
	      }
	      return(y+y/4-y/100+y/400+(13*m+8)/5+date)%7;
	   }
	   //��¥ d�� ������?
	   public boolean equalto(day d) {
	      return year==d.year&&month==d.month&&date ==d.date;
	      
	   }
	   //���ڿ�ǥ����ȯ
	   public String toString() {
	      String[] wd= {"��","��","ȭ","��","��","��","��"};
	      return String.format("%04d��%02d�� %02d��(%s)",
	                                       year,month,date,wd[dayofweek()]);
	   }

}
