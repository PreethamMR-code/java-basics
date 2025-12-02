class Squad {
    String squadName;
    int members;
    String primaryWeapon;

    Squad() {
        this.squadName = "Alpha Squad";
        this.members = 10;
        this.primaryWeapon = "Assault Rifle";
    }

    void getSquadInfo() {
        System.out.println("-----Squad Details------");
        System.out.println("Squad Name: " + squadName);
        System.out.println("Members: " + members);
        System.out.println("Primary Weapon: " + primaryWeapon);
    }
}

