// Kelas Shirt merepresentasikan sebuah kemeja.
public class Shirt extends Clothing {
    protected String color; 
    protected String sleeveType;

    // Konstruktor untuk membuat objek Shirt dengan parameter yang diberikan.
    public Shirt(int idProduct, String name, String brand, String price, String size, String material, String gender, String color, String sleeveType) {
        super(idProduct, name, brand, price, size, material, gender);
        this.color = color;
        this.sleeveType = sleeveType;
    }

    // Metode untuk menghasilkan representasi string dari objek Shirt.
    public String toString() {
        return super.toString() + ", Color: " + color + ", Sleeve Type: " + sleeveType;
    }
}
