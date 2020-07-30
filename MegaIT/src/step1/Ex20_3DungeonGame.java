package step1;

import java.util.Scanner;

/* [던전게임]
 * 장소 : 마을 , 상점 , 던전
 * 마을 : 휴식 가능
 * 상점 : 무기 강화 가능
 * 던전 : 몬스터 잡기 가능 (사망하면 게임이 종료되고 데이터 사라짐)
 * 기본 HP = 100, 공격력 = 5
 * 닉네임 설정 가능
 */
public class Ex20_3DungeonGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int HP = 100;
        int 공격력 = 5;
        System.out.println("[던전 게임]에 오신것을 환영합니다.");
        System.out.println("게임 내에서 사용할 닉네임을 입력하세요. (숫자만 가능합니다)");
        int name = scan.nextInt();

        System.out.println(name + "님 환영합니다.");
        System.out.println("==게임 설명==");
        System.out.println("[던전게임] 내에서는 마을, 상점, 던전이 있습니다.");
        System.out.println("{마을}에서는 체력을 회복할 수 있습니다.");
        System.out.println("{상점}에서는 무기를 강화하실 수 있습니다.");
        System.out.println("{던전}에서는 몬스터를 잡아서 돈을 벌 수 있습니다.");
        System.out.println("[주의] 만약 {던전}에서 사망하면 게임이 종료되고 데이터가 사라집니다.");
        System.out.println(" ");
        System.out.println("게임 시작");
     
        
        
        

	}

}
