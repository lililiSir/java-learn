package cn.lishiwei.learn.lesson_4_sort;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-12-19.
 * @Description:
 * @Modified By:
 */
public class GetMaxAndMin {


    public static void main(String[] args) {

        Integer[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};


        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {


            if (array[i] <= min) {
                min = array[i];
            }

            if (array[i] >= max) {
                max = array[i];
            }

        }

        System.out.println("最小值：" + min + "，最大值:" + max);


        HashMap<String, Integer> map = new HashMap<>();

        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);

        map.get("1");

        for (String key : map.keySet()) {

            System.out.println("key:value" + key + ":" + map.get(key));

        }


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key:value" + entry.getKey() + ":" + entry.getValue());
        }


    }


}
