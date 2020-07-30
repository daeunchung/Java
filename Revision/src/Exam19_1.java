import java.util.Calendar;
public class Exam19_1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH) + "월");
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.HOUR) + "시");
		System.out.println(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "초");
	}
}
/*
난수발생클래스:Random클래스 /import.java.util.*; import.java.util.Random;


날짜와시간 정보 제공하는 "추상"클래스: Calendar클래스 
import.java.util.*; import.java.util.Calendar;
추상클래스라서 생성자 X 
상속을 받아서 객체생성 X 객체생성시켜주는 정적메서드 사용해서 Calendar 객체 생성
Calendar cal = Calendar.getInstance();
System.out.println(cal.get(Calendar.YEAR)+"년");
System.out.println(cal.get(Calendar.MONTH)+"월");
System.out.println(cal.get(Calendar.DATE)+"일");


수학 관련 정적 메서드를 포함하고 있는 Math클래스 :java.util(X), java.lang(O) ->import필요없어
static int abs(int a) -> Math.abs(-5)
static double pow(double a, double b) -> Math.pow(2,3)


병렬 정령 메서드 Arrays.parallelSort(data); //data는 배열이 된다


*/