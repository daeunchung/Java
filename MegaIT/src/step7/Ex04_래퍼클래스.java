package step7;
/*
 * # ���� Ŭ����(wrapper class)
 * - ���� Ŭ������, �⺻ �ڷ����� Ŭ������ ����� ���� ���� �ǹ��Ѵ�.
 * * [�⺻��]          [���� Ŭ����]
* byte             Byte
* short            Short
* int              Integer
* long             Long
* float            Float
* double           Double
* char             Character
* boolean          Boolean
*/
class MyInteger{
	int a;
	
	MyInteger(int a){
		this.a = a;
	}
}

public class Ex04_����Ŭ���� {
	public static void main(String[] args) {
		int a = 10;
		Integer i = new Integer(10);
		
		float b = 10.1f;
		Float f = new Float(10.1);
		
		double d = 10.1;
		Double dd = new Double(10.11);
		
		MyInteger ii = new MyInteger(100);
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(dd);
		System.out.println(ii);
		System.out.println(ii.a);
		
	}
}
