class Article {
    String title;
    String author;
    String topic;

    Article() {
        this.title = "Future of AI";
        this.author = "Dr. A. Sharma";
        this.topic = "Artificial Intelligence";
    }

    void getArticleInfo() {
        System.out.println("-----Article Details------");
        System.out.println("Article Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Topic: " + topic);
    }
}
