package cn.lishiwei.learn.lesson_4_sort;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/18.
 * @Description:
 * @Modified By:
 */
public class MegerSort implements BaseSort {

    private Integer[] array = {57,68,59,52,72,28,96,33};

    @Override
    public Integer[] sort() {

        divide(array, 0, array.length - 1);
        return array;
    }

    /**
     * 先通过迭代的方式，将数组分为左右两部分，最后合并
     *
     * @param array
     * @param low
     * @param high
     */
    public Integer[] divide(Integer[] array, int low, int high) {

        int mid = (high + low) / 2;


        if (low >= high) {
            return array;
        }

        //向左右递归，并找到
        divide(array, low, mid);
        divide(array, mid + 1, high);
        meger(array, low, mid, high);
        return array;
    }


    public void meger(Integer[] array, int low, int mid, int high) {

        Integer[] tempArray = new Integer[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {

            if (array[i] < array[j]) {
                tempArray[k++] = array[i++];
            } else {
                tempArray[k++] = array[j++];
            }
        }

        while (i <= mid) {
            tempArray[k++] = array[i++];
        }

        while (j <= high) {
            tempArray[k++] = array[j++];
        }

        for (int n = 0; n < tempArray.length; n++) {
            array[n + low] = tempArray[n];
        }

        System.out.println("归并排序" + ToStringBuilder.reflectionToString(array));
    }

}
