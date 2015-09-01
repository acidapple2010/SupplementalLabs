public class Player {
    String name;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Привет " + name);
        this.name = name;
    }
}
