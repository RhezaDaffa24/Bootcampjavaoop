package BasicOop;

public class Student extends Person{
    public String major;
    public Integer studentId;

    public Student(Integer id, String name, String gender, String address, int age, String major, Integer studentId) {
        super(id, name, gender, address, age);
        this.major = major;
        this.studentId = studentId;
    }

    @Override
    public void sayHello(){
        System.out.println("Hello im a student");
        System.out.println("my name is "+this.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                ", studentId=" + studentId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

}
