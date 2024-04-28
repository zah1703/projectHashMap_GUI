/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author dosen
 */
public class Library {

    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        String name = sanitizedString(book.getName());

        if (this.directory.containsKey(name)) {
            System.out.println("Book is already in the library!");
        } else {
            directory.put(name, book);
        }
    }

    public Book getBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        return this.directory.get(bookTitle);
    }

    public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);

        if (this.directory.containsKey(bookTitle)) {
            this.directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found, cannot be removed!");
        }
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = sanitizedString(titlePart);

        ArrayList<Book> books = new ArrayList<>();

        for (String bookTitle : this.directory.keySet()) {
            if (!bookTitle.contains(titlePart)) {
                continue;
            }

            // if the key contains the given string
            // we retrieve the value related to it
            // and add it tot the set of books to be returned
            books.add(this.directory.get(bookTitle));
        }

        return books;
    }

    @Override
    public String toString() {
        return "Library{" + "directory=" + directory + '}';
    }

}
