package cn.lishiwei.learn;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.Stack;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String result = "{'code':1,data:[{'settlement_num': 'aaaa','status':1},{'settlement_num': 'bbbb','status':2},{'settlement_num': 'cccc','status':3}]}";


        JSONObject jsonObject = JSONObject.fromObject(result);

        JSONArray jsonArray = JSONArray.fromObject(jsonObject.get("data"));


        for (Object object : jsonArray) {
            System.out.println(((JSONObject) object).get("settlement_num").toString() + "," + ((JSONObject) object).get("status").toString());
        }


        System.out.println("Hello World!");

    }
}
