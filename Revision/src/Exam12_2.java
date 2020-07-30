//정적 메서드
//클래스 차원에서 사용가능한 메서드
//객체 생성없이 클래스명으로 간편 호출 가능 //정적메서드 내에서는 일반 맴버변수 사용 불가능
//방법1 - 객체생성후에 호출
//ExamStatic test = new ExmaStatic();
//test.getCount();
//방법2
//ExamStatic.getCount();
public class Exam12_2 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Math.sqrt(25.0));
	}
}
//자바에서 제공하는 Math클래스의 정적메서드를 사용
//System.out.println(Math.random()); 0.0과 1.0 사이의 난수를 출력
//System.out.println(Math.sqrt(25.0)); 제곱근을 출력