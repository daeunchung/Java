package step1;

// # �ݺ��� �⺻���� [1�ܰ�]

public class Ex15_2Q {

	public static void main(String[] args) {
		
		// ����1) 1~10���� �ݺ��� 5~9 ���
		int i = 0;
		while( i <= 10 ) {
			if(5 <= i &&  i < 10) {
				System.out.print(i + " "); // " " �ϸ� ��ĭ���
			}
			i++;
		} // ����1) 5, 6, 7, 8, 9
		System.out.println();
				
		// ����2) 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		i = 10;
		while( i > 0 ) {
			if(3 <= i && i <=6 ) {
				System.out.print(i + " ");
			}
			i--;
		} // ����2) 6, 5, 4, 3
		System.out.println();
				
		// ����3) 1~10���� �ݺ��� ¦���� ���
		i = 1;
		while( i <= 10) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		// ����3) 2, 4, 6, 8, 10
		System.out.println();
	}
}
