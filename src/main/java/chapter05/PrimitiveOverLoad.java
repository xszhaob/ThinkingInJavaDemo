package chapter05;

import static util.Print.println;
/**
 * 文件描述：
 *
 * @author Bo.Zhao
 * @version 1.0
 */
public class PrimitiveOverLoad {
    public static void main(String[] args) {
        PrimitiveOverLoad overLoad = new PrimitiveOverLoad();
        overLoad.print(1);
    }

    private void print(Integer i) {
        println("print integer" + i);
    }

    /*private void print(int i) {
        println("print int " + i);
    }*/

    private void print(long i) {
        println("print long " + i);
    }
}
