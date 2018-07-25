package cn.lishiwei.learn.lesson_4_sort;

import javafx.scene.effect.Bloom;

public class main {

    //varnish+nginx

    public static void main(String[] args) {


        Integer[] array;

        BaseSort baseSort;
        baseSort = new InsertDirect();
        array = baseSort.sort();

        System.out.println("-------直接插入排序---------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("\n\n");

        baseSort = new BinaryInsertSort();
        array = baseSort.sort();
        System.out.println("-------二分插入排序---------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("\n\n");

        baseSort = new ShellSort();
        array = baseSort.sort();
        System.out.println("-------希尔排序---------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("\n\n");

        baseSort = new DirectSelectSort();
        array = baseSort.sort();
        System.out.println("-------直接选择排序---------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("\n\n");

        baseSort = new BubbleSort();
        array = baseSort.sort();
        System.out.println("-------冒泡排序---------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("\n\n");


        baseSort = new QuickSort();
        array = baseSort.sort();
        System.out.println("-------快速排序---------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("\n\n");

        baseSort = new MegerSort();
        array = baseSort.sort();
        System.out.println("-------归并排序---------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("\n\n");


    }

}
