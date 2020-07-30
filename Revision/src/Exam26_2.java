//WindowEvent 예제
import java.awt.*;
import java.awt.event.*;

public class Exam26_2 extends Frame {
	public Exam26_2() {
		this.setLayout(new FlowLayout());
		this.addWindowListener(new WindowHandler());
		//WindowHandler객체는 계속 유지할 필요가 없으므로 즉석에서 생성후 사용
	}	
	class WindowHandler extends WindowAdapter {//핸들러클래스를 내부에 만들어
		public void windowClosing(WindowEvent e) {
			//WindowEvent e : 우측 상단에 닫기x버튼이 눌릴경우에
			//윈도우가 닫히는 순간에 처리되어야할 일들을 {  }내부에 작성
			System.exit(0);//프로그램 종료
		}
	}
	public static void main(String[] args) {
		Exam26_2 f = new Exam26_2();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
/*
리스너(Listener)
컴포넌트에 이벤트 발생시 이벤트 종류에 맞는 이벤트 리스너 실행
리스너는 인터페이스 !!!!!! 리스너를 구현한 클래스에서는 리스너의 모든 추상메서드 다 구현해야함
-> 부작용 : 사옹하지도 않은 매서드를 구현해야함
어댑터(Adapter)
리스너 인터페이스를 사용하기 쉽게 만든 클래스
리스너 인터페이스의 추상 메서드가 2개 이상인 경우에 어탭터 클래스 제공
쓸때 필요한 메서드만 쓸수있음

WindowListener 인터페이스는 제공 메서드가 무려 7개 !!!
인터페이스 구현해서 Handler 클래스 생성할꺼면 메서드를 다 쓰던안쓰던 무조건 7개 메서드 다 적어줘야해 !!!
-> 안쓰는 메서드들은 { } 이렇게 비워놓고 , 쓸 메서드 안에만 { 코드작성 }
*/