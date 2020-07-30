package hijava;
import java.awt.*;
import java.applet.*;//Applet���
import java.util.*;//���� ���
public class Exam33_3 extends Applet implements Runnable {
	Random r;
	int x,y;
	public void init() {//Applet���� �ʱ�ȭ�� ���� init�޼���
		r = new Random();
		this.setSize(300, 200);
		Thread t = new Thread(this);
		//������ Ŭ���� ��ü����t�� �����ϰ� ������ ��ä ����
		//�Ű������� ����Ŭ������ ���� ->this
		t.start();
	}
	public void update(Graphics g) {//update�޼��带 �������̵�
		g.fillOval(x, y, 20, 20);
	}
	public void run() {//Runnable�������̽������ؼ� run�޼��� �ʼ�
		try {//���ο� sleep�ż��� �Ἥ try-catch������ ����ó��
			while(true) {//�ݺ���ing->������ing
				x = r.nextInt(300);
				y = r.nextInt(200);
				this.repaint();//update�޼��� ȣ��
				Thread.sleep(1000);
			}
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}//Applet ���� main �޼��� X
//Thread ��ü ������ ���ؼ��� Runnable �������̽��� ������ Ŭ������ ��ü�� �����Ͽ� 
//ThreadŬ������ �����ڿ� �Ű������� �����Ѵ�.