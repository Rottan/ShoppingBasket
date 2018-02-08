import Items.Items;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basket {

    Map basket = new HashMap();

    public void addBasket(String nazwa, Integer cena) {
        basket.put(nazwa, cena);
    }

    public void print() {
        System.out.println(basket.entrySet());
    }

    public void addBasket(Items items) {
        basket.put(items.getName(), items.getPrice());

    }

  /*  public void basketPrice() {
        int suma = 0;
        while (basket.values() != null ) {
            suma = suma + basket.values();

        }
        System.out.println(basket.values());
    }*/
}
