import java.util.Calendar;
public class Exam19_1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) + "��");
		System.out.println(cal.get(Calendar.MONTH) + "��");
		System.out.println(cal.get(Calendar.DATE) + "��");
		System.out.println(cal.get(Calendar.HOUR) + "��");
		System.out.println(cal.get(Calendar.MINUTE) + "��");
		System.out.println(cal.get(Calendar.SECOND) + "��");
	}
}
/*
�����߻�Ŭ����:RandomŬ���� /import.java.util.*; import.java.util.Random;


��¥�ͽð� ���� �����ϴ� "�߻�"Ŭ����: CalendarŬ���� 
import.java.util.*; import.java.util.Calendar;
�߻�Ŭ������ ������ X 
����� �޾Ƽ� ��ü���� X ��ü���������ִ� �����޼��� ����ؼ� Calendar ��ü ����
Calendar cal = Calendar.getInstance();
System.out.println(cal.get(Calendar.YEAR)+"��");
System.out.println(cal.get(Calendar.MONTH)+"��");
System.out.println(cal.get(Calendar.DATE)+"��");


���� ���� ���� �޼��带 �����ϰ� �ִ� MathŬ���� :java.util(X), java.lang(O) ->import�ʿ����
static int abs(int a) -> Math.abs(-5)
static double pow(double a, double b) -> Math.pow(2,3)


���� ���� �޼��� Arrays.parallelSort(data); //data�� �迭�� �ȴ�


*/