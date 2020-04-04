public abstract class Tire {
    private int hp = 20;
    private int price = 120000;
    private String name = "Bridgestone";

    public Tire(int hp, int price, String name) {
        this.hp = hp;
        this.price = price;
        this.name = name;
    }

    public void minusHp() {
        this.hp -= 20;
    }

    public int getHp() {
        return this.hp;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

}