package cn.lishiwei.learn.lesson_BaseAlgorithm.String;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-12-20.
 * @Description:
 * @Modified By:
 */
public class AppMain {

    public static void main(String[] args) {

        String string = "abc";

        CombineRescursive combineRescursive = new CombineRescursive();
        combineRescursive.CombineRescursiveImpl(string.toCharArray());


    }

}
