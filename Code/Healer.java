package LogLike;

public class Healer extends Character {
    public Healer(int level) {
        super(level);
    }

    @Override
    public void calculateStats() {
        this.hp = 90 + level * 25;   // HP와 MP가 균형 있게 증가
        this.mp = 90 + level * 25;
        this.str = level * 1;         // STR은 레벨당 1씩 증가
        this.dex = level * 3;         // DEX는 레벨당 3씩 증가
        this.intelligence = level * 2; // INT는 레벨당 2씩 증가
        this.att = level * 2;
    }

}
