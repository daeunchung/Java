package oop_game1;

public class StageLobby extends Stage {

	@Override
	public boolean update() {
		System.out.println("=====[LOBBY]=====");
		System.out.println("[1.전투] [2.종료]");
		int sel = GameManager.scan.nextInt();
		if(start.equals("시작"))
			GameManager.nextStage = "LOBBY";
		return false;
	}

	@Override
	public void init() {

	}

}
