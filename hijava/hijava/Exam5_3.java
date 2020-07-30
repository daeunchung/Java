package hijava;

public class Exam5_3 {

	public static void main(String[] args) {
		int iNum1 = 7, iNum2 = 5, result;
		//      111        101
		result = iNum1 & iNum2;
		System.out.println(result);//101
		result = iNum1 | iNum2;
		System.out.println(result);//111
		result = iNum1 << 2;
		System.out.println(result);//11100
		result = iNum1 >> 2;
		System.out.println(result);//001.11
	}

}
