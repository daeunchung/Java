package hijava;
import java.awt.*;//Frame 사용
import java.util.*;//Random 사용
public class Exam33_2 extends Frame implements Runnable {
	Random r;
	int x, y;
	public Exam33_2() {
		r = new Random();//생성자에서 랜덤객체 생성
	}
	public void update(Graphics g) {//update메서드 오버라이딩
		g.fillOval(x, y, 20, 20);//안이 채워진 원그리기
	}
	public void run() {//Runnable인터페이스구현->반드시 run메서드사용
		try {//예외처리하는 이유? ->안에 sleep메서드 사용되어서 반드시 try-catch블럭사용
			while(true) {//무한루프ing->스레드ing
				x = r.nextInt(300);//300이내의 난수발생
				y = r.nextInt(200);//200이하의 난수발생
				this.repaint();//update메서드 호출
				Thread.sleep(1000);//스레드 1초 대기
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		Exam33_2 f = new Exam33_2();
		f.setSize(300, 200);
		f.setVisible(true);
		Thread t = new Thread(f);
		//Runnable인터페이스구현했기에 스레드객체변수t를 선언하고 
		//스레드의 생성자에 Runnable인터페이스를 구현한 클래스를 매개변수로 지정
		t.start();//스레드클래스라서 start()메서드 사용
	}
}
