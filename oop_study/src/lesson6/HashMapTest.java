package lesson6;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

//		HashMap�� K(Key)�� V(Value) �� �Ҵ��ϴ� ������� ����ȴ�.
//		Key�� String���� �ϰ� Value�� HashMap�� ������ �������� Ÿ���� ����.
		
		HashMap<String, Integer> hmap = new HashMap<>();
		
		
//		(key, value) : HashMap�� key�� value�� �Ҵ��Ѵ�.
		hmap.put("apple", 1000);
		hmap.put("orange", 1500);
		hmap.put("melon", 5000);
		hmap.put("water melon", 15000);
		System.out.println(hmap.size() + " : " + hmap);
		// 4 : {orange=1500, apple=1000, water melon=15000, melon=5000} ==> �ܼ�â
		System.out.println("============================================================");

//		get(key) : HashMap�� key�� �Ҵ�� value�� ���´�.
		System.out.println(hmap.get("melon"));
		System.out.println("============================================================");

//		put() �޼ҵ�� �������� �ʴ� key�� �־��ָ� �����Ͱ� �Էµǰ� �����ϴ� key�� �־��ָ� �����ȴ�.
		hmap.put("apple", 1234);
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("============================================================");

//		keySet() : HashMap�� key�� ���´�.
		System.out.println(hmap.keySet());
		System.out.println("============================================================");
//		���� for �� keySet() �޼ҵ带 ����ϸ� HashMap �� ����� ��� �����͸� ���� �� �ִ�.
		int sum = 0;
		for(String key : hmap.keySet()) {
//			System.out.println(key);			// HashMap�� ��� key�� ���� �� �ִ�. 
			System.out.println(hmap.get(key));	// HashMap�� ��� key�� �Ҵ�� value�� ���� �� �ִ�.
			sum += hmap.get(key);
		}
		System.out.println("�ݾ� �հ� : " + sum);
		System.out.println("============================================================");

//		remove(key) : HashMap�� key�� �ش�Ǵ� ���� �����Ѵ�.
		hmap.remove("apple");
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("============================================================");
		
//		clear() : HashMap�� ��� ���� �����Ѵ�.
		hmap.clear();
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("============================================================");
	
	}

}
