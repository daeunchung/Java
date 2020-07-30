package hijava;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Exam31_1 extends Applet {
	Button btn;
	public void init() {
		this.setLayout(new FlowLayout());
		this.setSize(300, 200);
		this.setBackground(Color.green);
		btn = new Button("버튼을 누르세요.");
		this.add(btn);
		btn.addActionListener(new BtnHandler());
	}
	class BtnHandler implements ActionListener{
		//버튼에 관한 클래스라서 ActionListener를 구현하려 BtnHandler클래스를 만들었음
		//ActionListener 안에는 actionPerformed()메서드를 반드시 구현해야해
		public void actionPerformed(ActionEvent e) {
			btn.setLabel("버튼을 눌렀습니다.");
			//버튼에 레이블을 다음같이 한다
		}
	}

}
