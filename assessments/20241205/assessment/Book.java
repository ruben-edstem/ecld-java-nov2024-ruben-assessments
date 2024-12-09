package com.edstem.ecld.assessment;

class Book extends LibraryItem {
    private String author;
    private String isbn;
    private double lateFeePerDay = 2.0;

    public Book(String id, String title, String author, String isbn) {
        super(id, title);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * lateFeePerDay;
    }

    @Override
    public String toString() {
        return "Book [ID=" + getId() + ", Title=" + getTitle() + ", Author=" + author + ", ISBN=" + isbn + ", Available=" + isAvailable() + "]";
    }

}
