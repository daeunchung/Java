package step1;

public class Ex12_2 {

	public static void main(String[] args) {
		// if �ɼ� (2����)
				// 1) else  ==> if �� ������ �����̸� �����ǽ��� 
				// 2) else if ==> 
				int score = 80;
				if(score >= 60) {System.out.println("�հ�");}
				else {System.out.println("���հ�");}
				//===========================================
				System.out.println("1.���� 2.����� 3.���");
				int select = 1;
				if(select == 1) { System.out.println("����");}
				if(select == 2) { System.out.println("�����");}
				if(select == 3) { System.out.println("���");}
				else {System.out.println("����1");}
				//===========================================
				System.out.println("1.��� 2.���� 3.��");
				select = 1;
				if(select == 1) { System.out.println("���");}
				else if(select == 2) { System.out.println("����");}
				else if(select == 3) { System.out.println("��");}
				else {System.out.println("����2");}
	}

}
