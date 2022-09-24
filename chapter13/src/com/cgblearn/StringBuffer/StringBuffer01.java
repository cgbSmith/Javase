package com.cgblearn.StringBuffer;

/**
 * @author cgb
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        String string = "hello world";
        String string1 = "bello world";

        StringBuffer sb = new StringBuffer(string);//1
//        StringBuffer sb1 = new StringBuffer(string);
        sb.append(string1);//2
        System.out.println(sb);
        StringBuffer stringBuffer = new StringBuffer("hello");//1
        String s = stringBuffer.toString();//2
        String s1 = new String(stringBuffer);//3

        StringBuffer z = new StringBuffer("zzttllz");
        System.out.println(z.indexOf("tll"));
//        String str = null;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hellostringbuild");
        System.out.println(stringBuilder);
    }
}
