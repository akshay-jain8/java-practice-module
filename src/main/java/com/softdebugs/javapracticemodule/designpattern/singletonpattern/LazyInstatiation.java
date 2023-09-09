package com.softdebugs.javapracticemodule.designpattern.singletonpattern;

public class LazyInstatiation {
    private static LazyInstatiation obj;

    private LazyInstatiation() {
        System.out.println("Instance Created");
    }

    public static LazyInstatiation getInstance() {
        if(obj == null) {
            obj = new LazyInstatiation();
        }
        return obj;
    }
}

class MainClass2 {
    public static void main(String args[]) {
        LazyInstatiation obj = LazyInstatiation.getInstance();
    }
}

class LazyInstantiationMultipleThreads {
    private static LazyInstantiationMultipleThreads obj;

    private LazyInstantiationMultipleThreads() {
        System.out.println("Instance Created");
    }

    public static synchronized LazyInstantiationMultipleThreads getInstance() {
        if(obj == null) {
            obj = new LazyInstantiationMultipleThreads();
        }
        return obj;
    }
}

class MainClass3 {
    public static void main(String args[]) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyInstantiationMultipleThreads obj1 = LazyInstantiationMultipleThreads.getInstance();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyInstantiationMultipleThreads obj2 = LazyInstantiationMultipleThreads.getInstance();
            }
        });

        thread1.start();
        thread2.start();
    }
}

class LazyInstantiationMultipleThreadsDoubleCheckLocking {
    private int i;
    private static LazyInstantiationMultipleThreadsDoubleCheckLocking obj;

    private LazyInstantiationMultipleThreadsDoubleCheckLocking() {
        System.out.println("Instance Created");
    }

    public static LazyInstantiationMultipleThreadsDoubleCheckLocking getInstance() {
        if(obj == null) {
            synchronized (LazyInstantiationMultipleThreadsDoubleCheckLocking.class) {
                if (obj == null) {
                    obj = new LazyInstantiationMultipleThreadsDoubleCheckLocking();
                }
            }
        }
        return obj;
    }
}

class MainClass4 {
    public static void main(String args[]) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyInstantiationMultipleThreadsDoubleCheckLocking obj1 = LazyInstantiationMultipleThreadsDoubleCheckLocking.getInstance();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyInstantiationMultipleThreadsDoubleCheckLocking obj2 = LazyInstantiationMultipleThreadsDoubleCheckLocking.getInstance();
            }
        });

        thread1.start();
        thread2.start();
    }
}