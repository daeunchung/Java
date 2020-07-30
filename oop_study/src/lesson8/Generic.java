// momk 블로그에 [기본이론7] 게시글이 애초에 존재 X
// 따라서 lesson7 패키지 생성하지 않고 lesson8 패키지 생성했음
package lesson8;
/*
 * Generic은 왜 사용할까?
 * User 클래스배열은 User 만 받을수 있고
 * Person 클래스 배열은 Person 만 받을수있네
 * 
 * 그런데 <> 안에 관용적으로 T를 써서 뭐든지 다 받고 그 다음에 안에서 바꿔주는 방법으로 간편하게 쓰려고 ~ 다받아 일단 그 다음에 안에서 바꿔줘
 * 다 받기 위해서는 최상위 클래스인 Object 클래스 배열을 가지고 있어야한다.
 */
class MyVector<T>{
	private Object arr[] = null;
	private int count = 0;
	
	void add(T data) {
		if(count == 0) {
			arr = new Object[1];
		}else {
			Object[] temp = arr;
			arr = new Object[count+1];
			for(int i = 0; i<count; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		
		arr[count] = data;
		count += 1;
	}
	
	int size() {
		return count;
	}
	
	T get(int index) {
		return (T)arr[index];	// 형변환
	}
	
}

class User{
	String name;
	void print_name() {
		System.out.println(name);
	}
}

public class Generic {
	public static void main(String[] args) {
		MyVector<User> vec = new MyVector<>();
		User temp = new User();
		temp.name = "철수";
		vec.add(temp);
		temp = new User();
		temp.name = "민수";
		vec.add(temp);
		for(int i = 0; i<vec.size(); i++) {
			vec.get(i).print_name();
		}
	}
}
