package hijava;
//InetAddressŬ������ Ȱ���� ����
import java.net.*;//��Ʈ��ũ ���� Ŭ������ �����ϱ� ���ؼ�
public class Exam37_1 {
	public static void main(String[] args) {
		try {//��Ʈ��ũ ���� Ŭ���� ó���� ���� ����ó�� try-catch���
			String url = "www.kut.ac.kr";//url���� ���� ��  ������Ʈ �ּҸ� ���ڿ��� ����
			InetAddress local = InetAddress.getLocalHost();
			//�����޼��� �̿��Ͽ� local�� ����//������ ���� ��ǻ���� InetAddress��ü
			InetAddress addr = InetAddress.getByName(url);
			//�����޼��� �̿��Ͽ� url�� �Ű������� ����
			//InetAddressŸ���� addr������ url�� �ش��ϴ� InetAddress��ü�� ��
			System.out.println(addr.getHostAddress());//url�� ip�ּ�
			System.out.println(addr.getHostName());//�ּҸ�Ī//www.kut.ac.kr
			System.out.println(local.getHostAddress());//���� �ۼ����� ��ǻ���� ip�ּ�
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}//url�� ip�ּ�, url��Ī, ���� �۵����� ��ǻ���� ip�ּ� ���
