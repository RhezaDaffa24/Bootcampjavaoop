package BasicOop;

public class Club extends Person{
    public String namaClub;
    public String posisi;
    public int tahunmasuk;

    public Club(Integer id, String name, String gender, String address, int age, String namaClub, String posisi, int tahunmasuk) {
        super(id, name, gender, address, age);
        this.namaClub = namaClub;
        this.posisi = posisi;
        this.tahunmasuk = tahunmasuk;
    }
}
