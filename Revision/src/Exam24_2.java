//�г� ���� ����
//�гκκ� ����Ŭ���� + �гο÷����� ������ ����
import java.awt.*;
class Pan extends Panel{
	public Pan() {//PanelŬ������ ������
	this.setLayout(new FlowLayout());
//��ġ�����ڸ� FlowLayout���� ���� : Panel�� �����̳�Ŭ������ �����̶� �ٸ���ü�� �÷����� �� ����
	this.setBackground(Color.GREEN);
	Button btn1 = new Button("�г��� ��ư1");
	this.add(btn1);
	Button btn2 = new Button("�г��� ��ư2");	
	this.add(btn2);
	}
}

public class Exam24_2 extends Frame {
	public Exam24_2() {
		this.setLayout(new FlowLayout());
		Pan p = new Pan();
		this.add(p);
	}
	public static void main(String[] args) {
		Exam24_2 f = new Exam24_2();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
/*
- <<�г� Ŭ������ �����̳�(�ٸ�������Ʈ�� ��ü�� ���԰���) �� ������Ʈ�� Ư���� ��� ������ ����>>
-������ �Ǵ� ���ø� �����̳ʿ� �г� Ŭ���� ��������
-������ �Ǵ� ���ø��� ������ �����ؼ� ��ġ�� ��� �Ͽ�
-������ & ���ø��� �ܵ����� ȭ�鿡 ��Ÿ���� ����
- << �г��� ������ �Ǵ� ���ø� ���� �ܵ����� ȭ�鿡 ��Ÿ���� X >>
-�гο� ������Ʈ ������� : �����Ӱ� ���� -> ��ü����, add
-�г� Ŭ������ �����̳� Ŭ������ ��ӹ��� Ŭ���� : �����̳�Ŭ���� �޼��� �״�� ��밡��
//class Pan extends Panel{ } :�гλ�������
public class Exam24_2 extends Frame {  ] 
Pan p = new Pan();
add(p); 
�г� �����ÿ��� �̸� ������ �г� �������� add�� �� �ٿ�

*/