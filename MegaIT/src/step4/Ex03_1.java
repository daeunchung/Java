package step4;
// # 문자열 2차원
public class Ex03_1 {

	public static void main(String[] args) {
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
	
		String[] arr = str.split(",");
		
		for(int i = 0; i<arr.length; i++) {
			String[] info = arr[i].split("/");
			// 배열 info 는 [1][2]짜리 배열
			// info[1]에는 이름 문자열, info[2]에는 점수 문자열
			
			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
			// score 배열은 int 배열이라서   문자열 -> 숫자  변환 필요
		}
		
		for(int i = 0; i<3; i++) {
			System.out.println(name[i] + " : " + score[i] + "점");
		}
		
	}


}
