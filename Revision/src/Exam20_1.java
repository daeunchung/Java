//HashSet�� ArrayList ����
import java.util.*;
public class Exam20_1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("������");
		set.add("�����");
		set.add("������");
		System.out.println(set);
		set.remove("�����");
		System.out.println(set);
		System.out.println(set.size());
		ArrayList list = new ArrayList();
		list.add("���");
		list.add("��");
		list.add("����");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
	}
}

/*
�÷���
-����Ʈ, ť, ���� ���� �ڷᱸ�� ����
-�������̽�, ����Ŭ����, �˰������� ����
-import.java.util ��Ű��

Set�������̽�
-�迭�� ������ ���� �׷��� �迭���� �ξ� ���� ������ ����
-���� �ߺ� X����, ���Ҽ��� X �ߺ� X 
-HashSet Ŭ������ ����

List�������̽�
-���� ����O �ִ� ��ü�� ����, �ߺ�ok
-ArrayList, Vector, Stack, LinkedList ����
-�����������ؼ� �ε����� ���

-> VectorŬ����  (���� ���� ����)
-List �������̽�(����O) �� ������ Ŭ����, ��ü���� ����
-���� ���� �� ��� �ڵ����� Ȯ��
-�Ϲ� �迭�� �߰��� ���� �ϳ� �������ٰ� �ڵ����� ������� �ʴµ� , VectorŬ������ �߰��� �������� �ڵ��� �ϳ��� �����

*/