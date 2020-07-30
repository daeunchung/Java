package hijava;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Exam30_1 extends Applet {

	public void init() {
		this.setBackground(Color.green);
		this.setSize(300,200);
		System.out.println("애플릿 로드");
	}
	public void start() {
		System.out.println("애플릿 다시 실행");
	}
	public void paint(Graphics g) {
		System.out.println("다시 그리기");
		g.fillRect(20, 20, 100, 100);
		g.drawString("자바 애플릭", 20, 150);
	}
	public void stop() {
		System.out.println("애플릿 페이지 종료");
	}
	public void destroy() {
		System.out.println("웹브라우져 종료");
	}
}