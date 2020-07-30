package kr.koreait.student;

public class StudentInsert {
	
	private StudentDAO studentDAO;

	// 입력받은 StudentDAO 를 현재 클래스 안의 studentDAO 에 넣어주는 생성자
	public StudentInsert(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}
	
	// 입력받은 Student 클래스의 id를 insert 해주는 메서드
	public void insert(Student student) {
		String id = student.getId();
		if(checkId(id)) {	// checkId 한 결과 boolean true이면 중복X이니 넣어줘도됌
			studentDAO.insert(student);
		}else {				// checkId 한 결과 boolean false이면 중복O이니 넣어주면 안됌
			System.out.println("중복아이디 입니다.");
		}
	}
	
	// 중복아이디 체크하는 메서드
	public boolean checkId(String id) {
		Student student = studentDAO.select(id);	// Map studentDAO 에서 String id(key)에 해당하는 Student 클래스(value) 가져오는 select 메서드
		return student == null ? true : false;		// 가져온 student 가 비어있으면 (중복X) true, 내용이 있으면 (중복O) false
	}
}
