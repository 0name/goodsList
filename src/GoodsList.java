import java.util.HashMap;
import java.util.Map;

public class GoodsList {


    private Map<String,Map<String,Integer>> card = new HashMap<>();

    public Map<String, Map<String,Integer>> getCard() {
        return card;
    }

    public void addCard(String str){
        Map<String,Integer> good = new HashMap<>();
        String[]arr = str.split(" ");
        String name = arr[0];
        String tov = arr[1];
        int num = Integer.parseInt(arr[2]);
        System.out.println(num);
        if(this.card.containsKey(name)) {
            good = card.get(name);  // { good: 6 }
            if(good.containsKey(tov)){  //good
                good.put(tov,good.get(tov+num));
            }else {
                good.put(tov,num);
            }
        }else {
            good.put(tov, num);
        }
        this.card.put(name, good);
    }

    public void showCard(){
        for (Map.Entry entry: card.entrySet()){
            System.out.println(entry.getKey() + ":");
            for (Map.Entry en: card.get(entry.getKey()).entrySet()){
                System.out.println(en.getKey() + " " + en.getValue());
            }
        }
    }
}
