public class Flowers {
    int price;
    int freshness; //from 1 to 5.
    double stemSize;
    String name;


    public Flowers(int price, int freshness, double stemSize, String name) {
        this.price = price;
        this.freshness = freshness;
        this.stemSize = stemSize;
        this.name = name;
    }
}