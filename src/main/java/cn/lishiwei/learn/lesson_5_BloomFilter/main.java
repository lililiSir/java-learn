package cn.lishiwei.learn.lesson_5_BloomFilter;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/23.
 * @Description:
 * @Modified By:
 */
public class main {

    public static void main(String[] args) {
        String[] urls = new String[]{"www.example.com", "www.renren.com", "www.baidu.com", "www.baidu.com"};  //测试数据
        BloomFilter filter = new BloomFilter();
        for (String value : urls) {
            value = value.trim();
            System.out.println("filter.contains(" + value + "):" + filter.contains(value));
            filter.addValue(value);
            System.out.println("filter.add(" + value + "):" + filter.contains(value));
            System.out.println("----------------------------------------------------");
        }
    }

}
