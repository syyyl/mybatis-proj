//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.ohgiraffers.model.dto;

import java.util.Date;

public class MemberDTO {
    private int memberCode;
    private String memberName;
    private int joinDate;
    private boolean loanYN;
    private int loanedBook;

    public MemberDTO() {
    }

    public MemberDTO(int memberCode, String memberName, int joinDate, boolean loanYN, int loanedBook) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.joinDate = joinDate;
        this.loanYN = loanYN;
        this.loanedBook = loanedBook;
    }

    public int getMemberCode() {
        return this.memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getJoinDate() {
        return this.joinDate;
    }

    public void setJoinDate(int joinDate) {
        this.joinDate = joinDate;
    }

    public boolean isLoanYN() {
        return this.loanYN;
    }

    public void setLoanYN(boolean loanYN) {
        this.loanYN = loanYN;
    }

    public int getLoanedBook() {
        return this.loanedBook;
    }

    public void setLoanedBook(int loanedBook) {
        this.loanedBook = loanedBook;
    }

    public String toString() {
        return "MemberDTO{memberCode=" + this.memberCode + ", memberName='" + this.memberName + "', joinDate=" + this.joinDate + ", loanYN=" + this.loanYN + ", loanedBook=" + this.loanedBook + "}";
    }
}
