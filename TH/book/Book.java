package bai5_AcessModifier.TH.book;

import java.util.Scanner;

public class Book {
    public int bookCode;
    public String name;
    public int price;
    public String author;

    public Book() {
    }

    public Book(int bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String showInforBook() {
        return ", Có thông tin sách :  BookCode : " + bookCode +
                " , Name : " + name +
                " , Price : " + price +
                " , Author : " + author;
    }

    public String searchBook(Book[] arr, String name) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].name)) {
                index = i;
                break;
            }
        }
        if (index != -1) return " Đã tìm thấy sách " + arr[index].getName() + arr[index].showInforBook();
        else return " Không tìm thấy sách ";

    }

    public String searchPrice(Book[] arr, int price) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].price == price) {
                index = i;
                break;
            }
        }
        if (index != -1) return " Đã tìm thấy sách " + arr[index].getName()  + arr[index].showInforBook();
        else return " Không tìm thấy sách ";
    }
    public int totalPrice (Book [] arr){
        int totalPrice = 0;
        for (int i = 0; i < arr.length; i++) {
            totalPrice += arr[i].price;
        }
        return totalPrice;
    }


}
