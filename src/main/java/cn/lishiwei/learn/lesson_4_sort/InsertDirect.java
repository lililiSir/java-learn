package cn.lishiwei.learn.lesson_4_sort;

/**
 * 插入排序的原理：每次保证序列前面的元素是有序的，并将待排序的元素，插入到已经排序号的序列里面
 * 交换排序：两个元素进行比较，并交换位置，最后大的元素会在序列的最后
 */
public class InsertDirect implements BaseSort {

    private Integer[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    /**
     * 直接插入排序
     */
    public Integer[] sort() {

        for (int i = 1; i < array.length; i++) {

            Integer temp = array[i];

            int j = 0;

            for (j = i - 1; j >= 0; j--) {

                if (array[j] > temp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            //为什么要变为j+1,是因为一旦执行交换后，还要再做一次j--，然后判断大小，并break;
            array[j + 1] = temp;
        }

        return array;
    }


}
