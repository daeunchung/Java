package hijava;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Exam31_1 extends Applet {
	Button btn;
	public void init() {
		this.setLayout(new FlowLayout());
		this.setSize(300, 200);
		this.setBackground(Color.green);
		btn = new Button("��ư�� ��������.");
		this.add(btn);
		btn.addActionListener(new BtnHandler());
	}
	class BtnHandler implements ActionListener{
		//��ư�� ���� Ŭ������ ActionListener�� �����Ϸ� BtnHandlerŬ������ �������
		//ActionListener �ȿ��� actionPerformed()�޼��带 �ݵ�� �����ؾ���
		public void actionPerformed(ActionEvent e) {
			btn.setLabel("��ư�� �������ϴ�.");
			//��ư�� ���̺��� �������� �Ѵ�
		}
	}

}
