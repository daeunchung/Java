//toString()�޼��� equals()�޼���
//public String toString() ��ü�� ���ڿ��� ��ȯ
//public boolean equals(Object obj) �� ��ü��  ������ ���Ͽ� 
//�ΰ�ü�� ������ ��,�ٸ��� ������ ��ȯ - ��ü Ÿ���� �Ű������� �޾�
public class Exam17_1 {
	public static void main(String[] args) {
		Exam17_1 exam = new Exam17_1();
		System.out.println(exam.toString());
		//��ü�� Ŭ������� �ؽ��ڵ�(�������ڿ�) ���
		String str1 = new String();
		String str2 = new String();
		System.out.println(str1 == str2);
		String str3 = str1;
		System.out.println(str1 ==str3);
	}
}
//�ڹ��� �ֻ���Ŭ������ java.lang.ObjectŬ���� - lang��Ű������ ObjectŬ����
//�ڹ��� ��� Ŭ������ ObjectŬ������ ��� (���������� extendŰ���� ����)
//Ŭ������ü��.toString() -> Ŭ������� �ؽ��ڵ��� ������ ���

//Ŭ������ Ư���� ���� �ٸ� ���ڿ��� ����Ϸ��� toString�޼��带 ������ ���� �������̵��Ͽ� ����
//public String toString(){ --------}
