package step2;

public class Ex01_2 {

	public static void main(String[] args) {
		
		// 1. �迭 ����(1)
		int[] arr = new int[3]; // java�� �̷��� �ϸ� 3ĭ �� �⺻ 0���� ä����
		
		// �º��� arr�� stack�� ����ȴ�. �캯�� new int[3]�� heap�� ����ȴ�.
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		// 2.�迭 ����(2) : �����
		
		int[] temp = {10, 20, 30};
		
		for(int i = 0; i < 3; i++) {
			System.out.println(temp[i]);
		}
		
	}

}
