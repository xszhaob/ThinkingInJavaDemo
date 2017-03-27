package chapter04;

/**
 * <p>文件名称：CommaOperator.java</p>
 * <p>文件描述：</p>
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 * <p>创建日期：17/3/19</p>
 *
 * @author Bo.Zhao
 * @version 1.0
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 0, j = i + 1; i < 10; i++, j = i + 10) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
