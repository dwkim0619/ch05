package ch05;

public class Book3 {
    private String title;
    private String author;

    public Book3(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getAuthor() {
        return author;
    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }

    @Override
    public String toString() {
        return "책 {" +
                "제목 = '" + title + '\'' +
                ", 저자 = '" + author + '\'' +
                '}';
    }
}
