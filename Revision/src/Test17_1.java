/* FAIL
public class Test17_1 {
	String carName;
	public Test17_1(String str) {
		carName = str;
	}
}
	class Test17_11{
	public boolean equals(Object obj) {
	Test17_1 tmp = (Test17_1)obj; //�Է����� ���� obj�� Car class�� ĳ������
	if(carName.equals(tmp.carName))
		System.out.println("����");
	else
		System.out.println("�ٸ���");
	}
	
	public static void main(String[] args) {
	Test17_11 ee = new Test17_11();
	
	}
	}
*/


/*
equals�޼��� ���� num1==num2 ó�� �⺻ �������� ���� ���ϴ°�ó�� ���� -> false
StringŬ������ ���� ��ü�� ���뿡 ���ؼ� ���� ��� ������ �޸𸮿� �Ҵ�ܾ����� �Ǵ�

String str1 = new String("�ڹ�");
String str2 = str1 ; //������ �޸𸮿� �����ȴ� , ���� �޸� ���
if(str1==str2) ----> true

String str1 = new String("�ڹ�");
String str2 = new String("�ڹ�");//���� ���ڿ� ���������� �޸� ��ġ �޶�
if(str1.equals(str2)) //true ���ڿ������� ���ϴ°ɷ� �ν�
//str1�� ��ü�� equals�޼��带 �̿��ϰ� �޼����� �Ű������� str2�� ���� //"�ڹ�"���ڿ��� �Է°����� �����ϱ�


class Car{
String carName = "Ƽ��";
{
Car car1 = new Car();
Car car2 = new Car();
if(car1.equals(car2)) //�ΰ�ü���� ���ڿ� ������ ������ �ΰ��� Ŭ���� ��ü�� �ٸ��Ƿ� ����� false
//�̷��� ��ü������Ϸ��� equals�޼��带 �������̵��ؼ� ���ؾ���


*/