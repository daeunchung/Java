package hijava;
//애플릿에 이미지를 출력하는 예제
import java.awt.*;
import java.applet.*;
public class Exam36_1 extends Applet {
	Image img;//img변수명으로 Image객체 생성
	public void init() {//초기화
		this.setSize(300, 200);
		img = this.getImage(getDocumentBase(), "watermelon.jpg");
		//Applet를 상속받은 Exam36_1클래스(this)에 getImage()메서드 이용해서 이미지를 저장한다.
		//매개변수로 <파일경로()메서드 : 클래스 파일이 있는 위치를 지정>와 그 위치에 watermelon.jpg 이미지파일이 위치해 있으면
		//이 이미지파일을 img변수에 저장
	}
	public void paint(Graphics g) {//img변수에 저장된 이미지를 출력
		g.drawImage(img,  0,  0,  this);//img객체, 출력좌쵸(0,0), 현재클래스
	}
}
