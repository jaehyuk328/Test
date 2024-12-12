package LogLike;

public class main {
	public static void main(String[] args) {
		
		GameImplementation game = new GameImplementation();

        System.out.println("게임을 초기화합니다...");

        Character warrior = new Warrior(5);
        Character mage = new Mage(5);
        Character healer = new Healer(5);

        // 캐릭터 선택
//        game.selectCharacter(warrior);
//        warrior.displayStats();

        // 게임 시작
        game.startGame();
        
        // 캐릭터 선택
        game.selectCharacter(warrior);
        // 맵 표시
        Map gameMap = new Map();
		gameMap.displayMap();

        // 몬스터와 전투
        game.battleMonster();

        // 아이템 획득
        game.collectItem();
    }
}	
//        // 캐릭터 맵 생성 및 캐릭터 위치 설정
//        CharacterMap characterMap = new CharacterMap(7, 7);
//        characterMap.setCharacterPosition(1, 1);
//        
//        // 몬스터 맵 생성 및 몬스터 위치 설정
//        MonsterMap monsterMap = new MonsterMap(7, 7);
//        monsterMap.setMonsterPosition(3, 3);
//        
//        // 아이템 맵 생성 및 아이템 위치 설정
//        ItemMap itemMap = new ItemMap(7, 7);
//        itemMap.setItemPosition(5, 5);
//
//        // 각 맵 출력
//        System.out.println("Character Map:");
//        characterMap.displayMap();
//        
//        System.out.println("\nMonster Map:");
//        monsterMap.displayMap();
//        
//        System.out.println("\nItem Map:");
//        itemMap.displayMap();
//    }
//}
