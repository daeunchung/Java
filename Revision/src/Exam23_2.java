//�ؽ�Ʈ�ʵ� ���� ����
import java.awt.*;
public class Exam23_2 extends Frame {
	public Exam23_2(){
		this.setLayout(new FlowLayout());//��ġ������ ����
		TextField tf1 = new TextField(); //�Ű����� ���� Textfield ������ 
		TextField tf2 = new TextField("�ڹ� ���α׷���", 30); //���ڿ�,ũ������
		tf1.setText(tf2.getText());
		this.add(tf1);
		this.add(tf2);
	}
	public static void main(String[] args) {
		Exam23_2 f = new Exam23_2();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
