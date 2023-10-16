package org.startsteps.week7.LibraryManagement;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {


                Book book = new Book();
                book.setId("B001");
                book.setTitle("Sample Book");
                book.setIsbn("1234567890");
                book.setAuthor("John Doe");


        System.out.println("Book Information:");
                System.out.println("ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Author: " + book.getAuthor());


                User user1 = new User("John Doe", 25, "AliceSmith@abc.com");
                User user2 = new User("Alice Smith", 17, "AliceSmith@abc.com");

                System.out.println(user1);

    }
 }

