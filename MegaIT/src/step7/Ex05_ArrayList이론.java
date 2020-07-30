package step7;

import java.util.ArrayList;

/*
 * # �迭�� �Ѱ�
 * - �迭�� �ѹ� �����ϸ� ���α׷����� �� ũ�⸦ �ٲ� �� ����.
 * 
 * # java.util.ArrayList
 * - ArrayList Ŭ������ �����Ͱ� �ԷµǸ�, �ڵ����� ũ�Ⱑ Ŀ����
 * - �����Ͱ� ���ŵǸ�, �ڵ����� ũ�Ⱑ �۾�����.
 * - �߰��� �����Ͱ� ���ԵǸ�, �����Ͱ� ���Ե� ��ġ���� ��� �����Ͱ� �ڷ� �̵��ǰ�
 * - �߰��� �����Ͱ� ���ŵ� ���� ��ġ���� ��� �����Ͱ� ������ �̵��Ѵ�.
 * 
 * # <E>
 * - ���׸�(generic)�̶� �θ��� ArrayList�� ����� ������ Ÿ���� 
 *   �ݵ�� Ŭ������ �ۼ��Ѵ�.
 * - �⺻ �ڷ��� �����͸� �����ϴ� ArrayList�� ������ �ϴ� ��쿡��
 *   ���� Ŭ������ ����Ѵ�.
 *   
 *   ArrayList list = new ArrayList();						// JDK 1.4 ����
 *   ArrayList<Integer> list = new ArrayList<Integer>();	// JDK 1.5 ����
 *   ArrayList<Integer> list = new ArrayList<>();			// JDK 1.7 ����
 */
class MyVector{
	int arr[];
	int count = 0;
	
	void add(int a) { // a�� �߰��ϴ� �޼���
		if(count == 0) {
			arr = new int[1];
		}else {
			int[] temp = arr;
			arr = new int[count+1];
			for(int i = 0; i<count; i++) {
				arr[i] = temp[i];
			}
		}
		arr[count] = a;
		count += 1;
	}
	
	int size() { // count�� ��ȯ �޼���
		return count;
	}
	
	void remove(int index) { // �Է¹��� index�� �ش��ϴ� ���� �����ϴ� �޼���
		int[] temp = arr;
		arr = new int[count-1];
		for(int i = 0; i<index; i++) {
			arr[i] = temp[i];
		}
		for(int i = index; i<count-1; i++) {
			arr[i] = temp[i+1];
		}
		count -= 1;
	}
}

public class Ex05_ArrayList�̷� {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// add(value) : ArrayList�� �� �ڿ� value�� �߰��Ѵ�.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// add(index, value) : ArrayList�� index��° ��ġ�� value�� �����Ѵ�.
		list.add(0, 9);
		System.out.println(list);
		/* ��? �̰� ��� ����? ������ ���� �ʴ´�
		 * �ֳ��ϸ� list�� ArrayList<Integer>Ŭ������ �������̱� ���� !!
		 * �� list.add(10); ���� add�� MyVectorŬ���� ���� add �޼��尡 �ƴ϶�
		 * ArrayList Ŭ�������� �����ϴ�(?) �޼��� �� ���� ~.~
		 * list.���� ġ�� ���� �ߴ� �޼���� ���� �˼����� */
		
		// remove(index) : ArrayList�� index��° �����͸� �����Ѵ�.
		list.remove(3);
		System.out.println(list);
		
		// size() : ArrayList�� ����� �������� ������ ���´�.
		int count = list.size();
		System.out.println("count = " + count);
		
		// get() : ArrayList�� index��°�� value�� ���´�.
		System.out.print("[");
		for(int i = 0; i<count; i++) {
			System.out.print(list.get(i));
			if(i != count-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		// set(index, value) : ArrayList�� index��° ��ġ�� value�� �����Ѵ�.(value�� ����)
		list.set(3, 5);
		System.out.println(list);
		
		/*
		 * # ���� for��
		 *   1) �迭�̳� ArrayList ��ü �����͸� ������� �۾��� ��� ����Ѵ�.
		 *   2) ����
		 *      for(�ڷ��� ������ : �迭 or ArrayList){
		 *      	 �ݺ��� ����;
		 *      }
		 */
		
		// list�� 0��° ���� num�� ������ �� �ݺ��� �����ϸ�
		// list�� ������ ���� num�� ������ �� �ݺ��� ���� ����ȴ�.
		for(int num : list) {
			System.out.println(num);
		}
		
		// clear() : ArrayList�� ��� �����͸� �����Ѵ�.
		list.clear();
		System.out.println(list.size());		// 0
		System.out.println(list);				// []

	}
}
