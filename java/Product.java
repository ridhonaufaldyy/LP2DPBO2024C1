public class Product {
    // Atribut-atribut yang dimiliki oleh sebuah produk.
    protected int idProduct;
    protected String name;
    protected String brand;
    protected String price;
    
    // Konstruktor untuk membuat objek Product dengan parameter yang diberikan.
    public Product(int idProduct, String name, String brand, String price) {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

}
