package step7;

import java.util.ArrayList;

class Tv{
	String name; String brand; int price;
	
	Tv(String name, String brand, int price){
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}

class MyList{
	Tv[] arr; int count;
	
	void add(Tv e) {
		if(count == 0) {
			arr = new Tv[count+1];
		}else if(count > 0) {
			Tv[] temp = arr;
			arr = new Tv[count+1];
			for(int i = 0; i<count; i++) {
				arr[i] = temp[i];
			}
		}
		arr[count] = e;
		count += 1;
	}
	
	int size() {
		return count;
	}
	
	void remove(int index) {
		if(count == 1) {
			arr = null;
		}else if(count > 1) {
			Tv[] temp = arr;
			arr = new Tv[count-1];
			int j = 0;
			for(int i = 0; i<count; i++) {
				if(i != index) {
					arr[j] = temp[i];
					j += 1;
				}
			}
		}
		count -= 1;
	}
	
	Tv get(int index) {
		return arr[index];
	}	
	
}


public class Ex05_ArrayList�ǽ�2 {
	public static void main(String[] args) {
		
		ArrayList<Tv> list = new ArrayList<>();
		
		Tv temp = new Tv("TV", "�Ｚ", 1000);
		list.add(temp);
		
		temp = new Tv("�ñ״�óTV", "����", 2000);
		list.add(temp);
		
		temp = new Tv("����ƮTV", "����", 3000);
		list.add(temp);
		
		temp = list.get(1);
		System.out.println(temp.name);	// �ñ״�óTV
		
		System.out.println(list);
		// [step7.Tv@15db9742, step7.Tv@6d06d69c, step7.Tv@7852e922]
		// �ּҰ� ������.. ���׸� �ȿ� <Integer> �������� list ����ص� ���� ���Դµ�..
		
		list.clear();
		System.out.println(list);		// []
		
		// ------------------------------------------
		
		MyList myList = new MyList();
		temp = new Tv("TV", "�Ｚ", 1000);
		myList.add(temp);
		
		temp = new Tv("�ñ״�óTV", "����", 2000);
		myList.add(temp);
		
		temp = new Tv("����ƮTV", "����", 3000);
		myList.add(temp);

		temp = myList.get(1);
		System.out.println(temp.name);	// �ñ״�óTV
		
	}
}
