package chapter01;

public class Ex05 {
	public static void main(String[] args) {
		
		// ���� ������
		int num = 1;
		if(num > 5) {
			System.out.println("5���� ũ��");
			
		}else {
			System.out.println("5���� �۴�");
		}
		// -----------------------------------------
		String result = num > 5 ? "5���� ũ��" : "5���� �۴�";
		System.out.println(result);
	}
}
 