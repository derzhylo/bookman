package ua.com.bookman.dao;

import ua.com.bookman.model.Book;

import java.util.List;

/**
 * Created by Юра on 29.10.2017.
 */
public interface BookDao {

    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listbooks();
}
