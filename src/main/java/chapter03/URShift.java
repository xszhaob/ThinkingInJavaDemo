package chapter03;

import static util.Print.println;
/**
 * <p>文件名称：URShift.java</p>
 * <p>文件描述：</p>
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 * <p>创建日期：17/3/19</p>
 *
 * @author Bo.Zhao
 * @version 1.0
 */
public class URShift {
    public static void main(String[] args) {
        int i = -1;
        println(Integer.toBinaryString(i));
        i >>= 3;
        println(i);
        long l = -1;
        println(Long.toBinaryString(l));
    }
}
