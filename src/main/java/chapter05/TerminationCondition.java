package chapter05;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件描述：
 *
 * @author Bo.Zhao
 * @version 1.0
 */
public class TerminationCondition {

    public static void main(String[] args) {
        Book aBook = new TerminationCondition().new Book(true);
        aBook.checkIn();

        new TerminationCondition().new Book(true);
        System.gc();

        List<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            aList.add(i);
        }
        System.gc();
    }

    class Book {
        boolean checkOut = false;

        Book (boolean checkOut) {
            this.checkOut = checkOut;
        }

        public void checkIn() {
            this.checkOut = false;
        }

        @Override
        protected void finalize() throws Throwable {
            if (this.checkOut) {
                System.out.println("Error: Check out");
            }
            super.finalize();
        }
    }
}
