package hijava;
//���� Ŭ���̾�Ʈ ����
//���� �����ȉ�
import java.net.*;
import java.io.*;
public class Exam38_2 {
	Socket sock = null;
	DataInputStream din;
	DataOutputStream dout;
	String recv;
	public Exam38_2() {
		try {
			sock = new Socket("127.0.0.1", 7000);
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			dout.writeUTF("������ ���� �׽�Ʈ");
			recv = din.readUTF();
			System.out.println("���ŵ� ������ : " + recv);
			sock.close();
			din.close();
			dout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		Exam38_2 ex = new Exam38_2();

	}

}
