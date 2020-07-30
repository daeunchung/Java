//              정 적 맴버 변수
//여러객체가 맴버변수를 공유하고자 할 경우 static키워드를 사용
//생성된 객체의 개수를 셀 필요가 있을경우에 유용
//객체 생성없이 멤버에 접근이 가능
//static맴버변수는 객체생성 이전에 메모리 할당
//static맴버변수는 클래스명으로도 접근ok 객체생성후 객체변수로도 접근ok
//class Eee{//정적맴버변수 정의
//static int count = 0;
//}
//Eee test = new Edd();//객체 생성 후 객체변수로 접근(방법1)
//test.count = 1;
//Eee.count = 2;//클래스명으로 접근(방법2)


public class Exam12_1 {
	static int count = 0;
	int age = 30;
	public static int getCount() {
		return count;
	}
	public static void main(String[] args) {
		System.out.println(Exam12_1.getCount());
		Exam12_1.count++; //클래스명.속성명;
		System.out.println(Exam12_1.getCount());
	}
}
