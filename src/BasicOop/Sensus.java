package BasicOop;

public class Sensus extends Person{
    public String provinsi;
    public Integer kodePos;
    public Integer noKtp;

    public Sensus(Integer id, String name, String gender, String address, int age, String provinsi, Integer kodePos, Integer noKtp) {
        super(id, name, gender, address, age);
        this.provinsi = provinsi;
        this.kodePos = kodePos;
        this.noKtp = noKtp;
    }
}
