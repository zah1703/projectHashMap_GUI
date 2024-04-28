/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthashmap;

import java.util.HashMap;

/**
 *
 * @author dosen
 */
public class ProjectHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        HashMap<String, Book> directory = new HashMap<>();
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

        System.out.println(directory);

        Book book = directory.get("Persuasion");
        System.out.println(book);
        System.out.println();
        book = directory.get("Pride and Prejudice");
        System.out.println(book);
    }

}
