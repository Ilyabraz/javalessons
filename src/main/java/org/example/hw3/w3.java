package org.example.hw3;

import org.example.hw3.hw3_3.Books.Books;

import java.util.ArrayList;
import java.util.List;

    public class w3 {
        public static void main(String[] args) {
            Books book1 = new Books("Гарри Поттер", "Дж.Роулинг", 360.23, 2009, 11);
            Books book2 = new Books("Алхимик", "П.Коэльо", 199.99, 1999, 6);
            Books book3 = new Books("Batman", "Marvel", 399.99, 2007, 1);
            Books book4 = new Books("Дневник мага", "П.Коэльо", 159.99, 2001, 100);
            Books book5 = new Books("Вий", "Гоголь", 95.99, 1850, 2011);
            Books book6 = new Books("Евгений Онегин", "Пушкин", 16.99, 2001, 23);
            Books book7 = new Books("Ранние повести", "Лермонтов", 480.56, 2003, 100);
            Books book8 = new Books("Человек-Амфибия", "Беляев", 20.99, 1991, 11);

            List<Books> booksList = new ArrayList<>();

            booksList.add(book1);
            booksList.add(book2);
            booksList.add(book3);
            booksList.add(book4);
            booksList.add(book5);
            booksList.add(book6);
            booksList.add(book7);
            booksList.add(book8);
            System.out.println(booksList);

            StringBuilder sortedBooks = new StringBuilder();
            for (Books books : booksList) {
                if (isPrime(books.getPgNum()) && books.getAuthor().toLowerCase().contains("а")) {
                    if (books.getYear() >= 2000 && books.getYear() <= 2010) {
                        sortedBooks.append(books.getName()).append("\n");
                    }
                }
            }
            System.out.println(sortedBooks);
        }

        private static boolean isPrime(Integer num) {

            if (num == 1) {
                return true;
            }
            if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
                return false;
            }
            for (int i = 2; i < num * num; i++) {
                if (i != num) {
                    if (num % i == 0) {
                        return false;
                    }
                }
            }
            return true;

        }
}
