public class Tire {
    private int hp;
    private int price;

    public void Trie(int hp, int price) {
        this.hp = hp;
        this.price = price;
    }
    
    public void minusHp() {
        
        this.hp-=20;
        System.out.println(this.hp);
    }
}