package com.ohgiraffers;

import com.ohgiraffers.view.BookMenu;

import java.util.Scanner;

public class Application {
    public Application() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            while(true) {
                System.out.println("1. 도서 조회");
                System.out.println("2. 도서 관리");
                System.out.println("3. 대출중인 도서 조회");
                int selectMenu = sc.nextInt();
                switch (selectMenu) {
                    case 1:
                        (new BookMenu()).viewMenu();
                        break;
                    case 2:
                        (new BookMenu()).editBook();
                        break;
                    case 3:
                        (new BookMenu()).searchLoanedBooks();
                        break;
                    default:
                        System.out.println("올바른 번호를 입력해주세요."); break;
                }
            }
        }
    }
}
