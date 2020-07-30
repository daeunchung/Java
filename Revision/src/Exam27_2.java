//KeyEvent 예제
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
//다양한 키를 눌렀을때 그에 해당하는 키값들이 Console에 출력