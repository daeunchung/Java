package step2;
/*
 * # 4�� ����� ����
 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
 */
public class Ex05_2Q {

	// 13:00 ~ 13:20(20��)
	
	public static void main(String[] args) {
		int cnt = 0;
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		for(int i = 0; i < 5; i++) {
			
			if( arr[i] % 4 == 0 ) 
				cnt++;
			}
		
		temp = new int[cnt]; // =======>> �̰� ���� ��ٷӴ� ���� ����� �˾ƾ� ����
		
		//heap���� �迭ũ�⸦ cnt�� ���� stack�� �� �ּ� ������ �ִ� temp���� �־��ذǰ� ~?
		//temp�� int[cnt]�ּҰ��� �����Ǿ����� ���� �� ������  �迭�ȿ� ���� ���尡��
		
		
		int j = 0;  // =======>> �̰� ���� ��ٷӴ� ���� ����� �˾ƾ� ����
		
		for(int i = 0; i < 5; i++) {
			
			if( arr[i] % 4 == 0 ) {
				temp[j] = arr[i]; // �� �޾Ƽ� �迭�ȿ� �����Ŵ
				j++;
			}
		}
		
		System.out.print("{");
		for(int i = 0; i < cnt; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.print("}");
	}

}
// temp[cnt] = arr[i]; // java.lang.NullPointerException��� ������







