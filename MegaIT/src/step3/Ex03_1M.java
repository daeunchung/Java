package step3;
/*1623-1633
 * # 중복숫자 금지[2단계]
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */

import java.util.Random;

public class Ex03_1M {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		
		int i = 0;
		while(i<5) {
			int num = ran.nextInt(10) + 1;
			
			int check = 1; // 중복되는지 체크하는 수단
			// 중복 X -> 1, 중복 O -> -1
			int j = 0;
			
			while(j<i) { // j는 현재까지 저장된 배열을 돌면서 값 체킹하는 index
				if(num == arr[j]) { //이미 앞에 있으면
					check = -1; // check를 -1로 바꿔서 
				}j++; // 새로운 랜덤값을 받도록 j를 증가 !
			}
			
			if(check == 1) { //check가 -1로 안바껴서 중복되는것 없다는 뜻 
				arr[i] = num; // 중복없는 새 num을 배열에 새로 저장해
				i++;
			}
		}
		
		for(int j = 0; j<5; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
