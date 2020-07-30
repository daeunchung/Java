package hijava;
import java.awt.*;//Frame ���
import java.util.*;//Random ���
public class Exam33_2 extends Frame implements Runnable {
	Random r;
	int x, y;
	public Exam33_2() {
		r = new Random();//�����ڿ��� ������ü ����
	}
	public void update(Graphics g) {//update�޼��� �������̵�
		g.fillOval(x, y, 20, 20);//���� ä���� ���׸���
	}
	public void run() {//Runnable�������̽�����->�ݵ�� run�޼�����
		try {//����ó���ϴ� ����? ->�ȿ� sleep�޼��� ���Ǿ �ݵ�� try-catch�����
			while(true) {//���ѷ���ing->������ing
				x = r.nextInt(300);//300�̳��� �����߻�
				y = r.nextInt(200);//200������ �����߻�
				this.repaint();//update�޼��� ȣ��
				Thread.sleep(1000);//������ 1�� ���
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
		//Runnable�������̽������߱⿡ �����尴ü����t�� �����ϰ� 
		//�������� �����ڿ� Runnable�������̽��� ������ Ŭ������ �Ű������� ����
		t.start();//������Ŭ������ start()�޼��� ���
	}
}
