package LogLike;

public class CharacterMovement {
    private int x;
    private int y;
    private int maxX;
    private int maxY;
    private String[][] map;

    public CharacterMovement(int startX, int startY, int maxX, int maxY, String[][] map) {
        this.x = startX;
        this.y = startY;
        this.maxX = maxX;
        this.maxY = maxY;
        this.map = map;
        map[y][x] = "C"; // 초기 위치에 캐릭터 배치
    }

    // 캐릭터 이동 메서드
    public void move(String direction) {
        map[y][x] = "."; // 이전 위치를 지움
        switch (direction.toLowerCase()) {
            case "up":
                if (y > 0) y--;
                break;
            case "down":
                if (y < maxY - 1) y++;
                break;
            case "left":
                if (x > 0) x--;
                break;
            case "right":
                if (x < maxX - 1) x++;
                break;
            default:
                System.out.println("잘못된 방향입니다. 사용 가능한 방향: up, down, left, right");
                break;
        }
        map[y][x] = "C"; // 새로운 위치에 캐릭터 배치
        displayMap();
    }

    // 맵 출력 메서드
    public void displayMap() {
        for (int i = 0; i < maxY; i++) {
            for (int j = 0; j < maxX; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}