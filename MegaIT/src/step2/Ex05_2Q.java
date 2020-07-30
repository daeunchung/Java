package step2;
/*
 * # 4의 배수만 저장
 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
 */
public class Ex05_2Q {

	// 13:00 ~ 13:20(20분)
	
	public static void main(String[] args) {
		int cnt = 0;
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		for(int i = 0; i < 5; i++) {
			
			if( arr[i] % 4 == 0 ) 
				cnt++;
			}
		
		temp = new int[cnt]; // =======>> 이거 정말 까다롭다 개념 제대로 알아야 가능
		
		//heap에서 배열크기를 cnt로 만들어서 stack에 빈 주소 가지고 있던 temp한테 넣어준건가 ~?
		//temp에 int[cnt]주소값이 배정되었으니 이제 이 다음에  배열안에 값을 저장가능
		
		
		int j = 0;  // =======>> 이거 정말 까다롭다 개념 제대로 알아야 가능
		
		for(int i = 0; i < 5; i++) {
			
			if( arr[i] % 4 == 0 ) {
				temp[j] = arr[i]; // 값 받아서 배열안에 저장시킴
				j++;
			}
		}
		
		System.out.print("{");
		for(int i = 0; i < cnt; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.print("}");
	}

}
// temp[cnt] = arr[i]; // java.lang.NullPointerException라고 에러남







