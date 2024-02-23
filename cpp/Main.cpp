#include <iostream>
#include <vector>
#include "Shirt.h" // Mengimpor definisi kelas Shirt

int main() {
    std::vector<Shirt> shirts; // Membuat vektor untuk menyimpan objek-objek kemeja

    // Meminta pengguna untuk memasukkan detail setiap kemeja
    for (int i = 1; i <= 1; ++i) { //1 kali aja ya teh biar ga cape input inputnya
        Shirt shirt; // Buat objek kemeja sementara
        std::cout << "Enter Shirt " << i << " details:\n";
        std::cout << "ID: ";
        std::cin >> shirt.idProduct;
        std::cout << "Name: ";
        std::cin >> shirt.name;
        std::cout << "Brand: ";
        std::cin >> shirt.brand;
        std::cout << "Price: ";
        std::cin >> shirt.price;
        std::cout << "Size: ";
        std::cin >> shirt.size;
        std::cout << "Material: ";
        std::cin >> shirt.material;
        std::cout << "Gender: ";
        std::cin >> shirt.gender;
        std::cout << "Color: ";
        std::cin >> shirt.color;
        std::cout << "Sleeve Type: ";
        std::cin >> shirt.sleeveType;

        shirts.push_back(shirt); // Menambahkan objek kemeja ke vektor
    }

    // Menampilkan detail setiap kemeja yang dimasukkan
    std::cout << "\nList of Shirts:\n";
    for (const auto& shirt : shirts) { // Melakukan iterasi pada vektor kemeja
        std::cout << "ID: " << shirt.idProduct << ", Name: " << shirt.name << ", Brand: " << shirt.brand
                  << ", Price: " << shirt.price << ", Size: " << shirt.size << ", Material: " << shirt.material
                  << ", Gender: " << shirt.gender << ", Color: " << shirt.color << ", Sleeve Type: " << shirt.sleeveType << "\n";
    }

    return 0;
}
