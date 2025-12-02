class DefenceRunner {
    public static void main(String args[]) {
        Defence defence = new Defence();
        Army army = new Army();
        Squad squad = new Squad();

        defence.army = army;
        army.squad = squad;

        defence.getDefenceInfo();
    }
}