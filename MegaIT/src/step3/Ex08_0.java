package step3;
// 배열 길이 구하기
public class Ex08_0 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		//배열의 길이 구하기
		int size = arr.length;
		System.out.println("size = " + size);
	}

}
/*
 * length() : 문자의 길이
 * 
 * length : 배열의 길이
 * 
 * 2차원 배열일 경우 -> arr.length : 줄의 갯수 / arr[0].length : 0번째 줄의 배열 갯수
*/