//라디오버튼 생성 예제
import java.awt.*;
public class Exam23_4 extends Frame {
	public Exam23_4() {
		this.setLayout(new FlowLayout());
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("서울", true, group);
		Checkbox cb2 = new Checkbox("부산", false, group);
		cb1.setBackground(Color.GREEN);
		cb2.setBackground(Color.GREEN);
		this.add(cb1);
		this.add(cb2);
	}
	public static void main(String[] args) {
		Exam23_4 f = new Exam23_4();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
