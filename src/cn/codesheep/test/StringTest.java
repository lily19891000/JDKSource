package cn.codesheep.test;

import sun.nio.cs.Surrogate;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String a = "abc";
        System.out.println(a);
        int[]  b = {66,68,91,92,65567};
        String c = new String(b,2,3);
        System.out.println(c);
    }

    private class Stringa {

//        public boolean isEmpty(){
//            return this.value.length == 0
//        }
//
//        public char charAt(int index){
//            if(index <0 || index>=this.value.length){
//                throw new StringIndexOutOfBoundsException(index);
//            }
//            return this.value[index]
//        }
//        private final char value[];

        //        private Stringa(char[] value) {
//            this.value = value;


//        }
//        public Stringa(char value[]) {
//            this.value = Arrays.copyof(value, value.length);
//            //一些操作数组的方法都房Arrays中
//        }

//        public String(int[] codePoints, int offset, int count) {
//            //做一些合法性判断
//            if (offset < 0 || offset > codePoints.length) {
//                throw new StringIndexOutOfBoundsException(offset);
//            }
//            if (count < 0 || count > codePoints.length) {
//                throw new StringIndexOutOfBoundsException(count);
//            }
//            if (count == 0){
//               this.value = "".value;
//            }
//            int end
//        }

    }
}
