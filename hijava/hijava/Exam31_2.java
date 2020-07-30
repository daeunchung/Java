package hijava;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Exam31_2 extends Applet{
	int x,y;
	public void init() {
		this.setBackground(Color.green);
		this.setSize(300, 200);
		this.addMouseListener(new MouseHandler());
	}
	public void paint(Graphics g) {
		g.fillOval(x, y, 20, 20);
	}
	class MouseHandler extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
			//repaint()호출시 update()호출
			//update()오버라이딩X -> 자동 내부에 paint()호출
		}
	}
}
