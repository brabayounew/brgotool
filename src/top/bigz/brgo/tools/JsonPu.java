package top.bigz.brgo.tools;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Set;

/**
 * 包含json 相关的各种工具方法
 *
 * @author yangwenbin
 * @date 2019-10-17 09:29:11
 */
public class JsonPu {

    /**
     * 去掉 value 值为空的  键值对
     *
     * @param sourceJsonStr
     * @return
     */
    public static String filterNullValue(String sourceJsonStr) {
        return "";
    }

    /**
     * 合并json
     * 以 sourceJsonStr 为源数据， modelJsonStr 为解析模板， 合成结果json
     *
     * @param sourceJsonStr
     * @param modelJsonStr
     * @return
     * @author yangwenbin
     * @date 2019-10-17 15:52:37
     */
    public static String combineJson(String sourceJsonStr, String modelJsonStr) {
        // 只支持 key value 格式的 作为字典源数据
        JSONObject sourceJson = JSON.parseObject(sourceJsonStr);
        Object needFilledObject = JSON.parse(modelJsonStr);
        // 循环从字典数据中取值
        fillDataForCombineJson(needFilledObject, sourceJson);
        // 转成字符串返回
        return JSON.toJSONString(needFilledObject);
    }

    private static void fillDataForCombineJson(Object needFilledObject, JSONObject sourceJson) {
        if (needFilledObject instanceof JSONObject) {
            // 迭代一个json对象
            Set<String> keys = ((JSONObject) needFilledObject).keySet();
            if (keys != null && keys.size() > 0) {
                for (String key : keys) {
                    if (((JSONObject) needFilledObject).get(key) instanceof String) {
                        String dataKey = (String) ((JSONObject) needFilledObject).get(key);
                        if (sourceJson != null && sourceJson.containsKey(dataKey)) {
                            ((JSONObject) needFilledObject).put(key, sourceJson.get(dataKey));
                        }
                        continue;
                    }
                    fillDataForCombineJson(((JSONObject) needFilledObject).get(key), sourceJson);
                }
            }
        } else if (needFilledObject instanceof JSONArray) {
            // 迭代一个json数组对象
            if (needFilledObject != null && ((JSONArray) needFilledObject).size() > 0) {
                for (int i = 0; i < ((JSONArray) needFilledObject).size(); i++) {
                    Object jsonArrayObject = ((JSONArray) needFilledObject).get(i);
                    if (jsonArrayObject instanceof String) {
                        String dataKey = (String) jsonArrayObject;
                        if (sourceJson != null && sourceJson.containsKey(dataKey)) {
                            ((JSONArray) needFilledObject).set(i, sourceJson.get(dataKey));
                        }
                        continue;
                    }
                    fillDataForCombineJson(jsonArrayObject, sourceJson);
                }
            }
        }
    }
}
