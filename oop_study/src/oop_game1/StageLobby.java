package oop_game1;

public class StageLobby extends Stage {

	@Override
	public boolean update() {
		System.out.println("=====[LOBBY]=====");
		System.out.println("[1.����] [2.����]");
		int sel = GameManager.scan.nextInt();
		if(start.equals("����"))
			GameManager.nextStage = "LOBBY";
		return false;
	}

	@Override
	public void init() {

	}

}
