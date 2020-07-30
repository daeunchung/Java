
public class Exam11_1 {
	public Exam11_1() {
		//public키워드 뒤에 바로 클래스명과 동일한 이름의 메서드가 보여지는데 
		//반환타입이 없는걸 보니 생성자 라고 부른다.
		System.out.println("이 부분은 생성자");
	}
	public Exam11_1(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("오버로딩된 생성자");
		}
	}
	public static void main(String[] args) {
		Exam11_1 ex1 = new Exam11_1();
		Exam11_1 ex2 = new Exam11_1(3);
	}

}
//생성자 : 객체가 생성될때 기본적으로 해야하는 일들을 정해놓는 코드의 집합
//생성자 : 객체가 생성될 때 변수를 초기화하는 작업//자동으로 호출됌
//생성자 : <<반드시 클래스명과 같도록>> 하고 , 반환데이터형 작성 X , 접근제한자는 일반적으로 public
//접근제한자 생성자명칭(매개변수 리스트){
//문장;
//}
//객체생성 TestClass test = new TestClass(); 시에 생성자가 자동호출됌
//생성자 오버로딩은 메서드 오버로딩과 유사함 (매개변수의 개수또는 데이터형이 다르면 됌)
//프로그래머가 생성자를 정의하지 않을 경우 디폴트 생성자가 자동으로 정의됌