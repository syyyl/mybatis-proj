//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.ohgiraffers.model.dto;

import java.util.Date;

public class BookDTO {
    private int bookCode;
    private String bookName;
    private String publisher;
    private int releaseDate;
    private int amount;
    private int categoryCode;
    private boolean loanableYN;

    public BookDTO() {
    }

    public BookDTO(int bookCode, String bookName, String publisher, int releaseDate, int amount, int categoryCode, boolean loanableYN) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.amount = amount;
        this.categoryCode = categoryCode;
        this.loanableYN = loanableYN;
    }

    public int getBookCode() {
        return this.bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCategoryCode() {
        return this.categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public boolean isLoanableYN() {
        return this.loanableYN;
    }

    public void setLoanableYN(boolean loanableYN) {
        this.loanableYN = loanableYN;
    }

    public String toString() {
        return "BookDTO{bookCode=" + this.bookCode +
                ", bookName='" + this.bookName +
                "', publisher='" + this.publisher +
                "', releaseDate=" + this.releaseDate +
                ", amount=" + this.amount +
                ", categoryCode=" + this.categoryCode +
                ", loanableYN=" + this.loanableYN +
                "}";
    }
}
