package hijava;
//������1 ������2�� 1�� ����� �ݺ���½�Ű��
public class Exam33_1 extends Thread{
	Exam33_1(String str){
		super(str);//���ڿ��� �޾Ƶ鿩�� super Ű���忡 ����
		//�θ�Ŭ������ �����ڸ� ȣ�� -> ���Ҹ��� ���ؾȉ�
	}
	public void run() { //threadŬ���� ��ӽ� �ݵ�� ����
		try {//sleep()�޼��� ���� �ݵ�� �ʿ�
			while(true) {
				System.out.println(Thread.currentThread().getName());
				this.sleep(1000);
			} 
		} catch (Exception e) {
				System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		Exam33_1 t1 = new Exam33_1("������1");
		Exam33_1 t2 = new Exam33_1("������2");
		t1.start();//�����带 �����ϴ� �޼���
		t2.start();
	}
}
