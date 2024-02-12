package com.ohgiraffers.view;

import com.ohgiraffers.model.dto.BookDTO;
import com.ohgiraffers.model.dto.MemberAndBookDTO;

import java.util.Iterator;
import java.util.List;

public class BookPrint {
    public BookPrint() {
    }

    public void printAllList(List<BookDTO> allBookList) {
        System.out.println("===== 전체 도서 목록 =====");
        Iterator var2 = allBookList.iterator();

        while(var2.hasNext()) {
            BookDTO book = (BookDTO)var2.next();
            System.out.println(book);
        }

        System.out.println("===================");
    }


    public void printSearchedBooks(List<BookDTO> searchedBooks) {
        System.out.println("===== 검색 결과 =====");
        for (BookDTO book : searchedBooks) {
            System.out.println(book);
        }
        System.out.println("===================");
    }

    public void printSearchLoanedBooks(List<MemberAndBookDTO> members) {
        if (members != null && !members.isEmpty()) {
            System.out.println("===== 검색된 회원 및 대출한 책 목록 =====");
            for (MemberAndBookDTO member : members) {
                System.out.println(member);
            }
            System.out.println("===================");
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "successCode":
                successMessage = "도서 추가에 성공했습니다."; break;
            case "updateBook":
                successMessage = "도서 수정에 성공했습니다."; break;
            case "deleteBook":
                successMessage = "도서 삭제에 성공했습니다."; break;
        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "viewAllList":
                errorMessage = "조회 결과가 없습니다."; break;
            case "searchList":
                errorMessage = "검색 결과가 없습니다."; break;
            case "addBook":
                errorMessage = "도서 추가에 실패했습니다."; break;
            case "updateBook":
                errorMessage = "도서 수정에 실패했습니다."; break;
            case "deleteBook":
                errorMessage = "도서 삭제에 실패했습니다."; break;
            default:
                errorMessage = "오류가 발생했습니다."; break;
        }
        System.out.println(errorMessage);
    }


}
