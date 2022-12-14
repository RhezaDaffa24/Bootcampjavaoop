package superKeyword;

public class MainShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getCorner();
        rectangle.getParentCorner();
        rectangle.getName();

        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
        System.out.println(rectangle.getName());
    }
}
