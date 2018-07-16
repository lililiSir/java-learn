package cn.lishiwei.learn.lesson_4_sort;

public class main {


    public static void main(String[] args) {


        Integer[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};


        InsertDirect insertDirect = new InsertDirect();

        insertDirect.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
