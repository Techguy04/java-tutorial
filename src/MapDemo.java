import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Double> cart = new TreeMap<>();
        cart.put("fanta", 230.0);
        cart.put("coke", 200.0);
        cart.put("bread", 1000.0);
        cart.put("meat", 1200.0);
//        cart.put("laptop", 3000.0);
        cart.put("Apple", 300.0);

//        System.out.println(cart);
        for(Map.Entry<String, Double> item : cart.entrySet()) {
//            System.out.println(item);
            if (item.getValue() > 230) {
                System.out.println(item);
            }
        }
        //iterate to get values
        System.out.println("****values only***");
        for (Double values : cart.values()) {
            System.out.println(values);
        }

        //iterate to get only keys
        System.out.println("***get only key***");
        for (String keys : cart.keySet()) {
//            System.out.println(keys);

            if (keys.length() > 4) {

                System.out.println(keys);
            }
        }

        //findind the size
        int size = cart.size();
        System.out.println("Size: " + size);

//        if contain key
        if (cart.containsKey("laptop")) {
            cart.put("laptop", 3000.0);
        }else {
            cart.put("laptop", 100.00);
        }
        System.out.println(cart);
//        if contain values
        if (cart.containsValue(230.0)) {
            Double fanta = cart.get("fanta");
            System.out.println(fanta);
        }
//        remove item
        if (cart.containsKey("fanta")) {
          Double fanta = cart.remove("fanta");
            System.out.println("removed : " +fanta);
        }else{
            System.out.println("item doesn't exist");
        }

//        clear
        if (cart.isEmpty()) {
            cart.clear();
        }
        System.out.println(cart.size());
        System.out.println(cart);

        cart.put("Tv", 24000.90);
        System.out.println(cart);
    }
}
