//리스트 생성 예제
import java.awt.*;
public class Exam23_5 extends Frame {
	public Exam23_5() {
		this.setLayout(new FlowLayout());
		List list = new List();
		list.setBackground(Color.GREEN);
		list.add("사과");
		list.add("배");
		list.add("오렌지");
		list.add("레몬");
		list.add("수박");
		this.add(list);
	}

	public static void main(String[] args) {
		Exam23_5 f = new Exam23_5();
		f.setSize(300,200);
		f.setVisible(true);
	}

}
//어떻게 5개 출력하는데 4개만 보이고 한개는 스크롤으로 설정한건지 모르겠음 ?.?
