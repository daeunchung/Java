package step2;
import java.util.Scanner;
/*
 * # �迭 ��Ʈ�ѷ�[1�ܰ�] : ����
 * 1) �߰�
 * 2) ����
 * 3) ����
 */

public class Ex09_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			
			System.out.println("[1]�߰�");
			System.out.println("[2]����");
			System.out.println("[3]����");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				System.out.print("�߰��� �� �Է� : ");
				int data = scan.nextInt();
				
			}
			else if(sel == 2) {
				
				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();
				
			}
			else if(sel == 3) {
				
				System.out.print("������ ��ġ �Է� : ");
				int idx = scan.nextInt();
				
				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();
				
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
			
		}

	}

}
