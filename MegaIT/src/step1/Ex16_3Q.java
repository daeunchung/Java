package step1;
/*
 * # Up & Down ����[2�ܰ�]
 * 1. ������ ���߸� ������ ����ȴ�.
 * 2. 100������ ������ ������ �Է��� ������ 5���� �����ȴ�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex16_3Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int cnt = 0;
		int score = 0;
		int j = 1;
		
		int num = ran.nextInt(100) + 1;
		
		while(j == 1) {
			//������� j ��ſ� boolean run = true ;  �Ŀ�
			//while(run == true) ���� �� �����϶� run = false �� �ٲ���
			System.out.println("���ڸ� ���߽ÿ�.");
			int ans = scan.nextInt();
			
			//�����̴� while�� ���� if���� sysout�� �������� �־��
			//�׷��� �Է��� �ѹ��� �ް� ��������� ������
			//��ȸ �Է��� �������� ��¹��� while�� �ȿ� if�� �ۿ� ���
		
			if(ans > num) {
				System.out.println("Down!");
				cnt ++;
			}else if(ans < num) {
				System.out.println("Up!");	
				cnt ++;
			}else if(ans == num) {
				System.out.println("�����Դϴ�!");
				cnt ++; j = 0;
			}	
	}
		System.out.println(cnt + " ȸ���� ������ ����׿�!");
		score = 100 - cnt * 5;
		System.out.println("������ " + score + " �Դϴ�.");
	}
}
