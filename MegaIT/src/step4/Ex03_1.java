package step4;
// # ���ڿ� 2����
public class Ex03_1 {

	public static void main(String[] args) {
		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
	
		String[] arr = str.split(",");
		
		for(int i = 0; i<arr.length; i++) {
			String[] info = arr[i].split("/");
			// �迭 info �� [1][2]¥�� �迭
			// info[1]���� �̸� ���ڿ�, info[2]���� ���� ���ڿ�
			
			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
			// score �迭�� int �迭�̶�   ���ڿ� -> ����  ��ȯ �ʿ�
		}
		
		for(int i = 0; i<3; i++) {
			System.out.println(name[i] + " : " + score[i] + "��");
		}
		
	}


}
