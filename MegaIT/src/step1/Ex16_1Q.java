package step1;
/*
 * # ������ ���[2�ܰ�]
 * 1. 5�� �ֹ��� �޴´�.
 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
 * 
 * ��)
 * �޴� ���� : 1
 * �޴� ���� : 1
 * �޴� ���� : 2
 * �޴� ���� : 2
 * �޴� ���� : 3
 * �� �ݾ� = 31300��
 * ���� �Է� : 32000
 * === �Ե����� ������ ===
 * 1. �Ұ�� ���� : 2��
 * 2. ����    ���� : 2��
 * 3. ��         �� : 1��
 * 4. ��   ��   �� : 31300��
 * 5. ��         �� : 700��
 */
import java.util.Scanner;

public class Ex16_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int i = 1;
		int total = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		while(i < 6) {
			System.out.print("�޴� ���� : ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				total += price1;
				cnt1 += 1;
			}else if(menu == 2) {
				total += price2;
				cnt2 += 1;
			}else if (menu == 3) {
				total += price3;
				cnt3 += 1;
			}else {
				System.out.println("�޴��� 1��2��3�� 3���� �Դϴ�");
				i--;
			}
			i++;	
		}
		
		System.out.println("�� �ݾ� = " + total);
		System.out.println("���� �Է� : ");
		int input = scan.nextInt();
		if(input >= total) {
		System.out.println("=== �Ե����� ������ ===");
		System.out.println("1. �Ұ�� ���� : " + cnt1 + "��");
		System.out.println("2. ����    ���� : " + cnt2 + "��");
		System.out.println("3. ��         �� : " + cnt3 + "��");
		System.out.println("4. ��   ��   �� : " + total + "��");
		System.out.println("5. ��         �� : " + (input - total));
		}
		else
			System.out.println("������ �����մϴ�");
		
	}
}
