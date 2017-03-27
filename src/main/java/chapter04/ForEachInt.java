package chapter04;

import util.Range;
import static util.Print.println;

/**
 * 文件描述：
 *
 * @author Bo.Zhao
 * @version 1.0
 */
public class ForEachInt {
    public static void main(String[] args) {
        for (int i : Range.range(5, 8)) {
            println(i);
        }
    }
}
