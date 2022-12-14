package BasicOop;

public class Person {
    //list property or field
    public Integer id;
    public String name;
    public String gender;
    public String address;
    public int age;

    //list of method getter and setter

    public void sayHello(){
        System.out.println("Hello, my name is "+name+" and i live at "+ address);
        System.out.println("im "+age+" years old");
    }

    public Person() {
    }

    public Person(Integer id, String name, String gender, String address, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }



}
