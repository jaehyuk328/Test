package LogLike;

//Character와 Monster가 싸우는 클래스
class Battle {
	 public static void fight(Character character, Monster monster) {
	     System.out.println("전투 시작!");
		 character.displayStats();
		 monster.displayStats();
		
		 while (character.hp > 0 && monster.hp > 0) {
		     // 캐릭터가 몬스터 공격
		     int damageToMonster = Math.max(character.str - monster.def, 0);
		     monster.hp -= damageToMonster;
		     System.out.println("캐릭터가 몬스터를 공격하여 " + damageToMonster + "의 피해를 입혔습니다. (몬스터 HP: " + monster.hp + ")");
		
		     if (monster.hp <= 0) {
		         System.out.println("몬스터가 쓰러졌습니다!");
		         break;
		     }
		
		     // 몬스터가 캐릭터 공격
		     int damageToCharacter = Math.max(monster.att - character.dex, 0);
		     character.hp -= damageToCharacter;
		     System.out.println("몬스터가 캐릭터를 공격하여 " + damageToCharacter + "의 피해를 입혔습니다. (캐릭터 HP: " + character.hp + ")");
		
		     if (character.hp <= 0) {
	         System.out.println("캐릭터가 쓰러졌습니다!");
	             break;
	         }
	     }
	 }
}
