public class Roses extends Flowers {
    boolean thornity;
    Roses(int price, int freshness, double stemSize, boolean thornity, String name) {
        super(price, freshness, stemSize, name);
    }
    public void setThornity(boolean thorn){
        thornity = thorn;
    }
}
