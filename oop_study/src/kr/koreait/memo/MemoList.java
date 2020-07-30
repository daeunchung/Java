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
//		�������� �Էµ� ��(�ֽű�) ���� ����ϱ� ���� ArrayList�� ����� ������ �ۺ��� ����Ѵ�.
		
		String str = "";
		for(int i = memoList.size() - 1; i>= 0; i--) {
			str += memoList.get(i) + "\n";
		}
		return str;
	}
	
//	MemoProject Ŭ�������� ArrayList�� ������ ������ ���� ��ü�� �Ѱܹ޾� ArrayList�� �����ϴ� �޼���
	public void addMemo(MemoVO vo) {
		memoList.add(vo);
//		�� ���� �� �� ��ȣ�� �ٽ� �ο��ϴ� ���ҵ带 �����Ѵ�.
		reNumber();
	}
	
//	�� ��ȣ�� �ٽ� �ο��ϴ� �޼ҵ�
	private void reNumber() {
		for(int i = 0; i<memoList.size(); i++) {
			memoList.get(i).setNo(i+1);
		}
	}
	
//	ArrayList�� ����� ������ ����ϴ� �޼ҵ�
	public void viewMemo() {
		if(memoList.size() != 0) {
			for(int i = memoList.size()-1; i >= 0; i--) {
				System.out.println(memoList.get(i));
			}
		}else {
			System.out.println("����� �޸� �����ϴ�.");
		}
	}
	
//	MemoProject Ŭ�������� ������ �� ��ȣ�� �Ѱܹް�  ArrayList  �� ����� ���� �Ǵ� ������ �� �Ѱ��� �����ϴ� �޼���
	public MemoVO selectMemo(int no) {
		try {
			return memoList.get(no-1);
		}catch(Exception e) {
			return null;
		}
	}
	
//	MemoProject Ŭ�������� ������ �� ��ȣ�� �Ѱܹް�   ArrayList�� ����� �� �� ���� �����ϴ� �޼ҵ�
	public void deleteMemo(int no) {
		memoList.remove(no -1);
//		 �� ���� �� �� ��ȣ�� �ٽ� �ο��ϴ� �޼ҵ带 �����Ѵ�.
		 reNumber();
	}
	 
//	MemoProject Ŭ�������� ������ �� ��ȣ�� �Ѱܹް�  ArrayList �� ����� �� �� ���� �����ϴ� �޼ҵ�
	public void updateMemo(int no, String memo) {
		memoList.get(no - 1).setMemo(memo);
	}
	
//	MemoProject Ŭ�������� �ؽ�Ʈ ������ �̸��� �Ѱܹް� ArrayList �� ����� �� ��ü�� �ؽ�Ʈ ���Ͽ� �����ϴ� �޼���
	public void fileWriteMemo(String fileName) {
		PrintWriter pw = null;
		try {
			String path = String.format("./src/memo/%s.txt", fileName);
//			System.out.println(path);
			pw = new PrintWriter(path);
			
//			ArrayList �� ����� ���� ���� ��ŭ �ݺ��ϸ�  ArrayList �� ������ �ؽ�Ʈ ���Ϸ� ����Ѵ�.
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
			
			// �����  for ��
			for(MemoVO vo : memoList) {
				/*
				 * String str = "";
				 * str += vo.getNo() + " ";
				 * str += vo.getName() + " ";
				 * str += vo.getPassword() + " ";
				 * replace(a,b) : ���ڿ��� ��� a�� b�� ġȯ�Ѵ�.
				 * str += vo.getMemo().repalce(" ", "-") + " ";
				 * str += sdf.format(vo.getWriteDate());
				 */
				String str = String.format("%s %s %s %s %s", vo.getNo(), vo.getName(), vo.getPassword(), vo.getMemo().replace(" ", "-"), sdf.format(vo.getWriteDate()));
				
				pw.write(str + "\r\n");
			} 
		}catch (Exception e) {
			
			System.out.println("������ �����ϴ�.");
		} finally {
			if(pw != null) { pw.close();}
		}
		
//		MemoProject Ŭ�������� �ؽ�Ʈ ������ �̸��� �Ѱܹް� �ؽ�Ʈ ������ ������  ArrayList �� �����ϴ� �޼ҵ�
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
