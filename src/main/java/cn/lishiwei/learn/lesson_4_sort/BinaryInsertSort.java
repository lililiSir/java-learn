package cn.lishiwei.learn.lesson_4_sort;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/17.
 * @Description:
 * @Modified By:
 */
public class BinaryInsertSort implements BaseSort {

    private Integer[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    @Override
    public Integer[] sort() {

        for (int i = 0; i < this.array.length; i++) {

            //首先取当前值
            Integer temp = array[i];
            //左
            int low = 0;
            //中
            int mid = 0;
            //右
            int high = i - 1;


            while (low <= high) {
                mid = (high + low) / 2;
                if (array[mid] <= temp) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }


            for (int j = i - 1; j >= low; j--) {
                array[j + 1] = array[j];
            }

            // if (low != i)
            array[low] = temp;
        }

        return array;

    }
}
