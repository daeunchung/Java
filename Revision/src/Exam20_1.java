//HashSet과 ArrayList 예제
import java.util.*;
public class Exam20_1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("강아지");
		set.add("고양이");
		set.add("원숭이");
		System.out.println(set);
		set.remove("고양이");
		System.out.println(set);
		System.out.println(set.size());
		ArrayList list = new ArrayList();
		list.add("사과");
		list.add("배");
		list.add("딸기");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
	}
}

/*
컬렉션
-리스트, 큐, 스택 같은 자료구조 제공
-인터페이스, 구현클래스, 알고리즘으로 구성
-import.java.util 패키지

Set인터페이스
-배열과 유사한 형태 그러나 배열보다 훨씬 많은 역할을 수행
-원소 중복 X적합, 원소순서 X 중복 X 
-HashSet 클래스가 있음

List인터페이스
-원소 순서O 있는 객체를 저장, 중복ok
-ArrayList, Vector, Stack, LinkedList 있음
-원소접근위해서 인덱스를 사용

-> Vector클래스  (비교적 사용빈도 높음)
-List 인터페이스(순서O) 를 구현한 클래스, 객체저장 가능
-원소 가득 찰 경우 자동영역 확보
-일반 배열은 중간에 원소 하나 지워진다고 자동으로 당겨지지 않는데 , Vector클래스는 중간에 지워지면 자동을 하나씩 당겨짐

*/