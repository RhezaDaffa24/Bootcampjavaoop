package InterfaceClass;

public class HasBrandimpl implements HasBrand{
    private String brandName;

    private Integer price;

    private String Jenis;

    private int tahunproduksi;

    public HasBrandimpl(String brandName, Integer price, String jenis, int tahunproduksi) {
        this.brandName = brandName;
        this.price = price;
        this.Jenis = jenis;
        this.tahunproduksi = tahunproduksi;
    }

    @Override
    public String getBrand() {
        return this.brandName;
    }

    @Override
    public String toString() {
        return  " ( Deatil:  "+
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                ", Jenis='" + Jenis + '\'' +
                ", tahunproduksi=" + tahunproduksi+" )";
    }
}
