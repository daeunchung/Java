import java.util.*;
public class Exam20_2 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("������");
		v.addElement("�����");
		v.addElement("������");
		System.out.println(v.size());
		for (int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		v.removeElement("�����");
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}

	}

}

