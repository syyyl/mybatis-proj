package com.ohgiraffers.model.dto;

public class MemberAndBookDTO {

    private int memberCode;
    private String memberName;
    private BookDTO loanedBook;

    public MemberAndBookDTO() {
    }

    public MemberAndBookDTO(int memberCode, String memberName, BookDTO loanedBook) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.loanedBook = loanedBook;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public BookDTO getLoanedBook() {
        return loanedBook;
    }

    public void setLoanedBook(BookDTO loanedBook) {
        this.loanedBook = loanedBook;
    }


    @Override
    public String toString() {
        return "MemberAndBookDTO{" +
                "memberCode=" + memberCode +
                ", memberName='" + memberName + '\'' +
                ", loanedBook=" + loanedBook +
                '}';
    }
}
