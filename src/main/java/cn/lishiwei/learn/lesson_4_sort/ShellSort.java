package cn.lishiwei.learn.lesson_4_sort;


/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/17.
 * @Description:
 * @Modified By:
 */
public class ShellSort implements BaseSort {

    private Integer[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    @Override
    public Integer[] sort() {


        int d = array.length;

        while (true) {

            d = d / 2;

            for (int x = 0; x < d; x++) {

                for (int i = x + d; i < array.length; i = i + d) {
                    Integer temp = array[i];
                    int j = 0;

                    for (j = i - d; j >= 0 && array[j] > temp; j = j - d) {
                        array[j + d] = array[j];
                    }
                    array[j + d] = temp;
                }
            }

            if (d == 1) {
                break;
            }
        }


        return array;
    }
}
