package Encapsulation;

public class MainCategory {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId(1);
        category.setName("Makanan");
        category.setDesc("Makanan Junk Food");
        category.setExpensive(false);
        System.out.println(category);

        System.out.println(new Category(2,"minuman","Minuman Jamu",false));
        System.out.println(new Category(3,"Aksesoris","Kalung emas",true));
    }
}
