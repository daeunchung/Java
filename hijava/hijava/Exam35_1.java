package hijava;
import java.io.*;
//��ü ���� �Է°� ��� ����
class Person implements Serializable{//Person��ä�� Serializable �������̽� ����
	String name;//�̸� ���� ���� ����
	int age;
	public Person(String str, int num) {//������ ���� ���� ���� �Է¹޾�
		name = str;
		age = num;
	}
	public String toString() {//toString()�޼��� �������̵�
	return name + ":" + age;
	}
}
public class Exam35_1 {
	public static void main(String[] args) {
		try {//������ؾ��ؼ� ����ó���� ���
			Person ps1;//PersonŬ������ ��ü���� ps1����
			//�츮�� ������ ������ Serializable�������̽� ������ Person Ŭ����
			ps1 = new Person("ö��", 20);//���� �־��ְ� ��ü ����
			FileOutputStream fout = new FileOutputStream("person.dat");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(ps1);//��ü�� ���� ��־�
			objout.close();
			fout.close();
			FileInputStream fin = new FileInputStream("person.dat");
			//�Ʊ� ������ ���⸦ ���ؼ� ������ ������ �̹����� �о�� ���ؼ� ���� ����
			ObjectInputStream objin = new ObjectInputStream(fin);
			//�Ʊ� ������ fin��ü�� �Ű������� �޾�
			Person ps2;
			ps2 = (Person)objin.readObject();
			//�츮�� �о ��ü�� ps2��ü�� ����
			//��ȯ���� ������ �ش� Person��ü�� ĳ���� �������
			System.out.println(ps2);
			objin.close();
			fin.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
	}
}
