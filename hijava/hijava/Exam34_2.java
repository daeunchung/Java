package hijava;
//Ű����� �Է��� ������ ���Ͽ� �����ϱ� ����

import java.io.*;//����� ��Ű��
public class Exam34_2 {
	public static void main(String[] args) {
		int data;//Ű����� ���� ���� ������ ����
		try {
			File file = new File("output.txt");//Ű����� �Է��� �����͸� ������ ����
			FileOutputStream fout = new FileOutputStream(file);
			while((data = System.in.read()) != -1)
				fout.write(data);
			fout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
//Ctrl+z ������ data���� -1 �ΰ����� �ǹǷ� ����Ű�� �ȴ�
//�Ʒ� �ܼ�â�� ������ ���� �� ���� Ctrl+z ������ �ܼ�â ��ܿ� <terminated>��
