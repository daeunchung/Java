package step6;
class Return{
	int result;
	int arr[];
	
	void plus(int a, int b) {
		result = a + b;
	}
	
	void copyArr(int arr[]) {
		this.arr = arr;
	} 
	// ���ο��� �־��� arr[]�迭�� Return Ŭ���� �ȿ��ִ� arr[]��
	// �״�� copy�ϴ� �޼���
	
	int rePlus(int a, int b) {
		return a + b;
	}
	
	int[] reArr() {
		arr = new int[4];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		// �Է¹޴� ������ ���� ũ��4¥�� �迭�� �����ؼ�
		// Return Ŭ���� �ȿ��ִ� arr[]�� ���� �־��ִ� �޼���
		
		return arr;
	}
}

public class Ex03_1 {
	public static void main(String[] args) {
		
		Return r = new Return();
		r.plus(3, 10);
		System.out.println(r.result);
		
		int result = r.rePlus(10, 3);
		System.out.println(result);
		
		System.out.println("======================");
		int arr[] = {10, 20, 30, 40};
		r.copyArr(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(r.arr[i] + " ");
		}System.out.println();
		
		int arr2[] = r.reArr();
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}System.out.println();
		
	}
}
