package step1;
import java.util.Random;
import java.util.Scanner;
/*
 * # Ȧ¦ ����
 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
 * 2. ����� ���� ���ڸ� �����ְ�,
 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
 */

public class Ex11_1Q {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	int num = ran.nextInt(100) + 1;
	System.out.println(num);
	System.out.println("�ش� ���ڰ� Ȧ������ ¦������ ���߽ÿ�");
		System.out.println("1.Ȧ��");
		System.out.println("2.¦��");
		System.out.print("��ȣ�� �����ϼ��� : ");
		int choice = scan.nextInt();
		
		if(num%2 == 1) {
			if(choice == 1) {
				System.out.println("����");
			}
			if(choice == 2) {
				System.out.println("��!");
			}
		}
		
		if(num%2 == 0) {
			if(choice == 1) {
				System.out.println("��!");
			}
			if(choice == 2) {
				System.out.println("����");
			}
		}
	}

}
