package chapter10;

/**
 * author:xszhaobo
 * <p/>
 * date:2017/3/27
 * <p/>
 * package_name:chapter10
 * <p/>
 * project: ThinkingInJavaDemo
 */
public class SequenceTest {
    public static final int SIZE = 10;
    public static void main(String[] args) {
        Sequence sequence = new Sequence(SIZE);
        for (int i = 0; i < SIZE; i++) {
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
