package step2;

import java.util.Scanner;

/*
 * # �ߺ����� ����[1�ܰ�]
 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
 * 
 * ��)
 * �������� : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * �������� : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * �������� : 2
 * check = {0, 1, 1, 1, 0}
 * arr   = {1, 3, 2, 0, 0}
 */
public class Ex04_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] check = new int[5];
		int[] arr = new int[5];
		System.out.println("0~4 ������ ���ڸ� �Է��Ͻÿ�. �� �ߺ��Ǵ� ���ڴ� ������մϴ�.");
		
		
		for(int i = 0; i < 5; i++) {
			System.out.print("�������� : ");
			int num = scan.nextInt();
			
			check[num] = 1;
			arr[i] = num;
			
			System.out.print("check = {");
			for(int j=0; j<5; j++) {
				System.out.print(check[j] +  " ");
			}System.out.print("}\n");
			
			System.out.print("arr = {");
			for(int j=0; j<5; j++) {
				System.out.print(arr[j] +  " ");
			}System.out.print("}\n");

		}System.out.println("����");
	}
}
