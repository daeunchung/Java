package lesson01;

// �ڹ��� ��� Ŭ������ Object Ŭ������ ��ӹ޾� ���������.
public class PersonTest {
	public static void main(String[] args) {

		Person person = new Person();
		System.out.println(person);					// lesson01.Person@15db9742
		// toString() :  ��ü�� ����� ������ ����Ѵ�.
		// ��ü�� ����� �� toString() �޼ҵ带 �ٿ����� �ʾƵ� �ڹ� �����Ϸ��� �ڵ����� �ٿ��ش�.
		System.out.println(person.toString());		// lesson01.Person@15db9742
		
		Person person2 = new Person("ȫ�浿", true, "1�� �Դϴ�.");
		System.out.println("person2 : " + person2);
	
		Person person3 = new Person("ȫ�浿", true, "1�� �Դϴ�.");
		System.out.println("person3 : " + person3);
		
		person.count = 100;
		System.out.println(person2.count);
		
		Person.count = 999;
		System.out.println(person.count);
		System.out.println(person2.count);
		System.out.println(person3.count);
	
	}

}
