//프레임 생성 예제
import java.awt.*;
public class Exam24_1 extends Frame {
	public Exam24_1() {//클래스이름과 동일한 생성자 만들기
		this.setLayout(new FlowLayout());
		this.setTitle("자바 프로그래밍");
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		this.add(btn1);
		this.add(btn2);
		}
	public static void main(String[] args) {
		Exam24_1 f = new Exam24_1();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}

/*
앞에서 다른 class Frame에도 각종 컴포넌트를 부착시킬수있었다
컨테이너 클래스 내에도 다른 컴포넌트를 포함할 수 있음

FlowLayout() : 객체들이 화면변화에 따라서 능동적으로 크기가 조절되는 배치형태
FlowLayout()을 쓰면 -> 적당한 크기고 적당한 위치를 잡아서 자동으로 출력
*/
