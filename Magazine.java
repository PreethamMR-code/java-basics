class Magazine {
    String name;
    String editor;
    int issueNumber;

    Page page;

    Magazine() {
        this.name = "Tech Weekly";
        this.editor = "Jane Doe";
        this.issueNumber = 101;
    }

    void getMagazineInfo() {
        System.out.println("-------Magazine Details-------");
        System.out.println("Magazine Name: " + name);
        System.out.println("Editor: " + editor);
        System.out.println("Issue Number: " + issueNumber);

        this.page.getPageInfo();
    }
}
