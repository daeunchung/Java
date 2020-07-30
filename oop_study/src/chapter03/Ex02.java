package chapter03;
/*
 *  # 접근제어자(=접근지정자)
 *  public > protected > default < private
 *  .public : 프로젝트 전체에서 사용가능
 *  .protected : 같은 채키지/다른 채키지에 있더라도 자식 클래스의 경우 접근 가능
 *  .default : (접근 지정자 생략) 같은 패키지 내에서만 사용가능
 *  .private : 클래스 내의 멤버들에게만 접근이 허용
 *  
 *  # 은닉화
 */

class Student{
	private int score;
	// get과 set메서드 자동완성 단축키
	// alt + shift + s,r

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	// 정규식  구글링해서 적용
//	public void setScore(int s) {
//		score = s;
//		
//	}
//	public int getScore() {
//		return score;
//	}
}
public class Ex02 {

	public static void main(String[] args) {

		Student hgd = new Student();
//		hgd.score = 100;
	}

}
