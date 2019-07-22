/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryexercise;

/**
 *
 * @author anastasios
 */
public class Librarian {

    private Library library;

    public Librarian(Library library) {
        this.library = library;
    }

    public void findMeBooksFromAuthor(Author author) {
        library.printBooksFromAuthor(author);
    }

    public void findMeAvailableBooks() {
        library.printAvailableBooks();
    }

    public void findMeBook(String bookTitle) {
        library.printBookDetails(bookTitle);
    }

    public void findMostPopularBook() {
        library.printTheMostPopularBook();
    }

    public boolean rentBook(Book bookToRent) {
        boolean rented = false;
        if (bookToRent.availableCopies > 1) {
            System.out.println("Book is rented");
            //Reduse the available copies
            bookToRent.availableCopies--;
            // times rented
            bookToRent.timesRented++;
            rented = true;
        }
        return rented;
    }
}
