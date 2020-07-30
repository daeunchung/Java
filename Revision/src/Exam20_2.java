import java.util.*;
public class Exam20_2 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("강아지");
		v.addElement("고양이");
		v.addElement("원숭이");
		System.out.println(v.size());
		for (int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		v.removeElement("고양이");
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}

	}

}

