package hijava;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Exam30_1 extends Applet {

	public void init() {
		this.setBackground(Color.green);
		this.setSize(300,200);
		System.out.println("���ø� �ε�");
	}
	public void start() {
		System.out.println("���ø� �ٽ� ����");
	}
	public void paint(Graphics g) {
		System.out.println("�ٽ� �׸���");
		g.fillRect(20, 20, 100, 100);
		g.drawString("�ڹ� ���ø�", 20, 150);
	}
	public void stop() {
		System.out.println("���ø� ������ ����");
	}
	public void destroy() {
		System.out.println("�������� ����");
	}
}