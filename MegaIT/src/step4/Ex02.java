package step4;
// # ���ڿ� 1����
public class Ex02 {

	public static void main(String[] args) {
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int sum = 0;
		int[] arr = new int[3];
		String[] ar = str.split("/");
		for(int i = 0; i<3; i++) {
			arr[i] = Integer.parseInt(ar[i]);
			sum += arr[i];
		}System.out.println(sum);
		
		
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = ""; // �� ���ڿ��� ����� ���´ٴ� �� �´���?
		
		for(int i = 0; i<scores.length; i++) {
			text += scores[i] + "";
			// scores[i] ���ڰ��� "" �ؼ� (�ļ��ι��ڿ�ȭ) ���ڿ��� �־��ֱ�
			if(i != scores.length - 1) {
				text += "/";
			}
		}System.out.println(text);

 
	}

}
