class Page {
    int pageNumber;
    String layoutType;
    int wordCount;

    Article article;

    Page() {
        this.pageNumber = 15;
        this.layoutType = "Two Column";
        this.wordCount = 800;
    }

    void getPageInfo() {
        System.out.println("-------Page Details ------");
        System.out.println("Page Number: " + pageNumber);
        System.out.println("Layout Type: " + layoutType);
        System.out.println("Word Count: " + wordCount);

        this.article.getArticleInfo();
    }
}
