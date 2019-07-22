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
public class Library {

    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void printAvailableBooks() {
        String answer = "The available books are ";
        for (Book element : books) {
            if (element.isAvailable()) {

                System.out.println(answer.concat(element.toString()));
            }

        }
    }

    public void printBookDetails(String bookTitle) {
        // Variable to hold the search result
        //boolean exists = false;
        //Search if the given book exists in the library
        // There are better ways. But not with arrays!!
        Book tmpBook = null;
        for (Book element : books) {
            if (element.title.equals(bookTitle)) {
                //exists = true;
                tmpBook = element;
                break;
                //System.out.println(bookToSearch.toString());
            }

//            else{
//                System.out.println(bookToSearch.toString() + " not found");
//            }
            //Print book details if book found
//            if (exists) {
//                
//            } else {
//                
//            }
        }
        if (tmpBook != null) {
            System.out.println(tmpBook.toString());
        } else {
            System.out.println(bookTitle + " not found");
        }
    }

    public void printBooksFromAuthor(Author authorToSearch) {
        StringBuilder answer = new StringBuilder("The books of author "+authorToSearch.getName()+" are:\n");
        int i = 0;
        for (Book element : books) {
            if (element.hasAuthor(authorToSearch.getName())) {
                answer.append(element.toString()).append("\n");
            }
        }
        System.out.println(answer.toString());
    }

    public void printTheMostPopularBook() {
        Book mostPopular = null;
        int count = 0;
        for (Book element : books) {
            if (element.timesRented > count) {
                mostPopular = element;
                count = element.timesRented;
            }
        }
        System.out.println(mostPopular);
        //return mostPopular;
    }

}
