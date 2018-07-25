package cn.lishiwei.learn.lesson_6_KMP;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/24.
 * @Description:
 * @Modified By:
 */
public class main {


    public static void main(String[] args) {

        kmp kmp = new kmp();

        String sStr = "bbc abcdab abcdabcdabde";
        String dStr = "abcdabd";

        Integer[] next = new Integer[dStr.length() + 1];

        System.out.println("模式串的初始位置为：" + kmp.getIndex(sStr, dStr, next));

    }

}
