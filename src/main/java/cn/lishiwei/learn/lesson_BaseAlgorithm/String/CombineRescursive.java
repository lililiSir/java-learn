package cn.lishiwei.learn.lesson_BaseAlgorithm.String;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-12-20.
 * @Description: 输出所有的字符串组合
 * @Modified By:
 */
public class CombineRescursive {


    public void CombineRescursiveImpl(char[] c) {

        if (c == null) {
            return;
        }

        int len = c.length;
        boolean[] used = new boolean[len];
        char[] cache = new char[len];

        int result = len;

        while (true) {
            int index = 0;

            while (used[index]) {
                used[index] = false;
                ++result;
                if (++index == len) {
                    return;
                }
            }
            used[index] = true;
            cache[--result] = c[index];
            System.out.println(java.lang.String.valueOf(cache).substring(result) + " ");

        }

    }

}
