package chapter01;

// ���� ������(++, --)

public class Ex01 {
	public static void main(String[] args) {
		
		int num = 10;
		num++;							// num = num + 1;
		++num;
		System.out.println(num);
		
		//-----------------------------------------------------
		num = 10;
		int result = ++num;
		System.out.println("num = " + num);
		System.out.println("result= " + result);
	
		//-----------------------------------------------------
		// ���׿����ڰ� �ٸ� �����ڿ� �Բ� ���̰�, ���������� �ۼ��Ǿ��� ���, 1���� ������ ���� �������� �����Ѵ�.
		// syso() �� �Ұ�ȣ�� �����ڷ� ��޵Ǳ⿡ syso(num++) �ϸ� 11�� �ƴ� 10 ���
		
		num = 10;
		result = num++;
		System.out.println("num = " + num);
		System.out.println("result= " + result);
		
	
	
	
	}
}
