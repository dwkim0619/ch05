package ch05;

import java.util.Scanner;

public class Book3Main {
    public static void main(String[] args) {

        Book3 books[] = new Book3[2];

        Scanner scanner = new Scanner(System.in);

        System.out.println("책 2권의 제목과 저자를 각각 입력하세요.");
        for (int i = 0; i < books.length; ++i) {
            System.out.print("제목 : ");
            String title = scanner.nextLine();
            System.out.print("저자 : ");
            String author = scanner.nextLine();

            books[i] = new Book3(title, author);
        }

        System.out.println("-------------------------------------------");
        System.out.println("입력하신 책 목록을 확인하세요.");
        for (int i = 0; i < books.length; ++i) {
            System.out.println(books[i]);
        }

    }
}
