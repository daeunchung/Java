package step3;
/*
 * int test1[] = {1,2,3,2,1};		
 * int test2[] = {1,3,4,4,2};
 * int test3[] = {1,1,1,2,1};
 * // 위 배열에서 중복안된숫자를 제거하시요 
 * // 1) {1,2,1,2}
 * // 2) {4,4}
 * // 3) {1,1,1,1}
 */

public class Ex12_2 {
	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};
		int temp[] = new int[5];
		int count = 0;
		
		for(int i = 0; i<5; i++) {
			temp[count] = test1[i];
			int check = 0;
			
			for(int n = 0; n<5; n++) {
				if(i != n && temp[count] == test1[n]) {
					check = 1; // 앞에 수들이랑 중복되면 check = 1;
				}
			}
			// 중복된 숫자니까 count 증가
			if(check == 1) {
				count ++; 
			}
		}
		
		for(int i = 0; i<count; i++) {
			System.out.print(temp[i] + " ");
		} // 답은 {1, 2, 2, 1 }로 나옴
		
	}

}
