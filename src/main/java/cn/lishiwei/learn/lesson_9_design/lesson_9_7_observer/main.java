package cn.lishiwei.learn.lesson_9_design.lesson_9_7_observer;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-10-16.
 * @Description: 观察者模式
 * @Modified By:
 */
public class main {


    public static void main(String[] args) {

        // Subject subject = new Subject();
        //
        // new BinaryObserver(subject);
        // new OctalObserver(subject);
        // // subject.addObserver(observer);
        //
        //
        // subject.setState(2);

        int[] nums = new int[]{3, 2, 4};

        String result="121323213";

        System.out.println(result.charAt(0));

        Integer temp=1;
        temp.toString().length();

        Long r=temp.longValue();

        System.out.println(twoSum(nums, 6));

        List<Integer> list=new ArrayList<>(0);

        list.add(0);
        list.add(1);

    }

    public static int[] twoSum(int[] nums, int target) {

        int i = 0;
        int value = 0;
        Set<Integer> numSet = new HashSet<Integer>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        while (i < nums.length) {
            int temp = target - nums[i];
            if (numSet.contains(temp) && temp != nums[i]) {
                value = temp;
                break;
            }
            i++;
        }
        int j = 0;
        for (j = 0; j < nums.length; j++) {
            if (nums[j] == value) {
                break;
            }
        }

        if (i != j) {
            return new int[]{i, j};
        } else {
            return null;
        }

    }

}
