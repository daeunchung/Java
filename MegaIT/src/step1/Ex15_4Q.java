package step1;

import java.util.Random;
import java.util.Scanner;

/*
 * # ������ ����[3�ܰ�]
 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
 * 2. ������ ���߸� 20���̴�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */
public class Ex15_4Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("������ ������ 5ȸ �ݺ��մϴ�");
		int cnt = 0;
		int i = 1;
		
		while(i <= 5) {
		int ans = 0;
		int num1 = ran.nextInt(9) + 1;
		int num2 = ran.nextInt(9) + 1;
		ans = num1 * num2;
		
		System.out.println(num1 + " * " + num2 + " = ?");
		int myAns = scan.nextInt();
		
		if(ans == myAns) {
			cnt += 1;
		}
		i++;	
	}
		
		System.out.println(cnt + "ȸ ������ ����׿�!");
		System.out.println("������ " + cnt*20 + "�� �Դϴ�");	
}

}
