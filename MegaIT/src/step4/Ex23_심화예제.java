package step4;

public class Ex23_심화예제 {
	/*
	 * # 2차원 반복문
	 * 1   2  3  4  5
	 * 10  9  8  7  6
	 * 11 12 13 14 15
	 * 20 19 18 17 16
	 * 21 22 23 24 25
	 */

	public static void main(String[] args) {
		for(int i = 1; i<6; i++) {
			
			if(i % 2 == 1) {
				for(int j = 5*(i-1) + 1; j <= 5*i; j++) {
					System.out.print(j + "\t");
				}
			}else if( i % 2 == 0) {
				for(int j = 5*i; j > 5*(i-1); j--) {
					System.out.print(j + "\t");
				}
			}
			System.out.println();
		}
	}
}
