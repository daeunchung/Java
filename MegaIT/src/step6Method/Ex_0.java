package step6Method;

class Ex {
	// 클래스의 구성요소
	// (1)변수[속성] (2)메서드[기능]
	
	// 메서드의 구조
	// 리턴타입 메서드명(){
	//		구현할 내용;
	// }
	
	// 반환값 없음 : void
	// return이 생략가능
	
	void sayHello() {
		System.out.println("안녕하세요.");
		// 메서드 종료
		return;
	}
	
}

public class Ex_0 {
	public static void main(String[] args) {
		
		Ex e = new Ex();
		e.sayHello();
		System.out.println("프로그램 종료");
	}
}


// Ex09_1.main(null);













