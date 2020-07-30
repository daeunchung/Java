package hijava;

public class Exam4_3 {

	public static void main(String[] args) {
		int iNum1 = 10, iNum2 = 20, iNum3 = 30;
		boolean result;
		result = (iNum1 < iNum2) && (iNum2 < iNum3);
		System.out.println(result);
		result = (iNum1 > iNum2) || (iNum2 < iNum3);
		System.out.println(result);
		result = !result;
		System.out.println(result);
		iNum2 = (iNum1 >= 100) ? 200 : 300;
		System.out.println(iNum2);
		
	}

}
