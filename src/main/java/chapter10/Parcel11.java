package chapter10;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * author:xszhaobo
 * <p/>
 * date:2017/3/30
 * <p/>
 * package_name:chapter10
 * <p/>
 * project: ThinkingInJavaDemo
 */
public class Parcel11 {

    private static class ParceContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }


    protected static class ParceDestination implements Destination {
        private String label;

        public ParceDestination(String whereTo) {
            this.label = whereTo;
        }

        public String readLabel() {
            return label;
        }

        public static void f() {
        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParceDestination(s);
    }

    public static Contents contents() {
        return new ParceContents();
    }

    public static void main(String[] args) {
        Contents contents = contents();
        Destination destination = destination("Tasmania");
        System.out.println(contents.value());
        System.out.println(destination.readLabel());
    }
}
