//WindowEvent ����
import java.awt.*;
import java.awt.event.*;

public class Exam26_2 extends Frame {
	public Exam26_2() {
		this.setLayout(new FlowLayout());
		this.addWindowListener(new WindowHandler());
		//WindowHandler��ü�� ��� ������ �ʿ䰡 �����Ƿ� �Ｎ���� ������ ���
	}	
	class WindowHandler extends WindowAdapter {//�ڵ鷯Ŭ������ ���ο� �����
		public void windowClosing(WindowEvent e) {
			//WindowEvent e : ���� ��ܿ� �ݱ�x��ư�� ������쿡
			//�����찡 ������ ������ ó���Ǿ���� �ϵ��� {  }���ο� �ۼ�
			System.exit(0);//���α׷� ����
		}
	}
	public static void main(String[] args) {
		Exam26_2 f = new Exam26_2();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
/*
������(Listener)
������Ʈ�� �̺�Ʈ �߻��� �̺�Ʈ ������ �´� �̺�Ʈ ������ ����
�����ʴ� �������̽� !!!!!! �����ʸ� ������ Ŭ���������� �������� ��� �߻�޼��� �� �����ؾ���
-> ���ۿ� : ��������� ���� �ż��带 �����ؾ���
�����(Adapter)
������ �������̽��� ����ϱ� ���� ���� Ŭ����
������ �������̽��� �߻� �޼��尡 2�� �̻��� ��쿡 ������ Ŭ���� ����
���� �ʿ��� �޼��常 ��������

WindowListener �������̽��� ���� �޼��尡 ���� 7�� !!!
�������̽� �����ؼ� Handler Ŭ���� �����Ҳ��� �޼��带 �� �����Ⱦ��� ������ 7�� �޼��� �� ��������� !!!
-> �Ⱦ��� �޼������ { } �̷��� ������� , �� �޼��� �ȿ��� { �ڵ��ۼ� }
*/