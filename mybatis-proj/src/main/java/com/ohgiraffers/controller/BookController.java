
package com.ohgiraffers.controller;

import com.ohgiraffers.common.Template;
import com.ohgiraffers.model.dto.BookDTO;
import com.ohgiraffers.model.dto.MemberAndBookDTO;
import com.ohgiraffers.model.mapper.BookMapper;
import com.ohgiraffers.model.service.BookService;
import com.ohgiraffers.view.BookPrint;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookController {
    private final BookPrint bookPrint = new BookPrint();
    private final BookService bookService = new BookService();

    public BookController() {
    }

    public void viewAllList() {
        List<BookDTO> allBookList = this.bookService.viewAllList();
        if (allBookList != null && !allBookList.isEmpty()) {
            this.bookPrint.printAllList(allBookList);
        } else {
            this.bookPrint.printErrorMessage("viewAllList");
        }

    }

    public void searchList(String searchStr) {

        List<BookDTO> searchedBooks = this.bookService.searchByTitle(searchStr);
        if (searchedBooks != null && !searchedBooks.isEmpty()) {
            this.bookPrint.printSearchedBooks(searchedBooks);
        } else {
            this.bookPrint.printErrorMessage("searchList");
        }
    }

    public void addBook(Map<String, String> parameter) {

        BookDTO book = new BookDTO();
        book.setBookName(parameter.get("bookName"));
        book.setPublisher(parameter.get("publisher"));
        book.setReleaseDate(Integer.parseInt(parameter.get("releaseDate")));
        book.setAmount(Integer.parseInt(parameter.get("amount")));
        book.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));
        book.setLoanableYN(Boolean.parseBoolean(parameter.get("loanableYN ")));

        if(bookService.addBook(book)) {
            bookPrint.printSuccessMessage("addBook");
        } else {
            bookPrint.printErrorMessage("addBook");
        }

    }

    public void modifyBook(Map<String, String> parameter) {

        BookDTO book = new BookDTO();
        book.setBookCode(Integer.parseInt(parameter.get("bookCode")));
        book.setBookName(parameter.get("bookName"));
        book.setPublisher(parameter.get("publisher"));
        book.setReleaseDate(Integer.parseInt(parameter.get("releaseDate")));
        book.setAmount(Integer.parseInt(parameter.get("amount")));
        book.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));
        book.setLoanableYN(Boolean.parseBoolean(parameter.get("loanableYN ")));

        if(bookService.modifyBook(book)) {
            bookPrint.printSuccessMessage("updateBook");
        } else {
            bookPrint.printErrorMessage("updateBook");
        }
    }

    public void deleteBook(Map<String, String> parameter) {

        int bookCode = Integer.parseInt(parameter.get("bookCode"));

        if(bookService.deleteBook(bookCode)) {
            bookPrint.printSuccessMessage("deleteBook");
        } else {
            bookPrint.printErrorMessage("deleteBook");
        }

    }

    public void searchLoanedBooks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호를 입력하세요: ");
        String searchCondition = sc.nextLine();
        List<MemberAndBookDTO> loanedBooks = bookService.searchLoanedBook(searchCondition);
        bookPrint.printSearchLoanedBooks(loanedBooks);
    }
}
