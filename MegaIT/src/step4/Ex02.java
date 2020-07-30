package step4;
// # 문자열 1차원
public class Ex02 {

	public static void main(String[] args) {
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int sum = 0;
		int[] arr = new int[3];
		String[] ar = str.split("/");
		for(int i = 0; i<3; i++) {
			arr[i] = Integer.parseInt(ar[i]);
			sum += arr[i];
		}System.out.println(sum);
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = ""; // 빈 문자열을 만들어 놓는다는 뜻 맞는지?
		
		for(int i = 0; i<scores.length; i++) {
			text += scores[i] + "";
			// scores[i] 숫자값에 "" 해서 (꼼수로문자열화) 문자열에 넣어주기
			if(i != scores.length - 1) {
				text += "/";
			}
		}System.out.println(text);

 
	}

}
