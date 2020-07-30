package step7_Ex05Q;
import java.util.Vector;
// 메모리 구조 그리기 실습
class ST{	
	int num;
	String name;
}
class St_manager{
	static int count = 0;
	static Vector<ST> list = new Vector<ST>();
}
public class Ex05_static {
	public static void main(String[] args) {
		
		ST st = new ST();
		st.num = 10001;
		st.name = "김철수";
		St_manager.list.add(st);
		st = new ST();
		st.num = 10002;
		st.name ="최영희";
		St_manager.list.add(st);
		// 위 내용을 그려보시요
	}

}
