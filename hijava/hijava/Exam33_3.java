package hijava;
import java.awt.*;
import java.applet.*;//Applet사용
import java.util.*;//난수 사용
public class Exam33_3 extends Applet implements Runnable {
	Random r;
	int x,y;
	public void init() {//Applet에서 초기화를 위한 init메서드
		r = new Random();
		this.setSize(300, 200);
		Thread t = new Thread(this);
		//스레드 클래스 객체변수t를 선언하고 스레드 객채 생성
		//매개변수로 현재클래스를 전달 ->this
		t.start();
	}
	public void update(Graphics g) {//update메서드를 오버라이딩
		g.fillOval(x, y, 20, 20);
	}
	public void run() {//Runnable인터페이스구현해서 run메서드 필수
		try {//내부에 sleep매서드 써서 try-catch블럭으로 예외처리
			while(true) {//반복문ing->스레드ing
				x = r.nextInt(300);
				y = r.nextInt(200);
				this.repaint();//update메서드 호출
				Thread.sleep(1000);
			}
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}//Applet 사용시 main 메서드 X
//Thread 객체 생성을 위해서는 Runnable 인터페이스를 구현한 클래스의 객체를 생성하여 
//Thread클래스의 생성자에 매개변수로 전달한다.