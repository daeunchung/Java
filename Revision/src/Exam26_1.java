//ActionEvent 예제
import java.awt.*;
import java.awt.event.*;
public class Exam26_1 extends Frame {
	Button btn; //변수의 선언위치는 생성자 내부X 외부O : 생성자 외에 다른 클래스나 메서드에서 쓸수있도록
	public Exam26_1() { 
		this.setLayout(new FlowLayout());
		btn = new Button("자바 프로그래밍");
		this.add(btn);//현재클래스에 버튼객체 추가
		btn.addActionListener(new BtnHandler());//이켄트 핸들러와 연결시키는 부분
	}
	class BtnHandler implements ActionListener {//인터페이스를 구현
	//클래스Exam26_1 내부에 또다른 클래스를 정의한 내부클래스BtnHandler(EventHandler작성위함))
		public void actionPerformed(ActionEvent e) {
		btn.setLabel("버튼이 눌렸음");
		//ActionListener인터페이스가 제공하는 한개의 메서드 actionPerformed를 반드시 써줘야해
		//메서드 쓸꺼니까 {  } 안에 내용도 적어요
		}
	}
	public static void main(String[] args) {
		Exam26_1 f = new Exam26_1();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}

/*
이벤트 : 버튼 누르거나 텍스트상자에 입력 등의 사용자에 의한 상호작용
이벤트 소스 : 이벤트가 발생된 컴포넌트
이벤트 리스너 : 에빈트가 발생되기를 기다리는 객체
이벤트 핸들러 : 이벤트 처리를 담당하는 클래스 , 일반적으로 내부 클래스
ex. 버튼인 이벤트 소스에서 버튼을 누르는 이벤트가 발생하고 이벤트 리스너가 버튼눌림을 감지하여 이벤트 핸들러가 이를 처리
import java.awt.event.*;
이벤트 소스에 따라 -> 이벤트 리스너 선택 "내부클래스"형태로 핸들러 클래스 작성
인터페이스 구형 -> 추상메서드 반드시 작성

앞에서와 같이 생성자에 선언하면 지역변수가 되니까 다른클래스나 메서드에서 못씀 
->Button btn;  지역변수X 맴버변수로 선언O
생성은 생성자에서 btn = new Button("버튼");

이벤트 소스와 이벤트 핸들러 클래스를 연결?
->메서드의 매개변수에 인라인 객체생성방법으로 행들러 클래스의 객체를 생성함
이벤트 소스 메서드 : add___Listener()형태
ActionEvent -> addActionListener() : Handler클래스 연결하는 매서드
WindowEvent -> addWindowListener()


** 인라인 객체생성방법 **
btn.addActionListener(new BtnHandler());
//btn객체에 들어있는 addActionListener를 호출하는데 
    매개변수로 클래스의 객체를 생성하는 문법을 이용
 */