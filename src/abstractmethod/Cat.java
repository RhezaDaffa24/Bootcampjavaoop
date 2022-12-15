package abstractmethod;

public class Cat extends animal{
    public Cat(String name){
        this.name=name;
    }

    @Override
    void run() {
        System.out.println("this cat "+name +", can run");
    }

    @Override
    void canEat() {
        System.out.println("The cat can eat whiskas");
    }
}
