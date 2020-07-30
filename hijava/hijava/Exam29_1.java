package hijava;
import java.awt.*;
import java.awt.event.*;
public class Exam29_1 extends Frame {
	int x,y;
	public Exam29_1(){
		x=50; y=50;
		this.addMouseListener(new MouseHandler());
	}
	public void paint(Graphics g) {
		g.drawOval(x,y,20,20);
	}
	public void update(Graphics g) {
		paint(g);	
	}
	class MouseHandler extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			Point p = e.getPoint();
			x = p.x;
			y = p.y;
			repaint();
		}
	}
	public static void main(String[] args) {
		Exam29_1 f = new Exam29_1();
		f.setSize(300,200);
		f.setVisible(true);
	}

}
