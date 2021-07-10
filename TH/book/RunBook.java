package bai5_AcessModifier.TH.book;

import java.util.Scanner;

public class RunBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        System.out.println(" Nhập số lượng sách  :");
        int n = sc.nextInt();
        Book[] arrBook;
        arrBook = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Thông tin của cuốn sách " +(i+1) +": \n");
            System.out.println(" Nhập mã sách :  ");
            int bookCode = sc.nextInt();
            System.out.println(" Nhập tên sách : ");
            String name = scString.nextLine();
            System.out.println(" Nhập giá tiền của sách : ");
            int price = sc.nextInt();
            System.out.println(" Nhập tên tác giả : ");
            String author = scString.nextLine();
            arrBook[i] = new Book(bookCode,name,price,author);
        }
        for (Book book: arrBook
             ) {
            System.out.println(book.getBookCode()+" "+
                    book.getName()+" "+
                    book.getPrice()+" "+
                    book.getAuthor());
        }
        Book b = new Book();
        System.out.println(" Nhập tên cuốn sách muốn tìm kiếm :");
        String name = scString.nextLine();
        System.out.println(b.searchBook(arrBook, name));
        System.out.println(" Nhập số tiền của cuốn sách muốn tìm kiếm ");
        int price = sc.nextInt();
        System.out.println(b.searchPrice(arrBook,price));
        System.out.println(" Ấn 1 để xem tổng giá tiền của các cuốn sách ");
        sc.nextInt();
        System.out.println(" Tổng số tiền của các cuốn sách là :  "+ b.totalPrice(arrBook));

    }

}
