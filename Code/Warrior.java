package LogLike;

public class Warrior extends Character {
	public Warrior(int level) {
        super(level);
    }

    @Override
     public void calculateStats() {
        this.hp = 100 + level * 30;         // HP는 레벨에 따라 크게 증가
        this.mp = 50 + level * 10;  // MP는 적게 증가
        this.str = level * 3;       // STR은 레벨당 3씩 증가
        this.dex = level * 2;       // DEX는 레벨당 2씩 증가
        this.intelligence = level * 1; // INT는 레벨당 1씩 증가
        this.att = level * 4;
    }

}
