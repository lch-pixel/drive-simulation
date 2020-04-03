public class BridgestoneTire extends Tire {
    private int hp = 20;
    private int price = 120000;
    private String name = "Bridgestone";

    @Override
    public void minusHp() {
        this.hp -= 20;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

}