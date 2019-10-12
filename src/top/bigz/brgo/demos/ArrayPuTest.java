package top.bigz.brgo.demos;

import top.bigz.brgo.tools.ArrayPu;

import java.util.Arrays;

public class ArrayPuTest {
    public static void main(String[] args) {
        // test for
        // top.bigz.brgo.tools.ArrayPu.chunk
        // start ---------------------------------------------------------------------------------
        String[] chunkTest = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"};
        for (Object chunkObjTest : ArrayPu.chunk(chunkTest, 3)) {
            System.out.println(Arrays.toString((Object[]) chunkObjTest));
        }
        // end   ---------------------------------------------------------------------------------
    }
}
