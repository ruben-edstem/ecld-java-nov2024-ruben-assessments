package com.edstem.ecld.assessment;

import java.time.LocalDate;

class Magazine extends LibraryItem {
    private LocalDate issueDate;
    private String publisher;
    private double lateFeePerDay = 1.0;

    public Magazine(String id, String title, LocalDate issueDate, String publisher) {
        super(id, title);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * lateFeePerDay; // Calculate late fee
    }

    @Override
    public String toString() {
        return "Magazine [ID=" + getId() + ", Title=" + getTitle() + ", Issue Date=" + issueDate + ", Publisher=" + publisher + ", Available=" + isAvailable() + "]";
    }
}
