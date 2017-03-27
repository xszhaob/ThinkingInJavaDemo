package chapter05;

/**
 * 文件描述：
 * 在构造器中，尽管可以使用this调用一个构造器，但是却不能调用两个。
 * 此外，必须将构造器置顶，否则将会产生编译错误。
 *
 * @author Bo.Zhao
 * @version 1.0
 */
public class Flower {
    private int petalCount;
    private String s;

    public Flower(String s) {
        this.s = s;
    }

    public Flower(int petals) {
        this.petalCount = petals;
    }

    public Flower(String s, int petals) {
        this(s);
        this.petalCount = petals;
    }
}
