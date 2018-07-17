package cn.lishiwei.learn.lesson_4_sort;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/17.
 * @Description:
 * @Modified By:
 */
public class DirectSelectSort implements BaseSort {

    private Integer[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    @Override
    public Integer[] sort() {

        for (int i = 0; i < array.length; i++) {

            Integer temp = array[i];

            int m = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] <= temp) {
                    temp = array[j];
                    m = j;
                }
            }

            array[m] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
