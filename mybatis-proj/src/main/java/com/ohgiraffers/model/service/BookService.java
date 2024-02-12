package com.ohgiraffers.model.service;

import com.ohgiraffers.common.Template;
import com.ohgiraffers.model.dto.BookDTO;
import com.ohgiraffers.model.dto.MemberAndBookDTO;
import com.ohgiraffers.model.mapper.BookMapper;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import static com.ohgiraffers.common.Template.getSqlSession;

public class BookService {
    private BookMapper bookMapper;

    public BookService() {
    }

    public List<BookDTO> viewAllList() {
        SqlSession sqlSession = getSqlSession();
        this.bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDTO> allBookList = this.bookMapper.viewAllList();

        sqlSession.close();
        return allBookList;

    }

    public List<BookDTO> searchByTitle(String searchStr) {
        SqlSession sqlSession = getSqlSession();
        this.bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDTO> searchedBooks = this.bookMapper.searchByTitle(searchStr);

        sqlSession.close();
        return searchedBooks;
    }

    public boolean addBook(BookDTO book) {
        SqlSession sqlSession = Template.getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        int result = bookMapper.addBook(book);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean modifyBook(BookDTO book) {
        SqlSession sqlSession = Template.getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        int result = bookMapper.updateBook(book);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean deleteBook(int bookCode) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        int result = bookMapper.deleteBook(bookCode);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public List<MemberAndBookDTO> searchLoanedBook(String searchStr) {
        SqlSession sqlSession = Template.getSqlSession();
        this.bookMapper = sqlSession.getMapper(BookMapper.class);
        List<MemberAndBookDTO> loanedBooks = this.bookMapper.searchLoanedBooksList(searchStr);

        sqlSession.close();
        return loanedBooks;
    }


}