class Wallet {
    String material;
    String color;
    int cardSlots;
    boolean hasCoinPocket;
    String closureType;

    Wallet() {
        System.out.println("Wallet constructor invoked");
    }

    Wallet(String material, String color, int cardSlots) {
        System.out.println("Wallet parameterized constructor (material, color, cardSlots) invoked");
        this.material = material;
        this.color = color;
        this.cardSlots = cardSlots;
    }

    Wallet(boolean hasCoinPocket, String closureType, String material) {
        System.out.println("Wallet parameterized constructor (coinPocket, closure, material) invoked");
        this.hasCoinPocket = hasCoinPocket;
        this.closureType = closureType;
        this.material = material;
    }

    Wallet(String color, String closureType, int cardSlots) {
        System.out.println("Wallet parameterized constructor (color, closure, cardSlots) invoked");
        this.color = color;
        this.closureType = closureType;
        this.cardSlots = cardSlots;
    }

    public void getInfo() {
        System.out.println("\n--- Wallet Details ---");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Card Slots: " + cardSlots);
        System.out.println("Has Coin Pocket: " + hasCoinPocket);
        System.out.println("Closure Type: " + closureType);
    }
}

