//내부 -> 외부 클래스 접근 : 제한없이 가능
//외부 -> 내부 클래스 맴버 변수나 메서드 접근 : 객체생성 필수
//컴파일 한 뒤에는 내부 클래스 파일이 변도로 생성  : 외부클래스명$내부클래스명.class
//GUI 프로그래밍에서 이벤트 처리에 활용
public class Exam16_1 {
	public Exam16_1() {
		System.out.println("외부 클래스의 생성자");
		InnerExam inner = new InnerExam();
		//외부 -> 내부클래스 접근시에는 객체 생성을 해야함
		inner.printExam();
	}
	public void printOuter() {
		System.out.println("외부 클래스의 메서드");
	}
	class InnerExam{
		public void printExam() {
				System.out.println("내부 클래스 메서드");
				printOuter();//외부클래스에 포함된 메서드에 직접 접근 가능
			}
		}
	public static void main(String[] args) {
		Exam16_1 outer = new Exam16_1();
	}
}
