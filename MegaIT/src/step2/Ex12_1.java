package step2;
/*
 * # �Ҽ�ã��[2�ܰ�]
 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
 * ��)
 * �Է� : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 */
import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Ѱ� �Է� : ");
		int num = scan.nextInt();
		
		for(int i = 2; i<= num; i++) {
			int cnt = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}	

}