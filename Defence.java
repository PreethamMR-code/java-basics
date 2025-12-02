class Defence {
    String branch;
    String headquarters;
    long personnelCount;

    Army army;

    Defence() {
        this.branch = "Indian Army";
        this.headquarters = "New Delhi";
        this.personnelCount = 1200000L;
    }

    void getDefenceInfo() {
        System.out.println("-------Defence Details-------");
        System.out.println("Branch: " + branch);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Personnel Count: " + personnelCount);

        this.army.getArmyInfo();
    }
}
