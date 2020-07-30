package chapter01;
// SCE(Short Circuit Evaluation : 최단거리 연산)
public class Ex03 {
	public static void main(String[] args) {
		
		int num1 = 0; int num2 = 0;
		
		boolean result;
		result = (num1 += 10) < 0 && (num2 += 10) > 0;
		// && 와 || 연산자 앞뒤의 true false 여부에 따라서 뒤에꺼 돌리는지 안돌리는지 결정
		
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	} 
}
