package step6;

//# �л��������� ���α׷�[1�ܰ�] : Ŭ���� + �޼���

class Ex5{
	//int total; int cnt; 
	// ���⿡ �������� ���� �ϴû����� �ߴ� �������
	// �޼��� �ȿ��� 0���� ���� �ʱ�ȭ���� ����� �������� �޸� ������ ��� �ٸ���
	
	int test1(int[] arr) { 
		int total = 0;
		for(int i = 0; i<arr.length; i++) {
			total += arr[i];
		}
		return total; 	
	}
	int test2(int[] arr) { 
		int total = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				total += arr[i];
			}
		}
		return total;
	}
	int test3(int[] arr) { 
		int cnt = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
	int test4(int[] arr) {
		int cnt = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
}

public class Ex05_1 {
	public static void main(String[] args) {

		Ex5 e = new Ex5();
		
		int[] arr = {87, 100, 11, 72, 92};

		// ���� 1) ��ü �� ����
		// ���� 1) 362
		int tot = e.test1(arr);
		System.out.println("tot = " + tot);
		
		// ���� 2) 4�� ����� �� ����
		// ���� 2) 264
		tot = e.test2(arr);
		System.out.println("tot = " + tot);
		
		// ���� 3) 4�� ����� ���� ����
		// ���� 3) 3
		int cnt = e.test3(arr);
		System.out.println("cnt = " + cnt);
		
		// ���� 4) ¦���� ���� ����
		// ���� 4) 3
		cnt = e.test4(arr);
		System.out.println("cnt = " + cnt);
		
	}
}
