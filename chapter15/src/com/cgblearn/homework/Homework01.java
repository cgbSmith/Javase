package com.cgblearn.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author cgb
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> dao = new DAO<>();
        dao.save("01",new User(1,10,"jack1"));
        dao.save("02",new User(2,20,"jack2"));
        dao.save("03",new User(3,30,"jack3"));
        List<User> list = dao.list();
        System.out.println("list="+list);

    }
}

class DAO<T>{
    private Map<String,T> map =  new HashMap<>();
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T>list(){
        ArrayList<T> list = new ArrayList<>();
        Set<String> strings = map.keySet();
        for (String s : strings) {
            list.add(get(s));
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
    public void save(String id, T entity){
        map.put(id,entity);
    }
}

class User{
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}