import java.util.List;

public class Tabel {

    public static void printDashedLine(int... widths) {
        System.out.print("+");
        for (int width : widths) {
            for (int i = 0; i < width + 2; i++) { // Add 2 for side borders
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println();
    }

    public static void printProducts(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products to display.");
            return;
        }

        // Initialize initial column widths for each attribute
        int idWidth = 3;
        int nameWidth = 4;
        int brandWidth = 5;
        int priceWidth = 5;
        int sizeWidth = 4;
        int materialWidth = 8;
        int genderWidth = 6;
        int colorWidth = 5;
        int sleeveTypeWidth = 11;

// Calculate maximum width for each attribute
for (Product product : products) {
    if (product instanceof Shirt) {
        Shirt shirt = (Shirt) product;
        idWidth = Math.max(idWidth, String.valueOf(shirt.idProduct).length() + 2);
        nameWidth = Math.max(nameWidth, shirt.name.length() + 2);
        brandWidth = Math.max(brandWidth, shirt.brand.length() + 2);
        int actualPriceWidth = ("Rp. " + shirt.price).length() + 2; // 2 for "Rp." prefix
        priceWidth = Math.max(priceWidth, actualPriceWidth);
        sizeWidth = Math.max(sizeWidth, shirt.size.length() + 2);
        materialWidth = Math.max(materialWidth, shirt.material.length() + 2);
        genderWidth = Math.max(genderWidth, shirt.gender.length() + 2);
        colorWidth = Math.max(colorWidth, shirt.color.length() + 2);
        sleeveTypeWidth = Math.max(sleeveTypeWidth, shirt.sleeveType.length() + 2);
    }
}

        // Print header row
        printDashedLine(idWidth, nameWidth, brandWidth, priceWidth, sizeWidth, materialWidth, genderWidth, colorWidth, sleeveTypeWidth);
        System.out.printf("| %-" + idWidth + "s | %-" + nameWidth + "s | %-" + brandWidth + "s | %-" + priceWidth + "s | %-" + sizeWidth + "s | %-" + materialWidth + "s | %-" + genderWidth + "s | %-" + colorWidth + "s | %-" + sleeveTypeWidth + "s |%n",
                "ID", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type");
        printDashedLine(idWidth, nameWidth, brandWidth, priceWidth, sizeWidth, materialWidth, genderWidth, colorWidth, sleeveTypeWidth);

        // Print product data
        for (Product product : products) {
            if (product instanceof Shirt) {
                Shirt shirt = (Shirt) product;
                System.out.printf("| %-" + idWidth + "d | %-" + nameWidth + "s | %-" + brandWidth + "s | Rp.%-" + (priceWidth - 3) + "s | %-" + sizeWidth + "s | %-" + materialWidth + "s | %-" + genderWidth + "s | %-" + colorWidth + "s | %-" + sleeveTypeWidth + "s |%n",
                shirt.idProduct, shirt.name, shirt.brand, shirt.price, shirt.size, shirt.material, shirt.gender, shirt.color, shirt.sleeveType);
    }
        }

        // Print dashed line at the end of the table
        printDashedLine(idWidth, nameWidth, brandWidth, priceWidth, sizeWidth, materialWidth, genderWidth, colorWidth, sleeveTypeWidth);
    }
}
