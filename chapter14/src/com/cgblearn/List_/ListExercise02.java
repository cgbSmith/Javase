package com.cgblearn.List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cgb
 * @version 1.0
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦","曹雪芹",100));
        list.add(new Book("西游记","吴承恩",10));
        list.add(new Book("水浒传","施耐庵",19));
        list.add(new Book("三国","罗贯中",80));
        for (Object o : list) {
            System.out.println(o);
        }
        //冒泡排序
        sort(list);
        System.out.println("====afrer sorting====");
        for (Object o :list) {
            System.out.println(o);
        }

    }

    public static void sort(List list){
        for (int i =0 ;i< list.size()-1;i++){
            for(int j=0;j< list.size()-1-i;j++){
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if(book1.getPrice()> book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }

            }
        }
    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称: "+name+"\t \t价格: "+price+"\t \t作者:"+author;
    }
}
