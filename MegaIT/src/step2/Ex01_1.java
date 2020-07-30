package step2;
/*
 * # �迭(array)
 * 1. "���� ����"�� �����͸� "������" �����ϱ� ���� ���
 * 2. ����
 * 		int num = 10;
 * 		int[] arr = new int[���� ����];
 * 		int arr[] = new int[���� ����];
 * 3. �ε���(index)
 * 		0���� �����ϴ� ���ȣ(index)�� �ο��ȴ�.
 * 4. �ּ� ����
 * 
 * 
 * 
 * 
 * new : ���޸𸮿� ������ �� 1���� �������� !
 * ������ ��� stack�޸𸮿� ����
 * 
 */

public class Ex01_1 {

	public static void main(String[] args) {
		// 1. �Ϲݺ���(�� ����)
		int num = 0;
		num = 10;
		System.out.println("num = " + num);
		
		// 2. �ּҺ���(�ּ� ����)
		int[] arr = null;              		// null(�ּҰ� ����)
		//�ּҴ� �ȳ־��ְ� stack�� int[] arr�� ���������ǰ� ~?
		
		arr = new int[5];
		//stack�� ����� ���� ���ڿ� heap���� �迭 ���� �ּҸ� �־��ذǰ� ~?
		
		System.out.println("arr = " + arr); // [I@15db9742  [ �� �����ִ� : �迭 �ּ� 
		// I : integer �� ������
		// java�� �ڵ����� 0�� ����Ǿ��ִ�.
		
		System.out.println(arr[0]);			// 0
		System.out.println(arr[1]);			// 0
		System.out.println(arr[2]); 		// 0
		System.out.println(arr[3]);			// 0
		System.out.println(arr[4]);			// 0
		System.out.println();

		// java.lang.ArrayIndexOutOfBoundsException : 5
		// System.out.println(arr[5]);
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

	}

} // int[] arr = new int[5]; //������ stack�� ����   ������ heap�� ����