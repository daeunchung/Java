package step2;
/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */
public class Ex02_4Q {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		int max = 0;
		int topidx = 0;
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		for(int i = 0; i < 5; i++) {
			if(scores[i] > max) {
				max = scores[i];
				topidx = i;
			}
		}
		
		System.out.println(hakbuns[topidx] +"번 " + scores[topidx] + "점 " );

	}

}
