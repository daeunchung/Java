package step1;

public class Ex03_2Q {

	public static void main(String[] args) {
		//��) ������ 1000���ִ�. 200��¥�� ���� ���� ��, �ܵ� ��� 
				int ���� = 1000;
				int ���� = 200;
				int �ܵ� = ���� - ����;
				System.out.println("�ܵ� = " + �ܵ� + "��");
				
				//����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
				int ���� = 100;
				int ���� = ����*12;
				double ���Ŀ��� = ����*0.9;
				System.out.println("���� = " + ���� + "��");
				System.out.println("���Ŀ��� = " + ���Ŀ��� + "��");
				
				//����2) ���������� 30, 50, 4�� �� �޾Ҵ�. �����?
				int s1 = 30;
				int s2 = 50;
				int s3 = 4;
				double avg = (s1 + s2 + s3)/3 ;
				System.out.println("��� = " + avg + "��");
				
				//����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
				int ���� = 3;
				int ���� = 6;
				double ���� = ���� * ���� / 2;
				System.out.println("�ﰢ���� ���� = " + ����);
				
				//����4) 100�ʸ� 1�� 40�ʷ� ���
				int time = 100;
				int min = time/60 ;
				int sec = time%60 ;
				System.out.println(min + "��" +  sec + "��");
				
				//����5) 800������ 500��¥�� ���� , 100��¥�� ����
				//����5) 500��(1��), 100��(3��) 
				int money = 800;
				int fivers = money / 500;
				int ones = (money % 500) / 100;
				System.out.println("500���� ���� = " + fivers + "��");
				System.out.println("100���� ���� = " + ones + "��");

	}

}
