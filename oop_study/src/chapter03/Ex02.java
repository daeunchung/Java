package chapter03;
/*
 *  # ����������(=����������)
 *  public > protected > default < private
 *  .public : ������Ʈ ��ü���� ��밡��
 *  .protected : ���� äŰ��/�ٸ� äŰ���� �ִ��� �ڽ� Ŭ������ ��� ���� ����
 *  .default : (���� ������ ����) ���� ��Ű�� �������� ��밡��
 *  .private : Ŭ���� ���� ����鿡�Ը� ������ ���
 *  
 *  # ����ȭ
 */

class Student{
	private int score;
	// get�� set�޼��� �ڵ��ϼ� ����Ű
	// alt + shift + s,r

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	// ���Խ�  ���۸��ؼ� ����
//	public void setScore(int s) {
//		score = s;
//		
//	}
//	public int getScore() {
//		return score;
//	}
}
public class Ex02 {

	public static void main(String[] args) {

		Student hgd = new Student();
//		hgd.score = 100;
	}

}
