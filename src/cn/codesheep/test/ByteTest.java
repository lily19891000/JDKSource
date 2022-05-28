package cn.codesheep.test;

import sun.applet.Main;

public class ByteTest {

    public static void main(String[] args){
        String a = "121";
//        System.out.println(Byte.parseByte(a,10));//测试parseByte
        System.out.println(Byte.valueOf(a,10)); //测试静态方法valueOf

    }
}
