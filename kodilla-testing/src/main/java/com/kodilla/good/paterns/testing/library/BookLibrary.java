package com.kodilla.good.paterns.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {

        List<Book> bookList = new ArrayList<>();
        if(titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if(resultList.size() > 20) return bookList;
        bookList = resultList;

        return resultList;
    }

    List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        List<Book> bookList = new ArrayList<>();
        if(libraryUser.getBooksQuantity() == 0) return bookList;
        List<Book> bookListInHandsOf = libraryDatabase.listBooksInHandsOf(libraryUser);
        bookList = bookListInHandsOf;

        return bookListInHandsOf;
    }
}