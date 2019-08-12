package com.lian;


/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.08
 * @apiNote
 **/
public class BookDemo {
    public static void main(String[] args) {
        Book book;

//        Book book1 = null;
//        System.out.println(book1.name);

        book = new Book();
        System.out.println(book.name);
        System.out.println(book.id);
        System.out.println(book.price);

        book = new Book();
        book.name = "鬼吹灯";
        System.out.println(book.name);
        book = new Book();
        book.name = "西游记";
        System.out.println(book.name);


    }
}
