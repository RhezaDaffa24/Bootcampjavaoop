package superKeyword;

public class Rectangle extends shape{
    int getCorner() {
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }
    String getName(){
        return "Yoi Bro";
    }

}
