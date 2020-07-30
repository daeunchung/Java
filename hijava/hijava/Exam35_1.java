package hijava;
import java.io.*;
//객체 단위 입력과 출력 예제
class Person implements Serializable{//Person객채가 Serializable 인터페이스 구현
	String name;//이름 나이 변수 지정
	int age;
	public Person(String str, int num) {//생성자 만들어서 문자 숫자 입력받아
		name = str;
		age = num;
	}
	public String toString() {//toString()메서드 오버라이딩
	return name + ":" + age;
	}
}
public class Exam35_1 {
	public static void main(String[] args) {
		try {//입출력해야해서 예외처리블럭 사용
			Person ps1;//Person클래스의 객체변수 ps1지정
			//우리가 위에서 정의한 Serializable인터페이스 구현한 Person 클래스
			ps1 = new Person("철수", 20);//값을 넣어주고 객체 생성
			FileOutputStream fout = new FileOutputStream("person.dat");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(ps1);//객체를 직접 써넣어
			objout.close();
			fout.close();
			FileInputStream fin = new FileInputStream("person.dat");
			//아까 위에서 쓰기를 위해서 생성한 파일을 이번에는 읽어내기 위해서 파일 지정
			ObjectInputStream objin = new ObjectInputStream(fin);
			//아까 생성한 fin객체를 매개변수로 받아
			Person ps2;
			ps2 = (Person)objin.readObject();
			//우리가 읽어낸 객체를 ps2객체에 저장
			//반환받은 내용을 해당 Person객체로 캐스팅 해줘야함
			System.out.println(ps2);
			objin.close();
			fin.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
	}
}
