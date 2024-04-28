/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageHash;

/**
 *
 * @author dosen
 */
public class Main3 {

    public static void main(String[] args) {
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        Book prideAndPrejudice2 = new Book("PRIDE AND PREJUDICE", 1813, "....");

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);
        library.addBook(prideAndPrejudice2);
        System.out.println("Library: " + library);

        System.out.println(library.getBook("pride and prejudice"));
        System.out.println();

        System.out.println(library.getBook("PRIDE AND PREJUDICE"));
        System.out.println();

        System.out.println(library.getBook("SENSE"));

        System.out.println("Search BookByPart of title: " + library.getBookByPart("pride"));

        System.out.println(library.getReg());

        System.out.println("Search BookByPart of title: " + library.getBookByPart("frid"));
    }
}
