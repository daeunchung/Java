package hijava;
import java.awt.*;
import java.awt.event.*;
public class Exam29_2 extends Frame{
	public void paint(Graphics g) {
		g.drawRect(20, 50, 100, 100);
		g.fillOval(150, 50, 50, 50);
		Font font = new Font("����", Font.ITALIC, 20);
		g.setFont(font);
		g.drawString("�ڹ� ���α׷���", 20, 170);
	}

	public static void main(String[] args) {
		Exam29_2 f = new Exam29_2();
		f.setSize(300,200);
		f.setVisible(true);
	}

}
