package hijava;

public class Exam7_1 {

	public static void main(String[] args) {
		//for(초기식;조건식;증감식) 반복횟수 정할 수 있을때 사용
		//while(조건식){
		//문장
		//}
		//반복횟수 정하기 어려울때 사용, 초기식과 증감식이 없고 조건식만
		//있으므로 블럭 내부에 종료 조건을 작성해야 함
		//do{
		//문장
		//}while(조건식);
		//조건검사를 블럭 문장 수행 후에 한다
		//적어도 한번은 블럭 내의 문장을 수행함
		int i, sum =0;
		for (i =1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
