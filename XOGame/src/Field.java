public class Field {
    private static final int SWITCHER_SHOOTS = 9;
    private static final int MAX_LENGHT = 3;
    int switchPlayer = SWITCHER_SHOOTS;
    int[][] field = new int[MAX_LENGHT][MAX_LENGHT];
    Shoot shoot = new Shoot();
    Player player1 = new Player();
    Player player2 = new Player();

    private void showField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    public void motionPlayer() {
        if (switchPlayer % 2 == 1) {
            System.out.println("Игрок " + player1.getName() + " ходит.");
        } else
            System.out.println("Игрок " + player2.getName() + " ходит.");
    }

    public void fieldShoot() {
        shoot.getShoot();
        switch (field[shoot.x][shoot.y]) {
            case 0:
                if (switchPlayer % 2 == 1) {
                    field[shoot.x][shoot.y] = 1;
                } else {
                    field[shoot.x][shoot.y] = 2;
                }
                switchPlayer--;
                break;
            case 1:
                System.out.println(player1.getName() + " уже занял это место.");
                break;
            case 2:
                System.out.println(player2.getName() + " уже занял это место.");
                break;
            default:
                System.out.println("ERROR");
        }
        showField();
    }

    public void gameOver() {
        int i = 1;
        for (int j = 0; j < field.length; j++) {
            if (field[i - 1][j] == field[i][j] && field[i][j] == field[i + 1][j] && field[i][j] != 0) {
                System.out.println("Выиграл игрок " + field[i][j]);
                System.exit(0);
            } else if (field[j][i - 1] == field[j][i] && field[j][i] == field[j][i + 1] && field[j][i] != 0) {
                System.out.println("Выиграл игрок " + field[j][i]);
                System.exit(0);
            }
        }
        if (field[i - 1][i - 1] == field[i][i] && field[i][i] == field[i + 1][i + 1] && field[i][i] != 0) {
            System.out.println("Выиграл игрок " + field[i][i]);
            System.exit(0);
        }
        if (field[i - 1][i + 1] == field[i][i] && field[i + 1][i - 1] == field[i][i] && field[i][i] != 0) {
            System.out.println("Выиграл игрок " + field[i][i]);
            System.exit(0);
        }
    }
}
