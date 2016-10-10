public class Main extends Bouquet {
    public static void main(String[] args) {
        //Flowers rose = new Flowers(10, true, 27.8);
        //Flowers chamomile = new Flowers(6, false, 24.8);
        Bouquet k = new Bouquet();
        Tulps tulp = new Tulps(5, 5, 10.9, "tulp");
        Chamomiles chamomile = new Chamomiles(10, 4, 32.9, "chamomile");
        Roses rose = new Roses(8, 3, 25.9, true, "rose");
        System.out.println("Price of the bouquet: " + k.addFlowers(tulp, chamomile, rose) + " dollars");
        System.out.println("Flowers in range: " + k.flowerInrange(24, 34));
        System.out.print("Flowers, sorted by freshness: ");
        k.sort();
        System.out.println(k.ArraylistTostring());
    }
}
