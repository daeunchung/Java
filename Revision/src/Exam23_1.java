//���̺� ���� ����
import java.awt.*;
public class Exam23_1 extends Frame {
	public Exam23_1() {
		this.setLayout(new FlowLayout());
		Label label = new Label();
		label.setBackground(Color.GREEN);
		label.setAlignment(Label.CENTER);
		label.setText("�ڹ� ���α׷���");
		String str = label.getText();
		this.add(label);
	}
	public static void main(String[] args) {
		Exam23_1 f = new Exam23_1();
		f.setSize(300,200);
		f.setVisible(true);
	}
}
