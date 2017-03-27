package util;

/**
 * 文件描述：
 *
 * @author Bo.Zhao
 * @version 1.0
 */
public class Range {
    public static int[] range(int beginIndex, int endIndex) {
        if (beginIndex > endIndex) {
            return new int[0];
        }
        if (beginIndex == endIndex) {
            return new int[]{beginIndex};
        }
        int[] arr = new int[(endIndex - beginIndex + 1)];
        for (int i = beginIndex, j = 0; i <= endIndex; i++, j++) {
            arr[j] = i;
        }
        return arr;
    }
}
