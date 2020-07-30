//내부 익명 클래스
//일반적으로 클래스는 정의와 생성이 분리되어있으나, 내부익명클래스는 정의&생성 통합 -> 클래스명칭 X
//클래스의 인스턴스를 메서드 호출 시 매개변수에 넣을 때 사용 
//-> 클래스를 여러번 생성시킬 필요 X 단한번만 사용하면 될때 내부익명클래스 사용
//-> 인스턴스 생성 후 레퍼런스 유지할 필요 없을때 사용
//레퍼런스 유지 = 객체를 계속 생성해야하는것
//익명 클래스는 클래스를 상속하거나 인터페이스를 구현할 때 사용할수있음
//new 부모클래스명(매개변수){
//클래스 정의;
//} ->생성과 정의가 한꺼번에 결합
public class Test16_1 {//외부클래스 
	interface HelloLanguage{//외부클래스의 인터페이스
		public void language();//메서드 이름만 기재
	}
	public void helloLang() {
		HelloLanguage javalang = new HelloLanguage() {
			public void language() {
				System.out.println("Java Language");
				//정의되는 부분 내에 메서드를 생성
			}
		};//내부 익명 클래스를 사용해서 즉석에서 객체 생성 그래서;꼭 붙여줘야함 문장이란다
		//한번만 쓰고 다시 안쓸꺼면 그자리에서 객체생성하고 적어주는 익명내부클래스 쓰기 굳
		javalang.language(); //메서드를 호출
	}
	public static void main(String[] args) {
	Test16_1 myhello = new Test16_1();
	myhello.helloLang();//외부클래스의 메서드 호출
	}
}