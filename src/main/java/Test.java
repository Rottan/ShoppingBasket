import Items.Kupka;

public class Test {
    public static void main(String[] args) {
        Basket basket = new Basket();
        LightSabre mieczyk = new LightSabre("mieczyk", 1125);
        Kupka kupka = new Kupka("kupka",1333);
        basket.addBasket(mieczyk.getName(),mieczyk.getPrice());
        basket.addBasket(mieczyk.getName(),mieczyk.getPrice());
        basket.addBasket(new Kupka("bobek",233));
        basket.addBasket(new  LightSabre("szbelka", 112));
        basket.addBasket(new LightSabre("mieczyk", 223));
        basket.addBasket(kupka.getName(),kupka.getPrice());
        basket.print();
        basket.basketPrice();

    }
}
