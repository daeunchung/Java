package hijava;

/*@author ������
  @update 2019.01.20
 */

public class HelloJava {
	String message = "Hello World";
	
	
	public static void main(String[] args) {
		
		 //HelloJava���� say��� ����� ����
		HelloJava.say("Hi~");
		
		//JVM�� ������ ȭ�鿡 ���
		System.out.println("Hello Java!!");
		char a= '��';
		System.out.println((int)a);
		
	}

	private static void say(String msg) {
			System.out.println(msg);
	}

}
