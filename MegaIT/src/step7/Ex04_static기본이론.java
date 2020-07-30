package step7;
// static // 전역변수
// 프로그램이 시작할때 할당받아서
// 프로그램이 종료될때 해제되면 변수 ( 위치 : static 영역 )
class Ttest{
	int a;
	static int b;
	int c;
	static void test() {
	}
}
public class Ex04_static기본이론 {
	public static void main(String[] args) {
		Ttest.b = 100;
		Ttest t = new Ttest();
		Ttest t1 = new Ttest();
	}
}
