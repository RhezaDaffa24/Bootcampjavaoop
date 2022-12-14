package BasicOop;

public class Dealer extends Person {
    public String mobil;
    public String jenisMobil;
    public int harga;
    public String pembayaran;

    public Dealer(Integer id, String name, String gender, String address, int age, String mobil, String jenisMobil, int harga, String pembayaran) {
        super(id, name, gender, address, age);
        this.mobil = mobil;
        this.jenisMobil = jenisMobil;
        this.harga = harga;
        this.pembayaran = pembayaran;
    }
}
