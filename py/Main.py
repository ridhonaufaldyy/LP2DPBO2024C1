# Mengimpor kelas Shirt dari modul Shirt
from Shirt import Shirt
# Mengimpor kelas TablePrinter dari modul Tabel
from Tabel import TablePrinter

# Fungsi utama program
def main():
    products = []  # Membuat list kosong untuk menyimpan produk

    for i in range(3): 
        print(f"Masukkan detail produk {i + 1}:")
        idProduct = int(input("ID: "))  
        name = input("Nama: ")  
        brand = input("Merek: ")  
        price = input("Harga: ")  
        size = input("Ukuran: ")  
        material = input("Bahan: ")  
        gender = input("Jenis Kelamin: ")   
        color = input("Warna: ")  
        sleeveType = input("Jenis Lengan: ")

        # Membuat objek Shirt dengan detail yang dimasukkan pengguna dan menambahkannya ke dalam list produk
        shirt = Shirt(idProduct, name, brand, price, size, material, gender, color, sleeveType)
        products.append(shirt) 

    # Memanggil metode print_products dari kelas TablePrinter untuk menampilkan data produk
    TablePrinter.print_products(products)

if __name__ == "__main__":
    main()
