//FlowLayout 예제
import java.awt.*;
public class Exam25_1 extends Frame {
	public Exam25_1() {
		this.setLayout(new FlowLayout());
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
	}
	public static void main(String[] args) {
		Exam25_1 f = new Exam25_1();
		f.setSize(300,200);
		f.setVisible(true);
	}
}
//강사님은 run하고나서 window사이즈 완전작게도 가능한데 : 버튼3가 아래로 자동내려오는데
//나는 버튼123 가로로 출력해논 정도 이하로는 window크기를 못줄이네......... 무ㅝ지

/*
배치관리자 : 컨테이너 크기에 따라 컴포넌트가 어디에 위치할 지를 결정
버튼과 같은 각종 컴포넌트(객체)들이 컨테이너의 어느위치에 위치하는지를 지정
-자바는 FlowLayout, BorderLayout, GridLayout, CardLayout, GridBagLayout의 다양한 배치관리자 제공
-컨테이너에 배치관리자 지정안하면 디폴트로 지정된 배치 관리자가 적용됨
-배치관리자에 null값 지정할 경우 배치관리자가 적용되지 않으며 프로그래머가 컴포넌트 크기와위치 직접지정
Frame, Dialog -> BorderLayout (ex : add(btn1,"North");
Panel, Applet -> FlowLayout (컨테이너크기변경시 컴포넌트크기변화X위치변화O)

***배치관리자를 객체유지필요X->메서드호출시 바로 객체 생성
setLayout(new FlowLayout()); (앞에 this생략가능)


*/