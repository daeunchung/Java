package hijava;

/*@author 정다은
  @update 2019.01.20
 */

public class HelloJava {
	String message = "Hello World";
	
	
	public static void main(String[] args) {
		
		 //HelloJava에게 say라는 명령을 내림
		HelloJava.say("Hi~");
		
		//JVM이 스스로 화면에 출력
		System.out.println("Hello Java!!");
		char a= '뷐';
		System.out.println((int)a);
		
	}

	private static void say(String msg) {
			System.out.println(msg);
	}

}
