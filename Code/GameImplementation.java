package LogLike;

public class GameImplementation implements Game {
    private Character character;
    private Monster monster;

    @Override
    public void startGame() {
        System.out.println("게임을 시작합니다!");
    }

    @Override
    public void selectCharacter(Character character) {
        this.character = character;
        character = new Warrior(10); // 기본적으로 전사를 선택 (레벨 5)
        System.out.println(character.getClass().getSimpleName() + " 캐릭터를 선택했습니다.");
    }

    @Override
    public void selectCharacter(String characterType) {
        System.out.println(characterType + " 캐릭터를 선택했습니다.");
    }

    @Override
    public void displayMap() {
        System.out.println("맵을 표시합니다.");
    }

    @Override
    public void battleMonster() {
    	monster = new Monster(3);
        System.out.println("몬스터와 전투를 시작합니다.");
        if (character != null && monster != null) {
            Battle.fight(character, monster);
        } else {
            System.out.println("캐릭터 또는 몬스터가 설정되지 않았습니다.");
        }
    }

    @Override
    public void collectItem() {
        System.out.println("아이템을 획득합니다.");
    }

}
