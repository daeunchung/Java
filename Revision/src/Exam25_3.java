//���� ���̾ƿ� ����
import java.awt.*;
public class Exam25_3 extends Frame {
	public Exam25_3() {
		this.setLayout(null); //���� ���̾ƿ� ���ڴ�
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
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

//������� ��ư1�� ���� ��Ŭ���� ������ �Ȱ������µ� ���� ��������.. ������ �Ź����̶� �׷��� �Ф�