package step3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//����1) 1~�鸸 ������ ���ڸ� �Է¹ް� ��� ���� ��� 
        //(�� ! ¦���ڸ��� ���� ¦���ڸ���� ���)
		// ��)  123 ==> 2
		// ��)  1234 ==> ¦���� �ڸ��̴�
		// ��)  1 ==> 1
		// ��)  1234567 ==> 4
		
		// ��Ʈ �ڸ����� ���ϰ� �迭�� ������� �ϳ��� ���� 
		// ��) ==> 123 ==> 3 ==> arr[] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1~1000000 ������ ���� �Է� : ");
		int num = scan.nextInt();			// num : ����ڰ� �Է��� ��
		int temp = num;
		
		int cnt = 1;

		while(true) {
			temp = temp / 10;
			cnt ++;
			
			if(temp < 10) {
				break;
			}
		}
		
		System.out.println("���ڴ� " + cnt + "�ڸ���");
		
		if(cnt % 2 == 0) {
			System.out.println("¦���� �ڸ��̴�");
		}else if(cnt % 2 == 1) {
			int arr[] = new int[cnt];
			
			for(int i = cnt-1; i>=0; i--) {
				arr[i] = num % 10;
				num = num / 10;
			}
//			for(int i = 0; i<cnt; i++) {
//				System.out.print(arr[i]+ " ");
//			}
			System.out.println(arr[cnt/2]);
		}

	}

}
// 2020-04-29
