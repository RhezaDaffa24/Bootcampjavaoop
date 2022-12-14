package BasicOop;

public class MainPerson {
    public static void main(String[] args) {
        //proses pembuatan object
        //class object  instance constructor

        Person person1 = new Person();
        person1.id = 1;
        person1.name = "astaga";
        person1.address="Cianjur";
        person1.gender="laki";
        person1.age=44;
        person1.sayHello();

        Person person2 = new Person();
        person2.id = 2;
        person2.name = "gita";
        person2.address="yogya";
        person2.gender="perempuan";
        person2.age=19;
        person2.sayHello();

        Person person3 = new Person();
        person3.id = 3;
        person3.name = "puku";
        person3.address="surabaya";
        person3.gender="laki";
        person3.age=32;
        person3.sayHello();
    }
}