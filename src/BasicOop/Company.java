package BasicOop;

public class Company extends Person {
    public String job;
    public String Companyname;

    public Company(Integer id, String name, String gender, String address, int age, String job, String companyname) {
        super(id, name, gender, address, age);
        this.job = job;
        Companyname = companyname;
    }

}
