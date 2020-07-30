package step7;
/* 로또 한장은 숫자 8개
 * 3이 3번 출력되면 1회 당첨된것
 * 
 *  - 로또 1셋트 채워주기
 * 일단 5개에 모두 Lotto 객체 부여하고
 * 8개 숫자를 가진 로또 5줄에 모두 random 수를 넣어줘
 * 0 또는 1 받아서 0은 0으로 1은 3으로 저장
 * 
 * 전부 다 채워주고 나서 - 체킹(확인작업)
 * int count 설정해서
 * 3이 연속 3번 나오면 win = true;
 *  
 * check가 false, win이 true 이면 여태 한번도 당첨X, 이번에 처음당첨O
 * check가 true, win이 false 이면 이전에 당첨 경험O, 이번에는 당첨X
 * 
 * check true win true -> 당첨횟수 1번만 이어야해서 불가능
 * check false win false -> 한번은 무조건 당첨 되어야해서 불가능
 */
import java.util.Random;

class Lotto{
	int [] data = new int[8];
	boolean win = false;
	void print() {
		for(int i = 0; i < 8; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
	}
}
public class Ex02_2 {	
	public static void main(String[] args) {
		
		// 문제) 로또 1셋트
		//      1개는 당첨 4개는 꽝인 랜덤복권 생성
		Random ran = new Random();	
		Lotto[] lotto = new Lotto[5];
		boolean check = false;
		
		for(int n = 0; n<lotto.length; n++) {
			lotto[n] = new Lotto();
				
			for(int i = 0; i<8; i++) {
				int r = ran.nextInt(2);
				
				if(r == 0) {
					lotto[n].data[i] = 0;
				}else if(r == 1) {
					lotto[n].data[i] = 3;
				}
			}	
			int count = 0;
			for(int i = 0; i<8; i++) {
				if(lotto[n].data[i] == 3) {
					count++;
					if(count == 3) {
						lotto[n].win = true;
						break;
					}
				}else {
					count = 0;
				}
			}
			if(check == false && lotto[n].win == true) {
				check = true;
				lotto[n].print();
			}
			else if(check == true && lotto[n].win == false) {
				lotto[n].print();
			}	
		}		
	}
}
/*
 * 내 코드처럼 하면 콘솔창에 로또가 (1줄~5줄) 때에 따라 다르게 출력된다. 
 * Q. 왜 내 코드처럼 for(int n = 0; n<lotto.length; n++) {} for문으로 5번 돌리면 안될까 ?
 * 
 * A. for문을 5번 돌리라는 명령을 주었기 때문에 가장 아래에 print(); 메서드가 5번 실행되는 보장X
 * 왜냐하면 (check==false && win==false)일 경우, (check==true && win==true)인 경우 도
 * 5번 안에 포함이 되지만 print(); 되지는 않기 때문에 랜덤하게 출력 횟수가 오락가락한다(1번~5번)
 * 
 * 반면에 while(n<lotto.length) {} while문으로 돌리면
 * 가장 아래에 print(); 를 해야만 n++; 이 되기 때문에 확실히 출력이 5번 이루어진다.
 */
