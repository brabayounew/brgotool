package top.bigz.brgo.demos;

import top.bigz.brgo.tools.JsonPu;

public class JsonPuTest {

    public static void main(String[] args) {
        // test for
        // top.bigz.brgo.tools.JsonPu.combineJson
        // start ---------------------------------------------------------------------------------
        // source :  {"a":"aaa","b":"bbb","c":"ccc","t1":"t111","t2":"222","t3":"t333"}
        String sourceJsonStr = "{\"a\":\"aaa\",\"b\":\"bbb\",\"c\":\"ccc\",\"t1\":\"t111\",\"t2\":\"222\",\"t3\":\"t333\"}";
        // model : {"name":"a","school":"b","telnumberList":["t1","t2","t3"]}
        // means : name use the value of key "a" ~  and so on
        String modelJsonStr = "{\"name\":\"a\",\"school\":\"b\",\"telnumberList\":[\"t1\",\"t2\",\"t3\"]}";
        String resultStr = JsonPu.combineJson(sourceJsonStr, modelJsonStr);
        System.out.println(resultStr);
        // print :  {"school":"bbb","name":"aaa","telnumberList":["t111","222","t333"]}
        // end   ---------------------------------------------------------------------------------
    }
}
