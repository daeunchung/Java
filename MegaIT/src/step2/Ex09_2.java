package step2;
import java.util.Scanner;
/*
 * # �迭 ��Ʈ�ѷ�[1�ܰ�] : ����
 */

public class Ex09_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
				
		boolean run = true;
		while(run) {
			int wrong = 0;
			
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("[2]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 2) {
				if(cnt == 0) {
					System.out.println("������ ���� �������� �ʽ��ϴ�.");
					continue;
				}
				
				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();
				
				for(int i = 0; i < 5; i++) {					
					if(data == arr[i]) {
						arr[i] = 0;
						cnt--;
					}
					else if(data != arr[i]) {
						wrong++;
					}
				}
				
				if(wrong == 5) {
					System.out.println("�Է��� ���� �������� �ʽ��ϴ�.");
				}
					/*if(data != arr[i]) {
						System.out.println("�Է��� ���� �������� �ʽ��ϴ�.");
						break;
					}*/
				
				
				
				
				}
				
			}
		}
	}


