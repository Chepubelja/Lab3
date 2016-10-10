import java.util.ArrayList;
import java.util.Collections;

public class Bouquet {
    ArrayList<Flowers> main_list = new ArrayList<>();
    int PriceOfBouquet;

    public int addFlowers(Flowers...args){
        for (Flowers i: args){
            main_list.add(i);
            PriceOfBouquet += i.price;
        }
        return PriceOfBouquet;
    }

    public ArrayList<String> flowerInrange(int i, int j){
        ArrayList<String> range = new ArrayList<>();
        for (Flowers flowers: main_list){
            if (flowers.stemSize >= i && flowers.stemSize <= j){
                range.add(flowers.name);
            }
        }
        return range;
    }
    public void sort(){
        Collections.sort(main_list);
    }
    public ArrayList<Flowers> ArraylistTostring(){
        return main_list;
    }
}
