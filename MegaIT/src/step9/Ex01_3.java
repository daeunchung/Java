package step9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01_3 {
	public static void main(String[] args) {
		/*
		 *  # Date Ŭ������ Ȱ��
		 *  . Date Ŭ���� ��ü���� ��, ��, ��, ��, ��, �ʸ� ��������
		 *  . get���� �����ϴ� �޼ҵ带 ����Ѵ�.
		 *  . �����Ϸ��� set���� �����ϴ� �޼ҵ带 ����ϸ� �ȴ�.
		 *  
		 *  . Date Ŭ������ 1900���� �������� ��¥�� ó���Ѵ�.
		 *  . ���� �������� 1900�� ���ؼ� ���;� �ϰ� �־��� ���� 1900�� ���� �־���� �Ѵ�.
		 *  . ���� �������� 1�� ���ؼ� ���;� �ϰ� �־��� ���� 1�� ���� �־���� �Ѵ�.
		 *   
		 */
		Date date = new Date();
		System.out.println("�� : " + (date.getYear() + 1900));
		System.out.println("�� : " + (date.getMonth() + 1));
		System.out.println("�� : " + date.getDate());
		System.out.println("���� : " + date.getDay());
		// �Ͽ���(0), ������(1), ..., �����(6)
		
		System.out.println("�� : " + date.getHours());
		System.out.println("�� : " + date.getMinutes());
		System.out.println("�� : " + date.getSeconds());
		
		/*
		 * Calendar Ŭ������ singleton �������� ����� Ŭ�����̹Ƿ� ��ü�� ����� ����� �� ����.
		 * ��ü�� ����� ����� �� ���� Ŭ������ Ŭ���� ���ο� �ڽ��� Ŭ������ ���� ��ü�� ������ �ְ�
		 * ���ο� ������ �ִ� Ŭ���� ��ü�� ������ �޼ҵ带 �����ؼ� ����Ѵ�.
		 * 
		 */
		// Calendar caldendar = new Calendar(); // new�� ����ؼ� ��ü�� ������ �� ����.
		Calendar calendar = Calendar.getInstance(); // getInstance() : Ŭ���� ���ο��� ����� �ڽ��� Ŭ���� ��ü�� ���´�.
		System.out.println(calendar);
		/*
		 * Calendar Ŭ���� ��ü�� ��¥  �� �ð� ���� �̿��� �� ���� ������ ������ �����Ƿ�
		 * SimpleDateFormat Ŭ���� ��ü�� �̿��� ������ �����Ϸ���
		 * getTime() �޼ҵ带 ��¥�� �ð��� ���� �� ������Ѿ� �Ѵ�.
		 */   
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}