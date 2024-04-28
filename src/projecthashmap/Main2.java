/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthashmap;

import java.util.ArrayList;

/**
 *
 * @author dosen
 */
public class Main2 {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        books.add(senseAndSensibility);
        books.add(prideAndPrejudice);

        Book match = Book.get(books, "Sense and Sensibility");
        System.out.println("Menggunakan fungsi static get(): " + match);
// searching for a book named Sense and Sensibility
        match = null;
        for (Book book : books) {
            if (book.getName().equals("Sense and Sensibility"))  {
                match = book;
                break;
            }
        }

        System.out.println("Tanpa menggunakan fungsi static get(): " + match);
        System.out.println();

// searching for a book named Persuasion
        match = null;
        for (Book book : books) {
            if (book.getName().equals("Persuasion")) {
                match = book;
                break;
            }
        }

        System.out.println("Tanpa menggunakan fungsi static get(): " + match);
    }
}
