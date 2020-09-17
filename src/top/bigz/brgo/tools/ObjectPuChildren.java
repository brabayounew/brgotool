package top.bigz.brgo.tools;

public class ObjectPuChildren extends ObjectPu {

    public static String lv = "init";
    static {
        System.out.println(lv);
        System.out.println("init myselft");
        lv = "init by myselft";


    }


    public static String getLv() {
        return lv;
    }

    public static void setLv(String lv) {
        ObjectPuChildren.lv = lv;
    }
}
