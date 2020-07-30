package kr.koreait.memo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoVO {
	public static int count;
	private int no;				// �۹�ȣ, �ڵ��Է�
	private String name;		// �̸�
	private String password;	// ��й�ȣ	
	private String memo;		// �޸�
	private Date writeDate;		// �ۼ���, �ڵ��Է�
	
	public MemoVO() {	}
	public MemoVO(String name, String password, String memo) {
		no = ++count;
		this.name = name;
		this.password = password;
		this.memo = memo;
		writeDate = new Date();
		
	}
	
	public MemoVO(int no, String name, String password, String memo, String writeDate) {
		this.no = no;
		this.name = name;
		this.password = password;
		this.memo = memo.replace("-", " ");
		
		int year = Integer.parseInt(writeDate.substring(0, 4)) - 1900;
		int month = Integer.parseInt(writeDate.substring(5, 7)) - 1;
		int day = Integer.parseInt(writeDate.substring(8, 10));
		int hour = Integer.parseInt(writeDate.substring(11, 13));
		int minute = Integer.parseInt(writeDate.substring(14, 16));
		int second = Integer.parseInt(writeDate.substring(17));
		
		this.writeDate = new Date(year, month, day, hour, minute, second);
		
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	@Override
	public String toString() {
		Date date = new Date();		// ���� ��¥
//		���� ��¥�� ��, ��, �̷� �ۼ��ϰ� �ۼ����� ��, ��, ���� ������ ���Ѵ�.
		SimpleDateFormat sdf = null;
		if(date.getYear() == writeDate.getYear() && date.getMonth() == writeDate.getMonth() && date.getDate() == writeDate.getDate()) {
			sdf = new SimpleDateFormat("HH:mm:ss");
			
		}else {
			sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		}
		
		return no + ". " + name + " ����(" + password + ") " + sdf.format(writeDate) + "�� ���主 " + memo;
	}	
	
}

