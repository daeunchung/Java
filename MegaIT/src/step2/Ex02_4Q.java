package step2;
/*
 * # �л��������� ���α׷�[4�ܰ�] : 1���л�
 */
public class Ex02_4Q {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		int max = 0;
		int topidx = 0;
		// ����) 1���л��� �й��� ���� ���
		// ����) 1004��(98��)
		for(int i = 0; i < 5; i++) {
			if(scores[i] > max) {
				max = scores[i];
				topidx = i;
			}
		}
		
		System.out.println(hakbuns[topidx] +"�� " + scores[topidx] + "�� " );

	}

}
