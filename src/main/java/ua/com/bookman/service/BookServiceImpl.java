package ua.com.bookman.service;

import org.springframework.stereotype.Service;
import ua.com.bookman.dao.BookDao;
import ua.com.bookman.model.Book;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Юра on 29.10.2017.
 */
@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public void addBook(Book book) {
        this.bookDao.addBook(book);

    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        this.bookDao.updateBook(book);

    }

    @Override
    @Transactional
    public void removeBook(int id) {
      this.bookDao.removeBook(id);
    }

    @Override
    @Transactional
    public Book getBookById(int id) {

        return this.bookDao.getBookById(id);
    }

    @Override
    @Transactional
    public List<Book> listbooks() {
        return this.bookDao.listbooks();
    }
}
