package hijava;
//���ø��� �̹����� ����ϴ� ����
import java.awt.*;
import java.applet.*;
public class Exam36_1 extends Applet {
	Image img;//img���������� Image��ü ����
	public void init() {//�ʱ�ȭ
		this.setSize(300, 200);
		img = this.getImage(getDocumentBase(), "watermelon.jpg");
		//Applet�� ��ӹ��� Exam36_1Ŭ����(this)�� getImage()�޼��� �̿��ؼ� �̹����� �����Ѵ�.
		//�Ű������� <���ϰ��()�޼��� : Ŭ���� ������ �ִ� ��ġ�� ����>�� �� ��ġ�� watermelon.jpg �̹��������� ��ġ�� ������
		//�� �̹��������� img������ ����
	}
	public void paint(Graphics g) {//img������ ����� �̹����� ���
		g.drawImage(img,  0,  0,  this);//img��ü, �������(0,0), ����Ŭ����
	}
}
