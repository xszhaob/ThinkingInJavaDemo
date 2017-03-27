package chapter10;

/**
 * author:xszhaobo
 * <p/>
 * date:2017/3/27
 * <p/>
 * package_name:chapter10
 * <p/>
 * project: ThinkingInJavaDemo
 * 内部类了解外部类，并且能与之通信；而且使用内部类可以写出的代码更加优雅而清晰。
 */
public class Sequence {

    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object o) {
        if (next < items.length) {
            items[next++] = o;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    private class SequenceSelector implements Selector {
        private int i;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }
}


interface Selector {
    boolean end();

    Object current();

    void next();
}
