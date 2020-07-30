//레이블 생성 예제
import java.awt.*;
public class Exam23_1 extends Frame {
	public Exam23_1() {
		this.setLayout(new FlowLayout());
		Label label = new Label();
		label.setBackground(Color.GREEN);
		label.setAlignment(Label.CENTER);
		label.setText("자바 프로그래밍");
		String str = label.getText();
		this.add(label);
	}
	public static void main(String[] args) {
		Exam23_1 f = new Exam23_1();
		f.setSize(300,200);
		f.setVisible(true);
	}
}
