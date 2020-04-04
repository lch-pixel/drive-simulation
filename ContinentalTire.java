public class ContinentalTire extends Tire {
    private int hp = 60;
    private int price = 50000;
    private String name = "Continental";

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