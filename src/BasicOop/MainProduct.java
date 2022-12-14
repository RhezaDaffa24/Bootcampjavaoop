package BasicOop;

public class MainProduct {
    public static void main(String[] args) {
        product product1 = new product(1,"nasi goreng",15000);
        product1.showPrice();

        product product2 = new product(2,"nasi ayam", 20000);
        product2.showPrice();

        product product3 = new product(3,"nasi gulai", 25000);
        product3.showPrice();
         // instance kosong dengan constructor default
        product product4 = new product();
        product4.showPrice();


    }
}
