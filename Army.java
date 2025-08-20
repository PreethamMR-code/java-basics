class Army {
    String regiment;
    String commandingOfficer;
    int battalions;

    Squad squad;

    Army() {
        this.regiment = "Infantry Regiment";
        this.commandingOfficer = "Col. Vikram Singh";
        this.battalions = 20;
    }

    void getArmyInfo() {
        System.out.println("-------Army Details ------");
        System.out.println("Regiment: " + regiment);
        System.out.println("Commanding Officer: " + commandingOfficer);
        System.out.println("Number of Battalions: " + battalions);

        this.squad.getSquadInfo();
    }
}
