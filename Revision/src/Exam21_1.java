//다운캐스팅
import java.util.Vector;
public class Exam21_1 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("강아지");
		v.addElement("고양이");
		v.addElement("원숭이");
		String str = (String)v.get(1);
		//다운캐스팅을 저장할 당시의 원소의 타입을 그대로 반환받을때 지정해야한다
		System.out.println(str);
	}
}


/*
제네릭 개요 
-객체를 매개변수로 넣어줄때 객체들 여러종류를 혼합해서 넣어줬을때, 출력할때 특정 객체를 알수없으면 출력을 못하거나 부작용발생
------>> 객체 생성시 특정 클래스 타입을 지정해서 그 클래스 만(특정 객체) 을 요소로 가질 수 있도록 한다
-지정한 클래스 형태가 아닌 경우 저장 불가능
-Vector클래스는 제네릭을 이용한 클래스
-Vector클래스에 String 타입만 을 저장하는 문법

Vector<String>v = new Vector<String>();
for(String str:v){
System.out.println(str);
}
  
제네릭으로 선언한 객체는 확장 for문을 사용가능
일반 for문 : 반복횟수를 알고있을 경우에 사용
확장 for문 : 원소의 개수를 모르더라도 원소의 끝까지 순차적으로 접근할 수 있음
-> for(데이터형  변수명:컬렉션변수명){
   문장;
  } //처음부터 저장돼있는만큼 순차 접근 가능
  //변수명의 테이터형은 제네릭의 원소와 동일해야함

  
  
  
  
  
*/
