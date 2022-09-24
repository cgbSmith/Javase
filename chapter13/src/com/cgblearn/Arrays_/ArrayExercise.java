package com.cgblearn.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author cgb
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0]=new Book("红楼梦",100);
        books[1]=new Book("金瓶梅新",50);
        books[2]=new Book("青年文摘20年",5);
        books[3]=new Book("java从入门到放弃",300);
//        Arrays.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book1 = (Book)o1;
//                Book book2 = (Book)o2;
//                double priceVal = book2.getNum()-book1.getNum();
//                if(priceVal>0)return 1;
//                else if(priceVal<0) return -1;
//                else return 0;
//            }
//        });
//        System.out.println(Arrays.toString(books));
//    }

     Arrays.sort(books, new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Book book1 = (Book)o1;
            Book book2 = (Book)o2;
           return book2.getName().length()- book1.getName().length();
        }
    });
        System.out.println(Arrays.toString(books));
}
}
class Book{
    private String name;
    private double num;

    public Book(String name, double num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}