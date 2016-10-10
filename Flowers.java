public class Flowers implements Comparable<Flowers> {
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
    public int compareTo(Flowers a){
        return (this.freshness - a.freshness);
    }
    public String toString(){
        return this.name + " - " + this.freshness;
    }

}