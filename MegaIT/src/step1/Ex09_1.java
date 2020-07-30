package step1;
/*
 *  # 변수의 생명주기 (Scope)
 */
public class Ex09_1 {
	public static void main(String[] args) {
		int x = 10;
		
		if(true) {
			System.out.println("x= " + x);
			int y = 20;
		}
		//System.out.println("y= " + y);
	}	
}
