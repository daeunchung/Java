//MouseEvent ����
import java.awt.*;
import java.awt.event.*;

public class Exam27_1 extends Frame {
	public Exam27_1() {
		this.addMouseListener(new MouseHandler());
	}
	class MouseHandler implements MouseListener {
	//�������̽��� ������ ����Ŭ���� : ���� �޼��� 5�� ������ �ٽ������
	public void mouseClicked(MouseEvent e) {	
	}
	public void mouseEntered(MouseEvent e) {	
		System.out.println("���콺�� ������ �������� ����");
	}
	public void mouseExited(MouseEvent e) {	
		System.out.println("���콺�� ������ ������ ����");
	}
	public void mousePressed(MouseEvent e) {	
		System.out.println("���콺 ���� ��ư ����");
	}
	public void mouseReleased(MouseEvent e) {	
		System.out.println("���콺 ���� ��ư ��");
	}
}
	public static void main(String[] args) {
		Exam27_1 f = new Exam27_1();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}

/*���콺 �̺�Ʈ 
���������� ���콺�� �̵���� ��ǥ �� ������ Ȱ��*/