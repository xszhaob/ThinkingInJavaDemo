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
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Contents contents = parcel4.contents();
        Destination destination = parcel4.destination("Hello");
        System.out.println(contents.value());
        System.out.println(destination.readLabel());
    }
}

class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String label) {
            this.label = label;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}
