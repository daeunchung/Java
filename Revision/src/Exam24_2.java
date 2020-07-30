//패널 생성 예제
//패널부분 생성클래스 + 패널올려놓을 프레임 생성
import java.awt.*;
class Pan extends Panel{
	public Pan() {//Panel클래스의 생성자
	this.setLayout(new FlowLayout());
//배치관리자를 FlowLayout으로 지정 : Panel도 컨테이너클래스의 일종이라 다른객체를 올려놓을 수 있음
	this.setBackground(Color.GREEN);
	Button btn1 = new Button("패널의 버튼1");
	this.add(btn1);
	Button btn2 = new Button("패널의 버튼2");	
	this.add(btn2);
	}
}

public class Exam24_2 extends Frame {
	public Exam24_2() {
		this.setLayout(new FlowLayout());
		Pan p = new Pan();
		this.add(p);
	}
	public static void main(String[] args) {
		Exam24_2 f = new Exam24_2();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
/*
- <<패널 클래스는 컨테이너(다른컴포넌트나 객체를 포함가능) 와 컴포넌트의 특성을 모두 가지고 있음>>
-프레임 또는 애플릿 컨테이너에 패널 클래스 부착가능
-프레임 또는 애플릿에 영역을 분할해서 배치할 경우 하용
-프레임 & 애플릿은 단독으로 화면에 나타내기 가능
- << 패널은 프레임 또는 애플릿 없이 단독으로 화면에 나타낼수 X >>
-패널에 컴포넌트 부착방식 : 프레임과 동일 -> 객체생성, add
-패널 클래스는 컨테이너 클래스를 상속받은 클래스 : 컨테이너클래스 메서드 그대로 사용가능
//class Pan extends Panel{ } :패널생성과정
public class Exam24_2 extends Frame {  ] 
Pan p = new Pan();
add(p); 
패널 부착시에는 미리 여러개 패널 만들어놓고 add로 쫙 붙여

*/