//KeyEvent ����
import java.awt.*;
import java.awt.event.*;

public class Exam27_2 extends Frame {
	public Exam27_2() {
		this.addKeyListener(new KeyHandler());
	}
	class KeyHandler implements KeyListener {
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar());
	}
	public void keyPressed(KeyEvent e) {		
	}
	public void keyReleased(KeyEvent e) {
	}
}
	public static void main(String[] args) {
		Exam27_2 f = new Exam27_2();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
//�پ��� Ű�� �������� �׿� �ش��ϴ� Ű������ Console�� ���