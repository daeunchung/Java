//BorderLayout ����
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
 ���� ���̾ƿ� : ���α׷��Ӱ� ���� ������Ʈ ũ����ġ���� -> setBounds()�޼����̿� 
 void setBounds(int x, int y, int width, int height) �ȼ�����
���� ũ��� ��ġ�� �����ϱ� ������ �����̳��� ũ�Ⱑ �ٲ����� ������Ʈ ũ�⳪ ��ġ���� X
�����̳� ũ�Ⱑ ������ ���α׷��� ����
setLayout null; //�������̾ƿ����ڴ� �̼Ҹ�
*/
