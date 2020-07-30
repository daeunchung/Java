//프레임과 버튼 생성 예제
import java.awt.*;
public class Exam22_1 extends Frame{
	public Exam22_1(){//생성자 
		this.setLayout(new FlowLayout());//클래스의 배치관리자를 FlowLayout으로 설정
		//변수생성 X 직접객체를 생성 O
		Button btn = new Button("버튼");
		btn.setBackground(Color.GREEN);
		this.add(btn);
	}
	public static void main(String[] args) {
		Exam22_1 f = new Exam22_1();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
/*
AWT(Abstract Windows Toolkit)는 GUI(그래픽 중심 프로그래밍)을 위한 자바API
: 프레임, 버튼 등의 각정 컴포넌트와 이벤트 처리를 위한 인터페이스로 구성 : 창에 위에 제목줄있고 버튼있고 이런거
AWT로 구현한 프로그램은 JVM이 설치되어 있는 어떠한 운영체제에서도 코드 수정없이 동작 가능
운영체제에 따라서 나타나는 모양을 약간 다를수있음
AWT -> java.awt.*; //java.awt패키지의 모든 클래스를 사용하겠다 

Component클래스는 AWT에 포함된 컴포넌트들의 최상위 클래스
: Container, Lable, Button, Choice,,, etc 많다
*/