package step5;
// # �л��������� ���α׷�[1�ܰ�] : Ŭ���� + ����
class Ex03{
	int[] arr = {87, 100, 11, 72, 92};
}

public class Ex02_1 {
	public static void main(String[] args) {
		
		Ex03 e = new Ex03();
		
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		int total = 0;
		for(int i = 0; i<e.arr.length; i++) {
			total += e.arr[i];
		}
		System.out.println("total = " + total);
		
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		total = 0;
		for(int i = 0; i<e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				total += e.arr[i];
			}
		}
		System.out.println("total = " + total);
		
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		int count = 0;
		for(int i = 0; i<e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				count ++;
			}
		}System.out.println("count = " + count);
		
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		
		count = 0;
		for(int i = 0; i<e.arr.length; i++) {
			if(e.arr[i] % 2 == 0) {
				count ++;
			}
		}System.out.println("count = " + count);
		
	}
}
