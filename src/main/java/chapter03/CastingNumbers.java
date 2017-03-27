package chapter03;

import static util.Print.println;
/**
 * <p>文件名称：CastingNumbers.java</p>
 * <p>文件描述：</p>
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 * <p>创建日期：17/3/19</p>
 *
 * @author Bo.Zhao
 * @version 1.0
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7;
        println(above);
        println(Math.round(above));

        double halfDown = 0.4;
        println(Math.round(halfDown));
    }
}
