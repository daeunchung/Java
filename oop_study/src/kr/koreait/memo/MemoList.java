package kr.koreait.memo;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MemoList {

	private ArrayList<MemoVO> memoList = new ArrayList<>();
	
	public ArrayList<MemoVO> getMemoList() {
		return memoList;
	}

	public void setMemoList(ArrayList<MemoVO> memoList) {
		this.memoList = memoList;
	}

	@Override
	public String toString() {
//		마지막에 입력된 글(최신글) 부터 출력하기 위해 ArrayList에 저장된 마지막 글부터 출력한다.
		
		String str = "";
		for(int i = memoList.size() - 1; i>= 0; i--) {
			str += memoList.get(i) + "\n";
		}
		return str;
	}
	
//	MemoProject 클래스에서 ArrayList에 저장할 내용이 기억된 객체를 넘겨받아 ArrayList에 저장하는 메서드
	public void addMemo(MemoVO vo) {
		memoList.add(vo);
//		글 저장 후 글 번호를 다시 부여하는 베소드를 실행한다.
		reNumber();
	}
	
//	글 번호를 다시 부여하는 메소드
	private void reNumber() {
		for(int i = 0; i<memoList.size(); i++) {
			memoList.get(i).setNo(i+1);
		}
	}
	
//	ArrayList에 저장된 내용을 출력하는 메소드
	public void viewMemo() {
		if(memoList.size() != 0) {
			for(int i = memoList.size()-1; i >= 0; i--) {
				System.out.println(memoList.get(i));
			}
		}else {
			System.out.println("저장된 메모가 없습니다.");
		}
	}
	
//	MemoProject 클래스에서 삭제할 글 번호를 넘겨받고  ArrayList  에 저장된 삭제 또는 수정할 글 한건을 리턴하는 메서드
	public MemoVO selectMemo(int no) {
		try {
			return memoList.get(no-1);
		}catch(Exception e) {
			return null;
		}
	}
	
//	MemoProject 클래스에서 삭제할 글 번호를 넘겨받고   ArrayList에 저장된 글 한 건을 삭제하는 메소드
	public void deleteMemo(int no) {
		memoList.remove(no -1);
//		 글 삭제 후 글 번호를 다시 부여하는 메소드를 실항한다.
		 reNumber();
	}
	 
//	MemoProject 클래스에서 수정할 글 번호를 넘겨받고  ArrayList 에 저장된 글 한 건을 수정하는 메소드
	public void updateMemo(int no, String memo) {
		memoList.get(no - 1).setMemo(memo);
	}
	
//	MemoProject 클래스에서 텍스트 파일의 이름을 넘겨받고 ArrayList 에 저장된 글 전체를 텍스트 파일에 저장하는 메서드
	public void fileWriteMemo(String fileName) {
		PrintWriter pw = null;
		try {
			String path = String.format("./src/memo/%s.txt", fileName);
//			System.out.println(path);
			pw = new PrintWriter(path);
			
//			ArrayList 에 저장된 글의 개수 만큼 반복하며  ArrayList 의 내용을 텍스트 파일로 출력한다.
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
			
			// 고급형  for 문
			for(MemoVO vo : memoList) {
				/*
				 * String str = "";
				 * str += vo.getNo() + " ";
				 * str += vo.getName() + " ";
				 * str += vo.getPassword() + " ";
				 * replace(a,b) : 문자열의 모든 a를 b로 치환한다.
				 * str += vo.getMemo().repalce(" ", "-") + " ";
				 * str += sdf.format(vo.getWriteDate());
				 */
				String str = String.format("%s %s %s %s %s", vo.getNo(), vo.getName(), vo.getPassword(), vo.getMemo().replace(" ", "-"), sdf.format(vo.getWriteDate()));
				
				pw.write(str + "\r\n");
			} 
		}catch (Exception e) {
			
			System.out.println("파일이 없습니다.");
		} finally {
			if(pw != null) { pw.close();}
		}
		
//		MemoProject 클래스에서 텍스트 파일의 이름을 넘겨받고 텍스트 파일의 내용을  ArrayList 에 저장하는 메소드
		public void fileReadMemo(String fileName) {
			Scanner sc = null;
			try {
				String path = "./src/memo/" + fileName + ".txt";
				sc = new Scanner(new File(path));
				
				while(sc.has)
			} catch (Exception e) {
				// TODO: handle exception
			} 
			
	
		
		
		
		
		
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
