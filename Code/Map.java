package LogLike;

import java.util.Random;

public class Map {

	public int width = 7;
    public int height = 7;
    public String[][] grid;

    public Map() {
        this.grid = new String[width][height];
        initializeMap();
        generatePath();
        placeCharacterAtStart();
        placeMonstersAndItems();
    }

 // 맵 초기화 메서드
    private void initializeMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = ".";
            }
        }
    }

 // 길 생성 메서드
    private void generatePath() {
        Random random = new Random();
        int currentX = 0;
        int currentY = random.nextInt(height);
        grid[currentY][currentX] = "P"; // P는 길을 의미

        while (currentX < width - 1) {
            if (random.nextBoolean()) {
                // Move right
                currentX++;
            } else {
                // Move up or down
                if (currentY > 0 && currentY < height - 1) {
                    currentY += random.nextBoolean() ? 1 : -1;
                } else if (currentY == 0) {
                    currentY++;
                } else if (currentY == height - 1) {
                    currentY--;
                }
            }
            grid[currentY][currentX] = "P";
        }

        // 종료 지점 설정
        grid[currentY][currentX] = "F"; // F는 종료 지점을 의미
    }

    // 캐릭터 시작 위치 설정 메서드
    private void placeCharacterAtStart() {
        for (int j = 0; j < height; j++) {
            if (grid[j][0].equals("P")) {
                grid[j][0] = "C"; // C는 캐릭터를 의미
                break;
            }
        }
    }

    // 몬스터와 아이템 배치 메서드
    private void placeMonstersAndItems() {
        Random random = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j].equals("P") && random.nextInt(10) < 3) {
                    if (random.nextBoolean()) {
                        grid[i][j] = "M"; // M은 몬스터를 의미
                    } else {
                        grid[i][j] = "I"; // I는 아이템을 의미
                    }
                }
            }
        }
    }

    // 맵 출력 메서드
    public void displayMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//	public int width;
//	public int height;
//	public String[][] grid;
//
//    public Map(int width, int height) {
//        this.width = width;
//        this.height = height;
//        this.grid = new String[width][height];
//        initializeMap();
//    }
//
//    // 맵 초기화 메서드
//    private void initializeMap() {
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                grid[i][j] = ".";
//            }
//        }
//    }
//
//    // 맵 출력 메서드
//    public void displayMap() {
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                System.out.print(grid[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
