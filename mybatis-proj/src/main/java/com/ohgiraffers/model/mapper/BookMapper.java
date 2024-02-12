package com.ohgiraffers.model.mapper;

import com.ohgiraffers.model.dto.BookDTO;
import com.ohgiraffers.model.dto.MemberAndBookDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface BookMapper {

    List<MemberAndBookDTO> searchLoanedBooksList(String searchStr);

    List<BookDTO> viewAllList();

    List<BookDTO> searchByTitle(String searchStr);

    int addBook(BookDTO book);

    int updateBook(BookDTO book);

    int deleteBook(int bookCode);
}
