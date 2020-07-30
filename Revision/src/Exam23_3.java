//체크박스 생성 예제
import java.awt.*;
public class Exam23_3 extends Frame {
	public Exam23_3(){
		this.setLayout(new FlowLayout());
		Checkbox cb1 = new Checkbox("사과");
		Checkbox cb2 = new Checkbox("배");
		Checkbox cb3 = new Checkbox("오렌지");
		cb1.setBackground(Color.GREEN);
		cb2.setBackground(Color.GREEN);
		cb3.setBackground(Color.GREEN);
		cb2.setState(true);
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
	}
	public static void main(String[] args) {
		Exam23_3 f = new Exam23_3();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
