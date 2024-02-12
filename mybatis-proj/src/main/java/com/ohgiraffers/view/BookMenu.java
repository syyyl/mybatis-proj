package com.ohgiraffers.view;

import com.ohgiraffers.controller.BookController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMenu {
    private BookController bookController;
    public BookMenu() {
        this.bookController = new BookController();
    }

    public void viewMenu() {
        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();

        do {
            System.out.println("1. 전체 도서 조회");
            System.out.println("2. 도서 제목을 검색하여 조회");
            System.out.println("9. 상위 메뉴로");
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    bookController.viewAllList();
                    break;
                case 2:
                    searchByTitle(bookController);
                    break;
                case 9:
                    return;
                default:
                    System.out.println("올바른 번호를 입력해주세요.");
            }
        } while (true);
    }

    private void searchByTitle(BookController bookController) {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색어를 입력하세요: ");
        String searchStr = sc.next();
        bookController.searchList(searchStr);
    }


    public void editBook() {
        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();

        do {
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("9. 상위 메뉴로");
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    bookController.addBook(inputBook());
                    break;
                case 2:
                    bookController.modifyBook(inputModifyBook());
                    break;
                case 3:
                    bookController.deleteBook(inputDeleteBook());
                    break;
                case 9:
                    return;
                default:
                    System.out.println("올바른 번호를 입력해주세요.");
            }
        } while (true);
    }


    private Map<String, String> inputBook() {

        Scanner sc = new Scanner(System.in);
        System.out.print("도서 이름을 입력하세요 : ");
        String bookName = sc.nextLine();
        System.out.print("출판사를 입력하세요 : ");
        String publisher = sc.nextLine();
        System.out.print("출간일을 입력하세요 : ");
        String releaseDate = sc.nextLine();
        System.out.print("재고 수량을 입력하세요 : ");
        String amount = sc.nextLine();
        System.out.print("분야 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();
        System.out.print("대출 가능 여부를 입력하세요 : ");
        String loanableYN = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("bookName", bookName);
        parameter.put("publisher", publisher);
        parameter.put("releaseDate", releaseDate);
        parameter.put("amount", amount);
        parameter.put("categoryCode", categoryCode);
        parameter.put("loanableYN", loanableYN);

        return parameter;

    }


    private Map<String, String> inputModifyBook() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 도서 코드를 입력하세요 : ");
        String bookCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("bookCode", bookCode);

        System.out.print("도서 이름을 입력하세요 : ");
        String bookName = sc.nextLine();
        System.out.print("출판사를 입력하세요 : ");
        String publisher = sc.nextLine();
        System.out.print("출간일을 입력하세요 : ");
        String releaseDate = sc.nextLine();
        System.out.print("재고 수량을 입력하세요 : ");
        String amount = sc.nextLine();
        System.out.print("분야 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();
        System.out.print("대출 가능 여부를 입력하세요 : ");
        String loanableYN = sc.nextLine();

        parameter.put("bookName", bookName);
        parameter.put("publisher", publisher);
        parameter.put("releaseDate", releaseDate);
        parameter.put("amount", amount);
        parameter.put("categoryCode", categoryCode);
        parameter.put("loanableYN", loanableYN);

        return parameter;

    }


    private Map<String, String> inputDeleteBook() {

        Scanner sc = new Scanner(System.in);
        System.out.print("도서 코드를 입력하세요 : ");
        String bookCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("bookCode", bookCode);

        return parameter;
    }


    public void searchLoanedBooks() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. 회원 검색 및 대출한 책 출력");
            System.out.println("9. 상위 메뉴로");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1:
                    bookController.searchLoanedBooks();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("올바른 번호를 입력해주세요.");
            }
        } while (true);
    }
}






