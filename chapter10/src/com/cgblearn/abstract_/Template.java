package com.cgblearn.abstract_;

abstract public class Template {
    public abstract void job();
    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();//动态绑定机制，取决于对象的运行类型
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间 "+(end-start));
    }
}
