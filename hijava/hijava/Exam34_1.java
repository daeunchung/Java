package hijava;
//���� ���� �б� ����

import java.io.*;//������ؾ��ؼ� io��Ű��
public class Exam34_1 {
	public static void main(String[] args) {
		int data = 0;
		String file = "C:\\Users\\user\\eclipse-workspace\\First\\src\\hijava\\Exam34_1.java";
		try {
			FileInputStream fin = new FileInputStream(file);
			while((data = fin.read()) != -1)
				System.out.write(data);
			fin.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
//������ �����ϴ� ������ ��Ȯ�� �����θ� �ۼ�����߸� �ڵ尡 ��µȴ�
//���� �ּ� �߸� �־��ָ� file not founded ��