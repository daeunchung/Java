package kr.koreait.score;

public class ScoreVO implements Comparable<ScoreVO>{

	public static int count;	// 객체가 생성될 때 마다 자동응로 1씨 증가시킬 변수
	private int no;				// 번호, 자동증가
	private String name;		// 이름
	private int java;			// java 점수
	private int jsp;			// jsp 점수
	private int spring;			// spring 점수
	private int total;			// 총점
	private double average;		// 평균
	private int rank = 1;		// 석차, 석차를 계산한 기억 장소의 초기치는 무조건 1로 한다.
	
	public ScoreVO() {}
	public ScoreVO(String name, int java, int jsp, int spring) {
		no = ++count;
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		total = java + jsp + spring;
		average = (double) total / 3;
		
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
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	} 
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %3d %3d %3d %3d %6.2f %d", no, name, java, jsp, spring, total, average, rank);
	}
	
//	ArrayList.sort 방법2. model class의 Comparable 구현(Implements)
	@Override
	public int compareTo(ScoreVO arg0) {
		// TODO Auto-generated method stub
        int targettotal = arg0.getTotal();
        if(total == targettotal) return 0;
        else if(total < targettotal) return 1;
        else return -1;
	}
	
	// %3d : 최소 3자리 이상의 정수
	// 제어 문자열 "%6.2f"에서는 인수의 값을 소수점 이하 2째 자리까지 출력하도록 지정하였으므로, 소수점 이하 3째 자리에서 반올림된 값이 출력된다. 

}
