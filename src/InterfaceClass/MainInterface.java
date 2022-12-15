package InterfaceClass;

import org.w3c.dom.ls.LSOutput;

public class MainInterface {
    public static void main(String[] args) {
        HasBrand brand = new HasBrandimpl("indo Copy",50000,"minuman",1998);
        System.out.println("Brand Name: "+ brand.getBrand()+" "+brand);
    }
}

