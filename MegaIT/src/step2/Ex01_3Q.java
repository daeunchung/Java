package step2;
/*
* # �迭 �⺻����
*/
public class Ex01_3Q {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		for(int i = 0; i < 5; i++ ) {
			arr[i] = 10 * (i+1);
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		
		// ����2) 4�� ����� ���
		// ����2) 20 40
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 1) {
				arr[i] = 10 * (i+1);
				System.out.print(arr[i] + " ");
			}
		}System.out.println();
		
		
		// ����3) 4�� ����� �� ���
		// ����3) 60
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			
			if(arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		System.out.print(sum);
		System.out.println();
		
		
		// ����4) 4�� ����� ���� ���
		// ����4) 2
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.print(cnt);
		System.out.println();
				
		
		// ����5) ¦���� ���� ���
		// ����5) 5
		cnt = 0;
		for(int i = 0; i < 5; i++) {
			
			if(arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.print(cnt);
		System.out.println();

	}

}
