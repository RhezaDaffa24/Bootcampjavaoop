package Encapsulation;

public class Category {
    private int id;
    private String name;

    private String desc;
    private boolean expensive;

    public Category() {
    }

    public Category(int id, String name, String desc, boolean expensive) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.expensive = expensive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive){

    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", expensive=" + expensive +
                '}';
    }
}
