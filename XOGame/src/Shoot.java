import java.util.Scanner;

public class Shoot {
    int x;
    int y;

    public void setShoot(int ishoot, int jshoot) {
        this.x = ishoot;
        this.y = jshoot;
    }

    public boolean getShoot() {
        x = shoot();
        y = shoot();
        if ((x == 0 || x == 1 || x == 2) && (y == 0 || y == 1 || y == 2)) {
            setShoot(x, y);
            return true;
        }
        System.out.println("Ошибка в вводе.");
        return getShoot();
    }

    public int shoot() {
        Scanner scanner = new Scanner(System.in);
        int shoot;
        do {
            if (scanner.hasNextInt()) {
                shoot = scanner.nextInt();
                break;
            } else {
                System.out.println("Введите все же число!");
                scanner.nextLine();
            }
        } while (true);
        return shoot;
    }

}
