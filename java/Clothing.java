// Kelas Clothing merepresentasikan sebuah pakaian.
public class Clothing extends Product {
    protected String size; 
    protected String material;
    protected String gender;

    // Konstruktor untuk membuat objek Clothing dengan parameter yang diberikan.
    public Clothing(int idProduct, String name, String brand, String price, String size, String material, String gender) {
        super(idProduct, name, brand, price);
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    // Metode untuk menghasilkan representasi string dari objek Clothing.
    public String toString() {
        // Menggabungkan representasi string dari kelas induk (Product) dengan atribut-atribut khusus Clothing.
        return super.toString() + ", Size: " + size + ", Material: " + material + ", Gender: " + gender;
    }
}
