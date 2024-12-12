package LogLike;

public interface Game {
	// 메서드 시그니처 선언    
	void startGame();   
	void selectCharacter(String characterType);    
	void displayMap();    
	void battleMonster();    
	void collectItem();
	void selectCharacter(Character character);
}
