class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();
        wallet1.material = "Leather";
        wallet1.color = "Black";
        wallet1.cardSlots = 8;
        wallet1.hasCoinPocket = true;
        wallet1.closureType = "Bi-fold";
        wallet1.getInfo();

        Wallet wallet2 = new Wallet("Canvas", "Brown", 6);
        wallet2.hasCoinPocket = false;
        wallet2.closureType = "Tri-fold";
        wallet2.getInfo();

        Wallet wallet3 = new Wallet(true, "Zipper", "Synthetic");
        wallet3.color = "Blue";
        wallet3.cardSlots = 4;
        wallet3.getInfo();

        Wallet wallet4 = new Wallet("Red", "Snap", 10);
        wallet4.material = "PU Leather";
        wallet4.hasCoinPocket = true;
        wallet4.getInfo();

        Wallet wallet5 = new Wallet();
        wallet5.material = "Nylon";
        wallet5.color = "Green";
        wallet5.cardSlots = 5;
        wallet5.hasCoinPocket = true;
        wallet5.closureType = "Velcro";
        wallet5.getInfo();
    }
}