package step4;

public class Ex01_1M {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// ���� 1) ���� ���
		// ���� 1) 30��
		String year = jumin.substring(0, 2);
		int yearnum = Integer.parseInt(year);
		int age = 2020 - (1900 + yearnum) + 1;
		System.out.println("���� : " + age);
		
		// ���� 2) ���� ���
		// ���� 2) ����
		char key = jumin.charAt(7);
		if(key == '1' || key == '3') {
			System.out.println("����");
		}else if(key == '2' || key == '4') {
			System.out.println("����");
		}
			
	}

}
