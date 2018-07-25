package cn.lishiwei.learn.lesson_6_KMP;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/24.
 * @Description:
 * @Modified By:
 */
public class kmp {


    private Integer[] getNext(String str, Integer[] next) {

        int len = str.length();
        int i = 0;
        int j = -1;
        next[0] = -1;

        while (i < len) {
            if (j == -1 || str.charAt(i) == str.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }

        return next;
    }


    public int getIndex(String sStr, String dStr, Integer[] next) {

        next = getNext(dStr, next);

        int i = 0;
        int j = 0;
        int s_len = sStr.length();
        int d_len = dStr.length();

        while (i < s_len && j < d_len) {

            if (j == -1 || sStr.charAt(i) == dStr.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }


        if (j == d_len) {
            return i - j;
        }

        return -1;
    }
}
