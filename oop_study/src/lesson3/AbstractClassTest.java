package lesson3;

//�Ѱ� �̻��� �߻� �޼ҵ带 ������ Ŭ������ �߻� Ŭ������ �θ��� abstract ���� ����� �����.
//�߻� Ŭ������ �ҿ����� �߻� �޼ҵ带 ������ �ҿ����� Ŭ�����̹Ƿ� ��ü�� ����� ����� �� ����.
//�߻� Ŭ������ ����� ��Ű�� ���ؼ� ����� ����ϴ� Ŭ������ �߻� Ŭ������ ��ӹ��� �ڽ� Ŭ������ �߻� Ŭ������ ��� �߻� �޼ҵ带 override ���Ѽ� ����ؾ� �Ѵ�.

abstract class Product{
//	public void kindOf() {}		// �ƹ��� �ϵ� ���� �ʴ� �Ϲ� �޼ҵ�
//	�߻� �޼ҵ�� �ƹ��� �ϵ� ���� �ʴ� {} ����� ������ �ʴ� �޼ҵ带 ���Ѵ�.
//	�߻� �޼ҵ�� abstract ���� ����� ����� {} ����� ���� �ҿ����� �޼ҵ�� 
//	�߻� �޼ҵ尡 ���Ե� Ŭ������ ��ӹ��� �ڽ� Ŭ�������� �ݵ�� override �ؼ� ����ؾ� �ϴ� �޼ҵ��̴�.
	
	public abstract void kindOf();	// �߻� �޼ҵ� 
	
}

// Product Ŭ������ ��ӹ޾� Camera Ŭ������ �����.
class Camera extends Product{
	
	@Override	// ��ӹ��� �ڽ� Ŭ�������� �ݵ�� override �ؼ� ����ؾ��� ! 
	public void kindOf() {

	}
}

public class AbstractClassTest {
	public static void main(String[] args) {
		
		//  �߻� Ŭ������ ��ü�� ����� ����� �� �����Ƿ� ������ �߻��ȴ�.
		//	Product product = new Product();
	}
}
