//����Ʈ ���� ����
import java.awt.*;
public class Exam23_5 extends Frame {
	public Exam23_5() {
		this.setLayout(new FlowLayout());
		List list = new List();
		list.setBackground(Color.GREEN);
		list.add("���");
		list.add("��");
		list.add("������");
		list.add("����");
		list.add("����");
		this.add(list);
	}

	public static void main(String[] args) {
		Exam23_5 f = new Exam23_5();
		f.setSize(300,200);
		f.setVisible(true);
	}

}
//��� 5�� ����ϴµ� 4���� ���̰� �Ѱ��� ��ũ������ �����Ѱ��� �𸣰��� ?.?
