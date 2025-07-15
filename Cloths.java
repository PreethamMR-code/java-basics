class Cloths {
    static String clothType;
    static String fabricMaterial;
    static String brandName;
    static String color;
    static String size;
    static double price;

    public static boolean registerCloth(String type, String material, String brand, String clr, String sz, double cost) {
        boolean isClothRegistered = false;

        boolean typeOk = false;
        boolean materialOk = false;
        boolean brandOk = false;
        boolean colorOk = false;
        boolean sizeOk = false;
        boolean priceOk = false;

        if (type != null && !type.isEmpty()) {
            clothType = type;
            typeOk = true;
        } else {
            System.out.println("Cloth type is required.");
        }

        if (material != null && !material.isEmpty()) {
            fabricMaterial = material;
            materialOk = true;
        } else {
            System.out.println("Please specify fabric material.");
        }

        if (brand != null && !brand.isEmpty()) {
            brandName = brand;
            brandOk = true;
        } else {
            System.out.println("Brand name can't be empty.");
        }

        if (clr != null && !clr.isEmpty()) {
            color = clr;
            colorOk = true;
        } else {
            System.out.println("Please provide a color.");
        }

        if (sz != null && !sz.isEmpty()) {
            size = sz;
            sizeOk = true;
        } else {
            System.out.println("Size can't be empty.");
        }

        if (cost > 0) {
            price = cost;
            priceOk = true;
        } else {
            System.out.println("Price must be greater than 0.");
        }

        if (typeOk && materialOk && brandOk && colorOk && sizeOk && priceOk) {
            isClothRegistered = true;
        } else {
            System.out.println("Cloth registration failed.");
        }

        return isClothRegistered;
    }

    public static void getClothDetails() {
        System.out.println("Cloth Type: " + clothType);
        System.out.println("Material: " + fabricMaterial);
        System.out.println("Brand: " + brandName);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: ₹" + price);
    }
}
