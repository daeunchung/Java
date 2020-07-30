//인터페이스 활용은 추상클래스랑 추상메서드 쓰는방법과 동일 + 모든메서드에 public선언 필수
interface VolumeSystem{
	void volumeUp();
	void volumeDown();
	//인터페이스에서는 메서드의 구체적인 내용 적지 않고 명칭만 작성 (추상메서드처럼)
	//구현하는 곳에서 구체적인 내용 작성
}
public class Exam15_1 implements VolumeSystem{
	public void volumeUp() {
		System.out.println("볼륨을 높인다");
	}
	public void volumeDown() {
		System.out.println("볼륨을 낮춘다");
	}

	public static void main(String[] args) {
		Exam15_1 audio = new Exam15_1();
		audio.volumeUp();
		audio.volumeDown();
	}
}
//인터페이스는 클래스랑 다름
//명칭과 매개변수가 동일한 메서드로 객체에 접근 가능하도록 하기위한 기법
//인터페이스에 모든 메서드 = 추상메서드 -> abstract따로 안씀
//인터페이스에 정의된 메ㅣ서드는 인터페이스를 사용하는 클래스에서 반드시 구현
//인터페이스의 모든 메서드는 public 내부에서는 public abstract로 인식
//인터페이스를 적용하는 클래스에서 인터페이스릐 메서드 내용을 구체적으로 구현
//자바 클래스는 다중상속 불가능 -> 인터페이스로 다중 상속 가능