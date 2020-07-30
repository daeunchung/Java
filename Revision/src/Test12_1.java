class ExamStatic{
	static int count = 0;
}
public class Test12_1 {
	public static void main(String[] args) {
		System.out.println(ExamStatic.count);
		ExamStatic.count = 1;
		System.out.println(ExamStatic.count);
	}
}
