
public class Exam18_1 {
	public static void main(String[] args) {
	String str1 = new String("Java Programming");
	System.out.println(str1.length());
	String str2 = new String("Java Programming");
	System.out.println(str1.equals(str2));
	String str3 = str1.substring(3);//�κй��ڿ� 3~���������� ����
	System.out.println(str3);
	str3 = str1.substring(0,3); //�κй��ڿ� 012�κ� ����
	System.out.println(str3);
	String str10 = new String("Java");
	String str11 = new String("Programming");
	System.out.println(str10 + str11);
	String str12 = 10.3 + str11;
	System.out.println(str12);
	
	StringBuffer sb = new StringBuffer();
	sb.append("Java Programming"); //���۴� ��������
	System.out.println(sb.toString());
	sb.replace(0, 5, "jsp");
	System.out.println(sb);
	sb.delete(0, 3);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	}
}
/*
StringŬ������ �⺻ �������� X ��ü �����ؾ� ��밡����

new �����ڸ� �̿��ؼ� ��ü�� ������ ��� ������ ���ڿ��� �����ϴ��� �ٸ� �������� �����Ǿ
String str1 = new String("�ڹ�");
String str2 = new String("�ڹ�"); 
System.out.println(str1==str2) : false

���ڿ� �Ҵ��� �̿��� ��ü������ �Ұ�� ������ ���ڿ��� ������ ��� ���� �������� �Ҵ�
String str1 = "�ڹ�";
String str2 = "�ڹ�";
System.out.println(str1==str2) : true

String str1 = new String("java programming");// index[0]~[15]�� 16��
System.out.println(str.length()); //16 : ���鵵 �Ѱ��� count
String str2 = new String("java programming");
System.out.println(str1.equals(str2)); //true
String str3 = str1.substring(3); //a programming ��ȯ
str3 = str1.substring(0,3); //jav ��ȯ

StringŬ������ �޼���� �ڽ��� ���ڿ��� �������� �����Ƿ� ���ο� ��ü�� �����Ͽ� ��ȯ �޾� ����ؾ���
+ ������ : ���ڿ��� ���� : ���ڵ����Ϳ� ���ڿ� ���ս� ���ڵ����Ͱ� ���ڿ��� �ڵ� ����ȯ�Ǿ� ����� ���ڿ� ��ȯ
*/