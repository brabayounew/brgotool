package top.bigz.brgo.tools;

/**
 * 包含Array 相关的各种工具方法
 *
 * @author yangwenbin
 */
public class ArrayPu {

    /**
     * 将 inArray 按照 size 分隔成固定长度的 数组
     * 并将它们组成一个新的数组
     * 如果最后剩余部分不足以组成一个size 长度 那么它们单独组成一个区块
     * <p>
     * chunk(['a', 'b', 'c', 'd'], 3) => [['a', 'b', 'c'], ['d']]
     *
     * @param inArray 待处理的数组
     * @param size    区块长度
     * @return 组成的新区块
     * @author yangwenbin
     */
    public static Object[] chunk(Object[] inArray, int size) {
        Object[] tempArray = new Object[inArray.length <= size ? 1 : (inArray.length / size + (inArray.length % size == 0 ? 0 : 1))];
        if (inArray == null || inArray.length <= size || inArray.length == 0) {
            tempArray[0] = inArray;
            return tempArray;
        }
        //        使用 系统方法
        //        src：源数组
        //        srcPos：开始复制的位置，从源数组哪个位置开始复制
        //        dest：目的数组
        //        descPos：将源数组复制到目标数组的起始位置
        //        length：复制多少个源数组中的元素个数
        for (int i = 0, j = 0; i < inArray.length; j++) {
            int copyCount = size;
            if (inArray.length < (j + 1) * size) {
                copyCount = inArray.length % size;
            }
            tempArray[j] = new Object[copyCount];
            System.arraycopy(inArray, i, tempArray[j], 0, copyCount);
            i += size;
        }
        return tempArray;
    }
}
