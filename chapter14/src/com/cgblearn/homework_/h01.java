package com.cgblearn.homework_;

import java.util.ArrayList;

/**
 * @author cgb
 * @version 1.0
 */
public class h01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("打了打时空大连大健康大空间的连接地区哈师大会稍等哈顺德区把㐇奶器"));
        int size = arrayList.size();
        for (int i = size-1; i>=0;i--) {
//            System.out.println(arrayList.get(i));
            News news = (News)arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
    }

    public static String processTitle(String title){
        if(title == null){
            return " ";
        }
        if(title.length()>15){
            return title.substring(0,15)+"...";
        }else{
            return title;
        }
    }
}

class News{
    private String title;
    private String content;

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(String title) {
        this.title = title;

    }
}
