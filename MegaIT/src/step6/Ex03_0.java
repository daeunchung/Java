package step6;

/*
 * # �޼����� ����[3�ܰ�] : ���ϰ��� �ִ� �޼���
 * int getNum(�Ű�����[parameter]){
 * 		������ ����;
 * 		return 10;
 * } 
 *
 * # �޼����� ���(ȣ��)
 * int num = getNum(����,�μ�[argument]);
 */

class Ex3{
	
	int num;
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
}

public class Ex03_0 {
	public static void main(String[] args) {

		Ex3 e = new Ex3();
		e.setNum(100);
		
		int result = e.getNum();
		System.out.println(result);
		
	}
}
