import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat list untuk menyimpan produk-produk yang dimasukkan pengguna.
        List<Product> products = new ArrayList<>();

        // Membuat objek Scanner untuk menerima masukan dari pengguna.
        Scanner scanner = new Scanner(System.in);

        // Mengulang proses untuk memasukkan detail produk sebanyak 3 kali.
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline dari masukan sebelumnya.
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            System.out.print("Price: ");
            String price = scanner.nextLine();
            System.out.print("Size: ");
            String size = scanner.nextLine();
            System.out.print("Material: ");
            String material = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Sleeve Type: ");
            String sleeveType = scanner.nextLine();

            // Membuat objek Shirt dengan detail yang dimasukkan pengguna dan menambahkannya ke dalam list produk.
            Shirt shirt = new Shirt(id, name, brand, price, size, material, gender, color, sleeveType);
            products.add(shirt);
        }

        // Memanggil metode printProducts dari TablePrinter untuk menampilkan data produk dalam bentuk tabel
        Tabel.printProducts(products);

        // Menutup objek Scanner untuk menghindari kebocoran sumber daya.
        scanner.close();
    }
}
