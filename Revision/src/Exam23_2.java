//텍스트필드 생성 예제
import java.awt.*;
public class Exam23_2 extends Frame {
	public Exam23_2(){
		this.setLayout(new FlowLayout());//배치관리자 지정
		TextField tf1 = new TextField(); //매개변수 없는 Textfield 생성자 
		TextField tf2 = new TextField("자바 프로그래밍", 30); //문자열,크기지정
		tf1.setText(tf2.getText());
		this.add(tf1);
		this.add(tf2);
	}
	public static void main(String[] args) {
		Exam23_2 f = new Exam23_2();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
