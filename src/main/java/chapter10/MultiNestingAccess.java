package chapter10;

/**
 * 一个内部类被嵌套多少层并不重要--它能透明地访问所有它所嵌入的外围类的所有成员。
 */
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A a = mna.new A();
        MNA.A.B b = a.new B();
        b.h();
    }
}

class MNA {
    private void f() {
        System.out.println("f();");
    }

    class A {
        private void g() {
            System.out.println("g();");
        }

        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}
