package chapter04;

import static util.Print.println;
/**
 * <p>文件名称：ListCharacters.java</p>
 * <p>文件描述：</p>
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 * <p>创建日期：17/3/19</p>
 *
 * @author Bo.Zhao
 * @version 1.0
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c)) {
                println("value:" + (int)c + ";character:" + c);
            }
        }
    }
}
