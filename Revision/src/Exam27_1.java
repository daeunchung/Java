//MouseEvent 예제
import java.awt.*;
import java.awt.event.*;

public class Exam27_1 extends Frame {
	public Exam27_1() {
		this.addMouseListener(new MouseHandler());
	}
	class MouseHandler implements MouseListener {
	//인터페이스를 구현한 내부클래스 : 따라서 메서드 5개 무조건 다써줘야해
	public void mouseClicked(MouseEvent e) {	
	}
	public void mouseEntered(MouseEvent e) {	
		System.out.println("마우스가 프레임 영역으로 진입");
	}
	public void mouseExited(MouseEvent e) {	
		System.out.println("마우스가 프레임 밖으로 나감");
	}
	public void mousePressed(MouseEvent e) {	
		System.out.println("마우스 왼쪽 버튼 눌림");
	}
	public void mouseReleased(MouseEvent e) {	
		System.out.println("마우스 왼쪽 버튼 뗌");
	}
}
	public static void main(String[] args) {
		Exam27_1 f = new Exam27_1();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}

/*마우스 이벤트 
전반적으로 마우스의 이동모션 좌표 다 따내서 활동*/