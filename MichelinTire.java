public class MichelinTire extends Tire {
    private int hp = 40;
    private int price = 30000;
    private String name = "Michelin";

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