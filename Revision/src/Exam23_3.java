//üũ�ڽ� ���� ����
import java.awt.*;
public class Exam23_3 extends Frame {
	public Exam23_3(){
		this.setLayout(new FlowLayout());
		Checkbox cb1 = new Checkbox("���");
		Checkbox cb2 = new Checkbox("��");
		Checkbox cb3 = new Checkbox("������");
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
