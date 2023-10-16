package org.startsteps.week7.LibraryManagement;

public class Book {
    private String id;

    @BookInfo(title = "Sample Title", author = "Sample Author", yearPublished = 2021)
    private String bookInfo;

    public String getId() {
        return id;
    }

    public String getBookInfo() {
        return bookInfo;
    }

    public void setId(String b001) {

    }

    public void setTitle(String sampleBook) {
    }

    public void setIsbn(String number) {
    }

    public void setAuthor(String johnDoe) {
    }



    @ISBN
    private String isbn;

    public String getIsbn() {
        return bookInfo;
    }

    public String getAuthor() {
        return toString();
    }

    public String getTitle() {
        return toString();
    }
}
