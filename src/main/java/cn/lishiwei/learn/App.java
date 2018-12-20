package cn.lishiwei.learn;


import com.sun.deploy.net.proxy.DynamicProxyManager;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

        // String result = "{'code':1,data:[{'settlement_num': 'aaaa','status':1},{'settlement_num': 'bbbb','status':2},{'settlement_num': 'cccc','status':3}]}";
        //
        //
        // JSONObject jsonObject = JSONObject.fromObject(result);
        //
        // JSONArray jsonArray = JSONArray.fromObject(jsonObject.get("data"));
        //
        //
        // for (Object object : jsonArray) {
        //     System.out.println(((JSONObject) object).get("settlement_num").toString() + "," + ((JSONObject) object).get("status").toString());
        // }
        //
        //
        // System.out.println("Hello World!");


        //读取文件
        String filePath = "C:\\Users\\Administrator\\Desktop\\1214461.txt";
        File file = new File(filePath);

        InputStream stream = new FileInputStream(file);

        BufferedReader input = new BufferedReader(new InputStreamReader(stream));

        String line = null;
        List<String> appIds = new ArrayList<>();
        while ((line = input.readLine()) != null) {
            appIds.add(line.trim());
        }

        System.out.println(StringUtils.join(appIds.toArray(), ","));

    }
}
