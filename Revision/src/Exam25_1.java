//FlowLayout ����
import java.awt.*;
public class Exam25_1 extends Frame {
	public Exam25_1() {
		this.setLayout(new FlowLayout());
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
	}
	public static void main(String[] args) {
		Exam25_1 f = new Exam25_1();
		f.setSize(300,200);
		f.setVisible(true);
	}
}
//������� run�ϰ��� window������ �����۰Ե� �����ѵ� : ��ư3�� �Ʒ��� �ڵ��������µ�
//���� ��ư123 ���η� ����س� ���� ���Ϸδ� windowũ�⸦ �����̳�......... ������

/*
��ġ������ : �����̳� ũ�⿡ ���� ������Ʈ�� ��� ��ġ�� ���� ����
��ư�� ���� ���� ������Ʈ(��ü)���� �����̳��� �����ġ�� ��ġ�ϴ����� ����
-�ڹٴ� FlowLayout, BorderLayout, GridLayout, CardLayout, GridBagLayout�� �پ��� ��ġ������ ����
-�����̳ʿ� ��ġ������ �������ϸ� ����Ʈ�� ������ ��ġ �����ڰ� �����
-��ġ�����ڿ� null�� ������ ��� ��ġ�����ڰ� ������� ������ ���α׷��Ӱ� ������Ʈ ũ�����ġ ��������
Frame, Dialog -> BorderLayout (ex : add(btn1,"North");
Panel, Applet -> FlowLayout (�����̳�ũ�⺯��� ������Ʈũ�⺯ȭX��ġ��ȭO)

***��ġ�����ڸ� ��ü�����ʿ�X->�޼���ȣ��� �ٷ� ��ü ����
setLayout(new FlowLayout()); (�տ� this��������)


*/