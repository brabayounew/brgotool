package top.bigz.brgo.demos;

import top.bigz.brgo.tools.ObjectPuChildren;
import top.bigz.brgo.tools.extra.ClassLoaderPu;

public class ObjectPuTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 1, 测试 先出事化属性还是 静态代码块
//        System.out.println(ObjectPuChildren.cf);
        // 2，测试是否静态代码块多次执行
//        ObjectPuChildren objectPuChildren = new ObjectPuChildren();
//        objectPuChildren = null;
//        ObjectPuChildren objectPuChildren2 = new ObjectPuChildren();
////        System.out.println(objectPuChildren2.getLv());

        // 3，加载class多次
//        ObjectPuChildren objectPuChildren = new ObjectPuChildren();
//        System.out.println(objectPuChildren.getClass().getClassLoader().getClass().getName());
//        System.out.println(ObjectPu.class.getClassLoader().getClass().getName());
//        ObjectPuChildren.class.getClassLoader().loadClass("top.bigz.brgo.tools.ObjectPuChildren");
//        Class.forName("top.bigz.brgo.tools.ObjectPuChildren", true, ObjectPuTest.class.getClassLoader());
//        Class.forName("top.bigz.brgo.tools.ObjectPuChildren", true, ObjectPuTest.class.getClassLoader());
        //Class.forName("top.bigz.brgo.tools.ObjectPuChildren");

        // 4，自定义类加载器加载多次
//        ClassLoaderPu classLoaderPu = new ClassLoaderPu("/Users/yangwenbin/Documents/");
//        // classLoaderPu.findClass("top.bigz.brgo.tools.ObjectPuChildren");
//        Class c = classLoaderPu.loadClass("top.bigz.brgo.tools.ObjectPuChildren");
//        Object obj = c.newInstance();
//        System.out.println(c.getClassLoader().toString());
//
//        ObjectPuChildren objectPuChildren = new ObjectPuChildren();

//        ClassLoaderPu classLoaderP2u = new ClassLoaderPu("/Users/yangwenbin/Documents/");
//        // classLoaderPu.findClass("top.bigz.brgo.tools.ObjectPuChildren");
//        Class c2 = classLoaderP2u.loadClass("top.bigz.brgo.tools.ObjectPuChildren");
//        Object obj2 = c2.newInstance();
//        System.out.println(c2.getClassLoader().toString());

    }
}
