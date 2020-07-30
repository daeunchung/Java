package hijava;
//애플리케이션에 이미지를 출력하는 예제
import java.awt.*;
public class Exam36_2 extends Frame {//애플리케이션이니까 Frame클래스를 확장받아
	Image img;//Image객체를 저장하기 위해 변수img를 선언
	public Exam36_2() {
		img = Toolkit.getDefaultToolkit().getImage("watermelon.jpg");
	}//생성자에서 이미지를 얻어오기 위해  Toolkit클래스에 getDefaultToolkit()메서드 이용해서 이미지 반환받음
	//getImage()메서드 이용해서 저장되어있는 이미지 파일명을 지정
	//watermelon.jpg 라는 이미지가 이미 저장이 되어있어야함
	public void paint(Graphics g) {
		g.drawImage(img, 0, 30, this);//이미지 출력위한 매서드
	}//ImageObserver는 현재클래스로
	public static void main(String[] args) {
		Exam36_2 f = new Exam36_2();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}