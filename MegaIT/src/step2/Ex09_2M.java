//2020-02-20 14:31-14:48
package step2;
/*
 * # �迭 ��Ʈ�ѷ�[1�ܰ�] : ����
 */
import java.util.Scanner;

public class Ex09_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		
		boolean run = true;
		while(run) {
			for(int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("[2]����");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			int delIdx = -1;
			
			if(sel == 2)
				
				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();
				
				// for(int i = 0; i < 5; i++) {// �߸����ݾ� !! �迭ũ��� ������ �پ��µ� i < 5�� �����Ǿ��ִٴ� !
				for(int i = 0; i < cnt; i++) {
					if(data == arr[i]) {
						delIdx = i;
					}
				}
				//for���� ��~~~ ���Ҵµ��� delIdx���� ������ �ȹٲ�� -1�̳�? -> for(int i=0; i<cnt; i++)����
				//��~�� arr[i] != data ���ٴ� �Ҹ� !
				//�� for�� �ڿ� delIdx���� ������ if-else �� �Ἥ ������ ����!
				
				if(delIdx == -1) {
					System.out.println("�Է��� ���� �������� �ʽ��ϴ�.");
				}else {
					for(int i = delIdx; i < cnt-1; i++) {
						arr[i] = arr[i+1];
					}cnt--;
				}
				
				if(cnt == 0 ) {
					System.out.println("���̻� ������ ���� �����ϴ�.");
					run = false;
				}
		}
	}

}
