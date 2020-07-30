//너무어려워.... 모르겠어 ㅠ.ㅠ
//이해안돼 다시들어...
package hijava;
//에코서버예제
import java.net.*;
import java.io.*;
public class Exam38_1 {
	ServerSocket serv = null;
	Socket sock = null;
	DataInputStream din;
	DataOutputStream dout;
	String recv;
	public Exam38_1() {
		try {
			serv = new ServerSocket(7000);
			System.out.println("서버 대기중");
			sock = serv.accept();
			System.out.println(sock.getInetAddress());
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			recv = din.readUTF();
			dout.writeUTF(recv);
			sock.close();
			din.close();
			dout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		Exam38_1 ex = new Exam38_1();

	}

}