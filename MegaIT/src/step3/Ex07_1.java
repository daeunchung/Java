package step3;

public class Ex07_1 {
	public static void main(String[] args) {

		int[] arr = {87, 100, 24, 11, 79};
		
		int[] temp = arr;
		// ���ȣ�� ���� �������� �ּҸ� ���尡���ϴ�
		// int[] temp = arr; �ϸ� �迭�� ���� �Ȼ���� �ּҸ� �� ����Ǵ� ��
		// temp�� �����ϴ��� arr�� �����ϴ���(temp[1] = 0; arr[1] = 0;)������� �� �迭�� �����Ǿ ������ �Ѵ� �ٲ�
		// 
		
		temp[1] = 0; // arr[1] = 0; �ص� ���� ��� 
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		System.out.println(arr);
		System.out.println(temp);
		// �Ѵ� �̸��� ����غ��� [I@15db9742 �� �Ѵ� ���� �ּҸ� ������ ������ Ȯ���� �� �ִ�

	}
}
/*int[] arr = {87, 100, 24, 11, 79}; 

��������

int[ ] arr= new int[5];

arr[0] =87;

arr[1] =100;

arr[2] =24;

arr[3] =11;

arr[4] =79;

���ټ������� ���ٷ� ����س�����*/
