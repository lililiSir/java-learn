package cn.lishiwei.learn.lesson_4_sort;


/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/17.
 * @Description:
 * @Modified By:
 */
public class QuickSort implements BaseSort {

    private Integer[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    @Override
    public Integer[] sort() {

        quickSort(array, 0, array.length - 1);

        return array;
    }


    private void quickSort(Integer[] array, int low, int high) {

        if (low > high) {
            return;
        }

        int middle = middle(array, low, high);
        quickSort(array, 0, middle - 1);
        quickSort(array, middle + 1, high);
    }


    private int middle(Integer[] array, int low, int high) {

        //以第一个元素为基准，通过不断地最大最小交换，可以将基准调整到最后的位置
        Integer temp = array[low];

        while (low < high) {

            while (low < high && array[high] >= temp) {
                high--;
            }

            array[low] = array[high];

            while (low < high && array[low] < temp) {
                low++;
            }

            array[high] = array[low];
        }

        array[low] = temp;

        return low;
    }

}
