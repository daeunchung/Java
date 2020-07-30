package kr.koreait.student;

public class StudentInsert {
	
	private StudentDAO studentDAO;

	// �Է¹��� StudentDAO �� ���� Ŭ���� ���� studentDAO �� �־��ִ� ������
	public StudentInsert(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}
	
	// �Է¹��� Student Ŭ������ id�� insert ���ִ� �޼���
	public void insert(Student student) {
		String id = student.getId();
		if(checkId(id)) {	// checkId �� ��� boolean true�̸� �ߺ�X�̴� �־��൵��
			studentDAO.insert(student);
		}else {				// checkId �� ��� boolean false�̸� �ߺ�O�̴� �־��ָ� �ȉ�
			System.out.println("�ߺ����̵� �Դϴ�.");
		}
	}
	
	// �ߺ����̵� üũ�ϴ� �޼���
	public boolean checkId(String id) {
		Student student = studentDAO.select(id);	// Map studentDAO ���� String id(key)�� �ش��ϴ� Student Ŭ����(value) �������� select �޼���
		return student == null ? true : false;		// ������ student �� ��������� (�ߺ�X) true, ������ ������ (�ߺ�O) false
	}
}
