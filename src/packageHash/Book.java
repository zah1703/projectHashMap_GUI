/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageHash;

import java.util.ArrayList;

/**
 *
 * @author dosen
 */
public class Book {

    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.content = content;
        this.published = published;
    }

    public static Book get(ArrayList<Book> books, String name) {

        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", content=" + content + ", published=" + published + '}';
    }

}
