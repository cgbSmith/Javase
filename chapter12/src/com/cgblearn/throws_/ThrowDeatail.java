package com.cgblearn.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author cgb
 * @version 1.0
 */
public class ThrowDeatail {
    public static void main(String[] args) {
    }
    public static void f1()  {

        try {
            f3();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://das");
        //编译异常没有默认处理机制，必须要显示地处理
    }
    public static void f4(){
        f5();
        //运行异常有默认处理机制
    }
    public static void f5() throws ArithmeticException{}


}
class Father{
    public void method() throws RuntimeException{}
}

class Son extends Father{
    @Override
    public void method() throws NullPointerException {
    }
}