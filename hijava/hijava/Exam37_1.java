package hijava;
//InetAddress클래스를 활용한 예제
import java.net.*;//네트워크 관련 클래스를 선언하기 위해서
public class Exam37_1 {
	public static void main(String[] args) {
		try {//네트워크 관련 클래스 처리를 위해 예외처리 try-catch사용
			String url = "www.kut.ac.kr";//url변수 선언 후  웹사이트 주소를 문자열로 지정
			InetAddress local = InetAddress.getLocalHost();
			//정적메서드 이용하여 local에 저장//접속한 현재 컴퓨터의 InetAddress객체
			InetAddress addr = InetAddress.getByName(url);
			//정적메서드 이용하여 url을 매개변수로 전달
			//InetAddress타입의 addr변수에 url에 해당하는 InetAddress객체를 얻어냄
			System.out.println(addr.getHostAddress());//url의 ip주소
			System.out.println(addr.getHostName());//주소명칭//www.kut.ac.kr
			System.out.println(local.getHostAddress());//현재 작성중인 컴퓨터의 ip주소
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}//url의 ip주소, url명칭, 현재 작동중인 컴퓨터의 ip주소 출력
