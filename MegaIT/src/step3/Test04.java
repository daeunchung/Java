package step3;

public class Test04 {
	public static void main(String[] args) {
		
		for(int i = 1; i<10; i++) {
			
			for(int j = 0; j < 9-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++) {
				System.out.print(i + " ");
			}
			for(int j = 0; j < 8-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
