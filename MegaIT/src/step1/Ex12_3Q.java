package step1;
/*
 * # ���������� ����[2�ܰ�]��
 *   if - else if �������� �����غ���.
 */
import java.util.Random;
import java.util.Scanner;

public class Ex12_3Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(3);
		System.out.println("����(0),����(1),��(2) �Է� : ");
		int me = scan.nextInt();
		
	
		if(me==com)
			System.out.println("����");
		
		if(com == 0 && me == 1) {
			System.out.println("�̰��.");
		}
		else if(com == 1 && me == 2) {
			System.out.println("�̰��.");
		}
		else if(com == 2 && me == 0) {
			System.out.println("�̰��.");
		}else 
			System.out.println("����.");
	}

}
