//������ư ���� ����
import java.awt.*;
public class Exam23_4 extends Frame {
	public Exam23_4() {
		this.setLayout(new FlowLayout());
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("����", true, group);
		Checkbox cb2 = new Checkbox("�λ�", false, group);
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
