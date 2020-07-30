package kr.koreait.student;

public class StudentSelect {

	private StudentDAO studentDAO;
	
	public StudentSelect(StudentDAO stDAO) {
		studentDAO = stDAO;
	}
	
	public Student select(String id) {
		if(checkId(id)) {					// (�ߺ�O) true
			return studentDAO.select(id);	// id (key)�� �Ҵ�� Student Ŭ���� (value)�� ������
		}else {								// (�ߺ�X) false
			System.out.println("������ �����ϴ�.");
		}
		return null;
	}
	
	public boolean checkId(String id) {
		Student student = studentDAO.select(id);
		return student != null ? true : false;	// ������ student �� ��������� (�ߺ�X) false, ������ ������ (�ߺ�O) true
	}
}
