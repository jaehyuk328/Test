package LogLike;

public class Monster extends Character {
    public int hp;
    public int att;
    public int def;
    public int ex;

    public Monster(int level) {
        super(level);
        calculateStats();
    }

    @Override
    public void calculateStats() {
        this.hp = 100 + level * 20;  // HP는 레벨에 따라 증가
        this.att = 10 + level * 5;   // 공격력 증가
        this.def = 5 + level * 3;    // 방어력 증가
        this.ex = 50 + level * 10;   // 경험치 증가
    }

    // 몬스터 정보 출력 메서드
    public void displayStats() {
        System.out.println("Monster Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("ATT: " + att);
        System.out.println("DEF: " + def);
        System.out.println("EX: " + ex);
    }
}
