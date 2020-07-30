package step7_test;

import java.util.ArrayList;

class Member{
	private int custno;				// ȸ����ȣ
	private String custname;		// ȸ������
	private String phone;			// ȸ����ȭ
	private String address;			// ��Ż�
	private String joindate;		// ��������
	private String grade;			// �������
	private String city;			// ���ֵ���
	public Member() {}
	public Member(int custno, String custname, String phone, String address, String joindate, String grade, String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}
	public int getCustno() {
		return custno;
	}
	public String getCustname() {
		return custname;
	}
}
class Money{
	 int custno;				// ȸ����ȣ
	 int saleno; 			// �ǸŹ�ȣ
	 int pcost;				// �ܰ�
	 int amount;				// ����
	 int price;				// ����(����)
	 String pcode;			// ��ǰ�ڵ�
	 String sdate;			// �Ǹ�����
	 public Money() {}
	public Money(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
		this.custno = custno;
		this.saleno = saleno;
		this.pcost = pcost;
		this.amount = amount;
		this.price = price;
		this.pcode = pcode;
		this.sdate = sdate;
	}
	public int getCustno() {
		return custno;
	}
	public int getPrice() {
		return price;
	}
	
}
class Chart{
	int custno; String custname; int total;
	public Chart(int custno, String custname) {
		this.custname = custname;
		this.custno = custno;
	}	

	public int getTotal() {
		return total;
	}

	public void setTotal(int price) {
		this.total += price;
	}

	public void print() {
		System.out.println(this.custno + "\t" + this.custname + "\t" + this.total);
	}
}


class Manager{
	ArrayList<Member> memberList = new ArrayList<Member>();
	ArrayList<Money> moneyList = new ArrayList<Money>(); 	
	ArrayList<Chart> chartList = new ArrayList<Chart>();
	void init() {
		memberList.add(new Member(100001, "���ູ", "010-1111-2222", "SK", "20151202", "A", "01"));
		memberList.add(new Member(100002, "���ູ", "010-1111-3333", "SK", "20151206", "B", "01"));
		memberList.add(new Member(100003, "�����", "010-1111-4444", "SK", "20151001", "B", "30"));
		memberList.add(new Member(100004, "�ֻ��", "010-1111-5555", "SK", "20151113", "A", "30"));
		memberList.add(new Member(100005, "����ȭ", "010-1111-6666", "SK", "20151225", "B", "60"));
		memberList.add(new Member(100006, "������", "010-1111-7777", "SK", "20151211", "C", "60"));
		
		moneyList.add(new Money(100001, 20160001, 500, 5, 2500, "A001", "20160101"));
		moneyList.add(new Money(100001, 20160002, 1000, 4, 4000, "A002", "20160101"));
		moneyList.add(new Money(100001, 20160003, 500, 3, 1500, "A008", "20160101"));
		moneyList.add(new Money(100002, 20160004, 2000, 1, 2000, "A004", "20160102"));
		moneyList.add(new Money(100002, 20160005, 500, 1, 500, "A001", "20160103"));
		moneyList.add(new Money(100003, 20160006, 1500, 2, 3000, "A003", "20160103"));
		moneyList.add(new Money(100004, 20160007, 500, 2, 1000, "A001", "20160104"));
		moneyList.add(new Money(100004, 20160008, 300, 1, 300, "A005", "20160104"));
		moneyList.add(new Money(100004, 20160009, 600, 1, 600, "A006", "20160104"));
		moneyList.add(new Money(100004, 20160010, 3000, 1, 3000, "A007", "20160106"));
	}
	
	void MemberToChart(ArrayList<Member> memberList) {
		for(int i = 0; i< memberList.size(); i++) {
			int custno = memberList.get(i).getCustno();
			String custname = memberList.get(i).getCustname();
			chartList.add(new Chart(custno, custname));
		}
	}		
	
	void MoneyToChart(ArrayList<Money> moneyList) {
		for(int i = 0; i<chartList.size(); i++) {
		int custno = chartList.get(i).custno;
			for(int j = 0; j<moneyList.size(); j++) {
				if(custno == moneyList.get(j).custno) {
					int price = moneyList.get(j).price;
					chartList.get(i).setTotal(price);
				}
			}
		}
	}
	void sortChart(ArrayList<Chart> chartList) {
		int max = 0;
		for(int i = 0; i<chartList.size(); i++) {
			for(int j = i; j<chartList.size(); j++) {
				if(chartList.get(i).total < chartList.get(j).total) {
					Chart temp = chartList.get(i);
					chartList.set(i,chartList.get(j));
					chartList.set(j,temp);
				}				
			}
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Manager mg = new Manager();
		mg.init();
		mg.MemberToChart(mg.memberList);
		mg.MoneyToChart(mg.moneyList);
		mg.sortChart(mg.chartList);
		
		for(int i = 0; i<mg.chartList.size(); i++) {
			mg.chartList.get(i).print();;
		}
		/*
		   [����] �� ���� ���� ���  ����(price) �� �հ� + ��������    
		  
			100001	���ູ		8000
			--------------------------------
			100004	�ֻ��		4900
			--------------------------------
			100003	�����		3000
			--------------------------------
			100002	���ູ		2500
			--------------------------------
		 */
		
	}


}