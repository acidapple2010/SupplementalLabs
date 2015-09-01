import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выстрелите в поле 3 на 3.");

        System.out.println("Введите имя первого игрока.");
        field.player1.setName(scanner.nextLine());

        System.out.println("Введите имя второго игрока.");
        field.player2.setName(scanner.nextLine());

        while (field.switchPlayer != 0) {
            field.motionPlayer();
            field.fieldShoot();
            field.gameOver();
        }

        System.out.println("Ничья.");
    }
}
