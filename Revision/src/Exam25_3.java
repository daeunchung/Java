//수동 레이아웃 예제
import java.awt.*;
public class Exam25_3 extends Frame {
	public Exam25_3() {
		this.setLayout(null); //수동 레이아웃 쓰겠다
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		btn1.setBounds(0, 30, 150, 30);
		btn2.setBounds(0, 60, 150, 30);
		this.add(btn1);
		this.add(btn2);
	}
	public static void main(String[] args) {
		Exam25_3 f = new Exam25_3();
		f.setSize(300,200);
		f.setVisible(true);	
		}
}

//강사님은 버튼1이 위에 이클립스 바한테 안가려지는데 나는 가려지네.. 구버전 신버전이라 그런가 ㅠㅠ