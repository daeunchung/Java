package step4;
// # �ֹε�Ϲ�ȣ �˻�
public class Ex01_1 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// ���� 1) ���� ���
		// ���� 1) 30��
		String year = jumin.substring(0, 2);
		System.out.println("����⵵ : 19" + year);
		
		int cen = 1900;
		int birth = Integer.parseInt(year);
		int yearOfBirth = (cen + birth);
		System.out.println("���� : " + (2020 - yearOfBirth + 1));
				
		// ���� 2) ���� ���
		// ���� 2) ����
		String[] arr = jumin.split("-");
		String genderTag = arr[1].substring(0, 1);
		int gender = Integer.parseInt(genderTag);

		if(gender == 2) {
			System.out.println("���� : ����");
		}else {
			System.out.println("���� : ����");
		}
	}

}
