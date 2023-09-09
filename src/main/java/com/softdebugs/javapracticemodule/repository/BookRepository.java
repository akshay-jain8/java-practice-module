package com.softdebugs.javapracticemodule.repository;

import com.softdebugs.javapracticemodule.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByBookName(String bookName);
}
