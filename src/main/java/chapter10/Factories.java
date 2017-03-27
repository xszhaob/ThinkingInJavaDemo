package chapter10;

import java.io.Serializable;

/**
 * author:xszhaobo
 * <p/>
 * date:2017/3/27
 * <p/>
 * package_name:chapter10
 * <p/>
 * project: ThinkingInJavaDemo
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}

interface ServiceFactory {
    Service getService();
}


interface Service {
    void method1();

    void method2();
}

class Implementation1 implements Service {
    private Implementation1() {
    }

    public void method1() {
        System.out.println("Implementation1 method1...");
    }

    public void method2() {
        System.out.println("Implementation1 method2...");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service {
    private Implementation2() {

    }

    public void method1() {
        System.out.println("Implementation2 method1...");
    }

    public void method2() {
        System.out.println("Implementation2 method2...");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation2();
        }
    };
}
