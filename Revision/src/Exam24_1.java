//������ ���� ����
import java.awt.*;
public class Exam24_1 extends Frame {
	public Exam24_1() {//Ŭ�����̸��� ������ ������ �����
		this.setLayout(new FlowLayout());
		this.setTitle("�ڹ� ���α׷���");
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		this.add(btn1);
		this.add(btn2);
		}
	public static void main(String[] args) {
		Exam24_1 f = new Exam24_1();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}

/*
�տ��� �ٸ� class Frame���� ���� ������Ʈ�� ������ų���־���
�����̳� Ŭ���� ������ �ٸ� ������Ʈ�� ������ �� ����

FlowLayout() : ��ü���� ȭ�麯ȭ�� ���� �ɵ������� ũ�Ⱑ �����Ǵ� ��ġ����
FlowLayout()�� ���� -> ������ ũ��� ������ ��ġ�� ��Ƽ� �ڵ����� ���
*/
