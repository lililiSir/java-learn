package cn.lishiwei.learn.lesson_4_sort;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/17.
 * @Description:
 * @Modified By:
 */
public class BubbleSort implements BaseSort {

    private Integer[] array = {57, 68, 59, 52};

    @Override
    public Integer[] sort() {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Integer temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            System.out.println("第---" + (i + 1) + "---趟排序结果:" + ToStringBuilder.reflectionToString(array));
        }

        return array;
    }

    /**
     * 冒泡排序的两种排序方式
     * @return
     */
    public Integer[] sort2() {
        for (int i = 0; i < array.length; i++) {

            for (int j = array.length - 2; j >= i; j--) {

                if (array[j] > array[j + 1]) {
                    Integer temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            System.out.println("第---" + (i + 1) + "---趟排序结果:" + ToStringBuilder.reflectionToString(array));
        }

        return array;
    }

}
