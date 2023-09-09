package com.softdebugs.javapracticemodule.designpattern.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String name;
    private final List<Book> books = new ArrayList<>();

    public void setBookName(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int bookId) {
        books.removeIf(book -> book.getBookId() == bookId);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void loadBooks() {
        for (int i = 0; i < 5; i++) {
            books.add(new Book(i, "Book-" + i));
        }

    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for (Book book : books) {
            shop.addBook(book);
        }
        return shop;
    }
}
