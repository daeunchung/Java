/*package step7_Ex01Q;

import java.util.Scanner;

class Subject{
	String name;
	int score;
}
class Student{
	Subject[] subjects;
	String name;
}

public class Ex01_QŬ�����迭 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// # �л� �߰� ���� ��Ʈ�ѷ�
		//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
		//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
		//   �̸��� : ����2�� ���� 20 ���� 30 
		//   �̿��� : ����1�� ���� 100

		Student[] list = new Student[3];
		int count = 0; // �л� ��
		while(true) {
		
			// ���� list �ѹ� �� ������ֱ�
			for(int i = 0; i<count; i++) {
				System.out.println("[" + (i+1) + "]" +  list[i].name + "�л�>>>");
				if(list[i].subjects != null) {
					for(int j = 0; j<list[i].subjects.length; j++) {
						System.out.println("[" + (j+1) + "]" + list[i].subjects[j].name + " : " + list[i].subjects[j].score + "��");
					}
				}
				System.out.println();
			}
				
			System.out.println("[1]�л� �߰��ϱ�");		// �̸� �Է¹޾� �߰�
			System.out.println("[2]���� �߰��ϱ�");		// �̸��� ���� �Է¹޾� �߰�
			System.out.println("[3]���� �߰��ϱ�");		// �̸��� ���� �׸��� ���� �Է¹޾� �߰�
			// [1] : class Student ��ĭ �÷��ְ�(new) , �� ��ü �ο�(new)
			// [2] : class Subject ��ĭ �÷��ְ�(new) , �� ��ü �ο�(new)
			// [3] : ������ �ִ� �迭�� ����(��)�� �־��ָ��
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.print("�̸� �Է� : ");
				String name = scan.next();
				
				list[count] = new Student();
				list[count].name = name;
				count++;
			}
			else if(choice == 2) {
				for(int i = 0; i<count; i++) {
					System.out.println("[" + (i+1) + "]" + list[i].name);
				}
				System.out.print("�л� ���� : ");
				int select = scan.nextInt();
				select--;
				
				System.out.print("���� �Է� : ");
				String subject = scan.next();
				if(list[select].subjects == null) {
					list[select].subjects = new Subject[1];
					
					list[select].subjects[0] = new Subject();
					list[select].subjects[0].name = subject;
				}else {
					int size = list[select].subjects.length;
					
					Subject[] temp = list[select].subjects; 
					// temp ���ٰ� �ּҰ� �־����
					list[select].subjects = new Subject[size + 1];
					// �迭 ũ�⸸ ���Ӱ� ���ذ�. �ּҰ� �Ȱǵ����
					
					for(int i = 0; i<size; i++) {
						list[select].subjects[i] = temp[i];
						// ������ ���빰�� �� �迭�� �Ű��ֱ�
					}
					
					list[select].subjects[size] = new Subject();
					// Ŭ���� �迭 ĭ���ٰ�  Subject ��ü�� �ο� (��ü ����)
					list[select].subjects[size].name = subject;
					// �ӿ� ���빰 (�����) �־��ֱ�
					
					temp = null;
				}
			}
			else if(choice == 3) {
				for(int i = 0; i<count; i++) {
					System.out.println("[" + (i+1) + "]" + list[i].name);
				}
				System.out.print("�л� ���� : ");
				int select = scan.nextInt();
				select--;
				
				if(list[select].subjects != null) {
					for(int i = 0; i<list[select].subjects.length; i++) {
						System.out.println("[" + (i+1) + "]" + list[select].subjects[i].name + " : " + list[select].subjects[i].score + "��");
					}
				}
				System.out.print("���� ���� : ");
				int num = scan.nextInt();
				num--;
				
				System.out.print("���� �Է� : ");
				int score = scan.nextInt();
				
				list[select].subjects[num].score = score;
			}
		}
	}
}
*/
