package step2;

import java.util.Scanner;

/*
 * # �� ��ü�ϱ�[2�ܰ�] 
 */
public class Ex05_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = 0;
		int[] arr = {10, 20, 30, 40, 50};
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��    1) �ε���1 �Է� : 1
		//		   �ε���2 �Է� : 3
		//		  {10, 40, 30, 20, 50}
		System.out.println("���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�");
		System.out.print("index1�� �Է��Ͻÿ� : ");
		int idx1 = scan.nextInt();
		System.out.print("index2�� �Է��Ͻÿ� : ");
		int idx2 = scan.nextInt();
		
		t = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;
		
		System.out.print("{ ");
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");		
		}
		System.out.println("} ");
		
		

		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��    2) ��1 �Է� : 40
		//        ��2 �Է� : 20
		//		  {10, 20, 30, 40, 50}
		System.out.println("���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�");
		System.out.print("��1�� �Է��Ͻÿ� : ");
		int num1 = scan.nextInt();
		System.out.print("��2�� �Է��Ͻÿ� : ");
		int num2 = scan.nextInt();
		
		for(int i = 0; i < 5; i++) {
			if(num1 == arr[i]) {
				idx1 = i;
			}
			if(num2 == arr[i]) {
				idx2 = i;
			}
		}
			t = arr[idx1];  // ������� ���� ���� int t = 0; �ʱ�ȭ������Ͻð� ���⼭ �ٷ� int t = arr[idx1]��
			arr[idx1] = arr[idx2];
			arr[idx2] = t;
		
		System.out.print("{ ");
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");		
		}
		System.out.println("} ");
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};

		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// ��    3) �й�1 �Է� : 1002
		//        �й�2 �Է� : 1003
		//		 {87, 45, 11, 98, 23}
		System.out.println("���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�");
		System.out.print("�й�1�� �Է��Ͻÿ� : ");
		int hakbun1 = scan.nextInt();
		System.out.print("�й�2�� �Է��Ͻÿ� : ");
		int hakbun2 = scan.nextInt();
		
		for(int i = 0; i < 5; i++) {
			
			if(hakbun1 == hakbuns[i]) {
				idx1 = i;
			}
			if(hakbun2 == hakbuns[i]) {
				idx2 = i;
			}
		}
		
		t = scores[idx1] ;
		scores[idx1] = scores[idx2];
		scores[idx2] = t;
		
		System.out.print("{ ");
		for(int i = 0; i < 5; i++) {
			System.out.print(scores[i] + " ");		
		}
		System.out.println("} ");

	}

}
