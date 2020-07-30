package step4;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
		public static void main(String[] args) {
			
			//문제) 영어단어 맞추기  
			// 영어단어가 전부 * 로 표시된다. 
			// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
			// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
			// 전부 벗겨지거나 맞추면 종료 
			Scanner scan = new Scanner(System.in);
			Random ran = new Random();
			
			int score = 100;
			String word = "performance";
			String meaning = "공연";
			int size = word.length();
			
			int check[] = new int[size];  // 힌트 체크를 통해서 확인할수있다.
			char [] letter = word.toCharArray();
			
//			for(int i = 0; i<letter.length; i++) {
//				System.out.print(letter[i]);
//			}System.out.println();
			
//			for(int i = 0; i<check.length; i++) {
//				System.out.print(check[i]);
//			}System.out.println();

			int cnt = 0;

			while(true) {
				System.out.println("뜻 : " + meaning);
				System.out.print("문제 : ");
				for(int i =0; i< size; i++) {
					if(check[i] == 0) {
						System.out.print("*");
					}else if(check[i] == -1) {
						System.out.print(letter[i]);
					}
					
				}
				System.out.println();
				System.out.println("영어단어를 입력하세요 >>> ");
				String me = scan.next();
				
				if(me.equals(word)) {
					System.out.println("정답입니다.");
					System.out.printf("틀린 횟수는 %d번, %d점 감점입니다.", cnt, cnt*5);
					break;
					
				}else {
					
					while(true) {
						int r = ran.nextInt(size);
						if(check[r] == 0) {
							for(int i = 0; i<size; i++) {
								if(letter[i] == letter[r]) {
									check[i] = -1;
								}
							}
							break;
							
						}else if(check[r] == -1){
							continue;
						}
					}
					cnt += 1;
				}
				
				if(cnt == 9) {
					System.out.println("너무 많이 틀리셨군요.");
					System.out.println("정답은 " + word + "입니다.");
					break;
				}
			}
		}
}
