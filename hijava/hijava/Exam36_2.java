package hijava;
//���ø����̼ǿ� �̹����� ����ϴ� ����
import java.awt.*;
public class Exam36_2 extends Frame {//���ø����̼��̴ϱ� FrameŬ������ Ȯ��޾�
	Image img;//Image��ü�� �����ϱ� ���� ����img�� ����
	public Exam36_2() {
		img = Toolkit.getDefaultToolkit().getImage("watermelon.jpg");
	}//�����ڿ��� �̹����� ������ ����  ToolkitŬ������ getDefaultToolkit()�޼��� �̿��ؼ� �̹��� ��ȯ����
	//getImage()�޼��� �̿��ؼ� ����Ǿ��ִ� �̹��� ���ϸ��� ����
	//watermelon.jpg ��� �̹����� �̹� ������ �Ǿ��־����
	public void paint(Graphics g) {
		g.drawImage(img, 0, 30, this);//�̹��� ������� �ż���
	}//ImageObserver�� ����Ŭ������
	public static void main(String[] args) {
		Exam36_2 f = new Exam36_2();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}