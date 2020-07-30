package kr.koreait.student;

public class StudentSelect {

	private StudentDAO studentDAO;
	
	public StudentSelect(StudentDAO stDAO) {
		studentDAO = stDAO;
	}
	
	public Student select(String id) {
		if(checkId(id)) {					// (중복O) true
			return studentDAO.select(id);	// id (key)에 할당된 Student 클래스 (value)를 얻어오기
		}else {								// (중복X) false
			System.out.println("정보가 없습니다.");
		}
		return null;
	}
	
	public boolean checkId(String id) {
		Student student = studentDAO.select(id);
		return student != null ? true : false;	// 가져온 student 가 비어있으면 (중복X) false, 내용이 있으면 (중복O) true
	}
}
