package step1;

import java.util.Scanner;

/*
 * # �ݺ��� ����(-100)
 * 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
 * 2. �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�.
 */
public class Ex16_2Q {

	public static void main(String[] args) {
		int i = 1;
		Scanner scan = new Scanner(System.in);
		
		while(i == 1) {
		System.out.print("���ڸ� �Է��Ͻÿ�.[����:-100] ");
		int num = scan.nextInt();
		
		if(num != -100) {
			i = 1;
		}else if(num == -100) {
			System.out.println("���α׷� ����");
			i = 0;
			}
		
		}
	}
}


