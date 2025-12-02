class TechParkRunner {
    public static void main(String args[]) {
        TechPark techPark = new TechPark();
        Block block = new Block();
        Company company = new Company();

        techPark.block = block;
        block.company = company;

        techPark.getTechParkInfo();
    }
}