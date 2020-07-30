//BorderLayout 예제
import java.awt.*;
public class Exam25_2 extends Frame {
	public Exam25_2() {
		this.setLayout(new BorderLayout());
		Button btn1 = new Button("North");
		Button btn2 = new Button("South");
		Button btn3 = new Button("West");
		Button btn4 = new Button("East");
		Button btn5 = new Button("Center");
		this.add(btn1,"North");
		this.add(btn2,"South");
		this.add(btn3,"West");
		this.add(btn4,"East");
		this.add(btn5,"Center");
	}
	public static void main(String[] args) {
		Exam25_2 f = new Exam25_2();
		f.setSize(300,200);
		f.setVisible(true);
	}
}
/*
 수동 레이아웃 : 프로그래머가 직접 컴포넌트 크기위치지정 -> setBounds()메서드이용 
 void setBounds(int x, int y, int width, int height) 픽셀단위
직접 크기와 위치를 지정하기 때문에 컨테이너의 크기가 바꼈을때 컴포넌트 크기나 위치조정 X
컨테이너 크기가 고정된 프로그램에 적합
setLayout null; //수동레이아웃쓰겠다 이소리
*/
