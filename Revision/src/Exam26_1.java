//ActionEvent ����
import java.awt.*;
import java.awt.event.*;
public class Exam26_1 extends Frame {
	Button btn; //������ ������ġ�� ������ ����X �ܺ�O : ������ �ܿ� �ٸ� Ŭ������ �޼��忡�� �����ֵ���
	public Exam26_1() { 
		this.setLayout(new FlowLayout());
		btn = new Button("�ڹ� ���α׷���");
		this.add(btn);//����Ŭ������ ��ư��ü �߰�
		btn.addActionListener(new BtnHandler());//����Ʈ �ڵ鷯�� �����Ű�� �κ�
	}
	class BtnHandler implements ActionListener {//�������̽��� ����
	//Ŭ����Exam26_1 ���ο� �Ǵٸ� Ŭ������ ������ ����Ŭ����BtnHandler(EventHandler�ۼ�����))
		public void actionPerformed(ActionEvent e) {
		btn.setLabel("��ư�� ������");
		//ActionListener�������̽��� �����ϴ� �Ѱ��� �޼��� actionPerformed�� �ݵ�� �������
		//�޼��� �����ϱ� {  } �ȿ� ���뵵 �����
		}
	}
	public static void main(String[] args) {
		Exam26_1 f = new Exam26_1();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}

/*
�̺�Ʈ : ��ư �����ų� �ؽ�Ʈ���ڿ� �Է� ���� ����ڿ� ���� ��ȣ�ۿ�
�̺�Ʈ �ҽ� : �̺�Ʈ�� �߻��� ������Ʈ
�̺�Ʈ ������ : ����Ʈ�� �߻��Ǳ⸦ ��ٸ��� ��ü
�̺�Ʈ �ڵ鷯 : �̺�Ʈ ó���� ����ϴ� Ŭ���� , �Ϲ������� ���� Ŭ����
ex. ��ư�� �̺�Ʈ �ҽ����� ��ư�� ������ �̺�Ʈ�� �߻��ϰ� �̺�Ʈ �����ʰ� ��ư������ �����Ͽ� �̺�Ʈ �ڵ鷯�� �̸� ó��
import java.awt.event.*;
�̺�Ʈ �ҽ��� ���� -> �̺�Ʈ ������ ���� "����Ŭ����"���·� �ڵ鷯 Ŭ���� �ۼ�
�������̽� ���� -> �߻�޼��� �ݵ�� �ۼ�

�տ����� ���� �����ڿ� �����ϸ� ���������� �Ǵϱ� �ٸ�Ŭ������ �޼��忡�� ���� 
->Button btn;  ��������X �ɹ������� ����O
������ �����ڿ��� btn = new Button("��ư");

�̺�Ʈ �ҽ��� �̺�Ʈ �ڵ鷯 Ŭ������ ����?
->�޼����� �Ű������� �ζ��� ��ü����������� ��鷯 Ŭ������ ��ü�� ������
�̺�Ʈ �ҽ� �޼��� : add___Listener()����
ActionEvent -> addActionListener() : HandlerŬ���� �����ϴ� �ż���
WindowEvent -> addWindowListener()


** �ζ��� ��ü������� **
btn.addActionListener(new BtnHandler());
//btn��ü�� ����ִ� addActionListener�� ȣ���ϴµ� 
    �Ű������� Ŭ������ ��ü�� �����ϴ� ������ �̿�
 */