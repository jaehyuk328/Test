package LogLike;

public abstract class Character {
	public int level;
	public int att;
    public int hp;
    public int mp;
    public int str;
    public int dex;
    public int intelligence;

    public Character(int level) {
        this.level = level;
        calculateStats();
    }
    // 각 자식 클래스에서 스탯 계산 방식을 정의할 추상 메서드
    public abstract void calculateStats();

    // 캐릭터 정보 출력 메서드
    public void displayStats() {
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("MP: " + mp);
        System.out.println("STR: " + str);
        System.out.println("DEX: " + dex);
        System.out.println("INT: " + intelligence);
        System.out.println("Att: " + att);
    }
}
