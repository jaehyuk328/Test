package LogLike;

public class Mage extends Character {
	public Mage(int level) {
        super(level);
    }

    @Override
    public void calculateStats() {
        this.hp = 80 + level * 20;   // HP는 적게 증가
        this.mp = 120 + level * 40;  // MP는 크게 증가
        this.str = level * 1;        // STR은 레벨당 1씩 증가
        this.dex = level * 2;        // DEX는 레벨당 2씩 증가
        this.intelligence = level * 3; // INT는 레벨당 3씩 증가
        this.att = level * 3;
    }
}
