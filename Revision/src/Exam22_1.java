//�����Ӱ� ��ư ���� ����
import java.awt.*;
public class Exam22_1 extends Frame{
	public Exam22_1(){//������ 
		this.setLayout(new FlowLayout());//Ŭ������ ��ġ�����ڸ� FlowLayout���� ����
		//�������� X ������ü�� ���� O
		Button btn = new Button("��ư");
		btn.setBackground(Color.GREEN);
		this.add(btn);
	}
	public static void main(String[] args) {
		Exam22_1 f = new Exam22_1();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
/*
AWT(Abstract Windows Toolkit)�� GUI(�׷��� �߽� ���α׷���)�� ���� �ڹ�API
: ������, ��ư ���� ���� ������Ʈ�� �̺�Ʈ ó���� ���� �������̽��� ���� : â�� ���� �������ְ� ��ư�ְ� �̷���
AWT�� ������ ���α׷��� JVM�� ��ġ�Ǿ� �ִ� ��� �ü�������� �ڵ� �������� ���� ����
�ü���� ���� ��Ÿ���� ����� �ణ �ٸ�������
AWT -> java.awt.*; //java.awt��Ű���� ��� Ŭ������ ����ϰڴ� 

ComponentŬ������ AWT�� ���Ե� ������Ʈ���� �ֻ��� Ŭ����
: Container, Lable, Button, Choice,,, etc ����
*/