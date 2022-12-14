package BasicOop;

public class product {
    private Integer id;
    private String name;
    private double price;


    public product() {
    }

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public product(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void showPrice(){
        System.out.println("BasicOop.product id: "+id+", name: "+name+", Price: "+ price);
    }
}
