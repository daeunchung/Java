package oop_game1;

import java.util.Random;
import java.util.Vector;

public class UnitManager {

	Vector<Player> player_list = new Vector<>();
	Vector<Unit> mon_list = new Vector<>();
	String path = "oop_game1";	// 패키지명
	String mons[] = {"UnitWolf", "UnitBat", "UnitOrc"};
	Random ran = new Random();
	
	// 초기값을 넣어주는 생성자
	UnitManager() {
		player_list.add(new Player("전사",1000,45));
		player_list.add(new Player("마법사",800,60));
		player_list.add(new Player("힐러",500,70));
	}
	
	void monster_rand_set(int size) {
		for(int i = 0; i<size; i++) {
			int num = ran.nextInt(mons.length);
			
			try {
				Class<?> clazz = 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
