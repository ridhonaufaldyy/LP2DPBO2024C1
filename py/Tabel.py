from typing import List
from Product import Product
from Shirt import Shirt

class TablePrinter:
    
    def print_products(products: List[Product]):
        if not products:
            print("Tidak ada produk untuk ditampilkan.")  # Menampilkan pesan jika tidak ada produk
            return

        # Menemukan panjang maksimum untuk setiap kolom
        id_length = max(len(str(product.idProduct)) for product in products)
        name_length = max(len(product.name) for product in products)
        brand_length = max(len(product.brand) for product in products)
        price_length = max(len(product.price) for product in products)
        size_length = max(len(product.size) for product in products)
        material_length = max(len(product.material) for product in products)
        gender_length = max(len(product.gender) for product in products)
        color_length = max(len(product.color) for product in products)
        sleeve_type_length = max(len(product.sleeveType) for product in products)

        # Menyesuaikan panjang kolom agar sesuai dengan panjang header
        id_length = max(id_length, len("ID"))
        name_length = max(name_length, len("Nama"))
        brand_length = max(brand_length, len("Merek"))
        price_length = max(price_length, len("Harga"))
        size_length = max(size_length, len("Ukuran"))
        material_length = max(material_length, len("Bahan"))
        gender_length = max(gender_length, len("Jenis Kelamin"))
        color_length = max(color_length, len("Warna"))
        sleeve_type_length = max(sleeve_type_length, len("Jenis Lengan"))

        # Mencetak header tabel
        print(f"+{'-'*(id_length+2)}+{'-'*(name_length+2)}+{'-'*(brand_length+2)}+{'-'*(price_length+2)}+{'-'*(size_length+2)}+{'-'*(material_length+2)}+{'-'*(gender_length+2)}+{'-'*(color_length+2)}+{'-'*(sleeve_type_length+2)}+")
        print(f"| {'ID':<{id_length}} | {'Nama':<{name_length}} | {'Merek':<{brand_length}} | {'Harga':<{price_length}} | {'Ukuran':<{size_length}} | {'Bahan':<{material_length}} | {'Jenis Kelamin':<{gender_length}} | {'Warna':<{color_length}} | {'Jenis Lengan':<{sleeve_type_length}} |")
        print(f"+{'-'*(id_length+2)}+{'-'*(name_length+2)}+{'-'*(brand_length+2)}+{'-'*(price_length+2)}+{'-'*(size_length+2)}+{'-'*(material_length+2)}+{'-'*(gender_length+2)}+{'-'*(color_length+2)}+{'-'*(sleeve_type_length+2)}+")

        # Mencetak data produk
        for product in products:
            if isinstance(product, Shirt):
                print(f"| {product.idProduct:<{id_length}} | {product.name:<{name_length}} | {product.brand:<{brand_length}} | {product.price:<{price_length}} | {product.size:<{size_length}} | {product.material:<{material_length}} | {product.gender:<{gender_length}} | {product.color:<{color_length}} | {product.sleeveType:<{sleeve_type_length}} |")

        # Mencetak garis putus-putus di akhir tabel
        print(f"+{'-'*(id_length+2)}+{'-'*(name_length+2)}+{'-'*(brand_length+2)}+{'-'*(price_length+2)}+{'-'*(size_length+2)}+{'-'*(material_length+2)}+{'-'*(gender_length+2)}+{'-'*(color_length+2)}+{'-'*(sleeve_type_length+2)}+")
