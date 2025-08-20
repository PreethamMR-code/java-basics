class MagazineRunner {
    public static void main(String args[]) {
        Magazine magazine = new Magazine();
        Page page = new Page();
        Article article = new Article();

        magazine.page = page;
        page.article = article;

        magazine.getMagazineInfo();
    }
}