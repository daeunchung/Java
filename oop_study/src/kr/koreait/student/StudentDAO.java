package kr.koreait.student;

import java.util.HashMap;
import java.util.Map;

public class StudentDAO {
	private Map<String, Student> stDB = new HashMap<String, Student>();
	
	public void insert(Student st) {
		this.stDB.put(st.getId(), st);
	}
	
	// stDB Map 에서 String id (key)에 할당된 Student 클래스 (value)를 얻어오는 메서드
	public Student select(String id) {
		return stDB.get(id);
	}
	public Map<String, Student> getStudentDB(){
		return stDB;
	}
	
}
