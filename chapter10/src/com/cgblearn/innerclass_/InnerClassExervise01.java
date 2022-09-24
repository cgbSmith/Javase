package com.cgblearn.innerclass_;

import com.cgblearn.abstract_.AA;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class InnerClassExervise01 {
    public static void main(String[] args) {
        //内部类方法实现参数传递
    f1(new IL() {
        @Override
        public void show() {
            System.out.println("show从写");
        }
    });
    //传统方式
    f1(new Picture());

    }
    public static void f1(IL il){
        il.show();
    }

}
interface IL{
    void show();
}
class Picture implements IL{
    @Override
    public void show() {
        System.out.println("类方法实现接口");
    }
}
