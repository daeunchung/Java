package ko;

public class day {
	   private int year;
	   private int month;
	   private int date;
	//-----생성자-----//
	   public day()  {set(1,1,1);}
	   public day(int year) {set(year,1,1);}
	   public day(int year,int month) {set(year,month,1);}
	   public day(int year,int month,int date) {set(year,month,date);}
	   public day(day d)                 {set(d.year,d.month,d.date); }
	   
	   
	   //년월일 취득//
	   public int getyear() {return year;}
	   public int getmonth() {return month;}
	   public int getdate() {return date;}
	   //년월일 설정//
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
	   //날짜 d와 같은가?
	   public boolean equalto(day d) {
	      return year==d.year&&month==d.month&&date ==d.date;
	      
	   }
	   //문자열표현반환
	   public String toString() {
	      String[] wd= {"일","월","화","수","목","금","토"};
	      return String.format("%04d년%02d월 %02d일(%s)",
	                                       year,month,date,wd[dayofweek()]);
	   }

}
