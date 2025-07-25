package javase.multi_thread;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-23 16:52
 */
public class MyThreadDemo{
    public static void main(String[] args) {
        /**
         * test1
         */
//        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread();
//
////        myThread1.run();
//
//        myThread1.start();
//        myThread2.start();

        /**
         * test2
         */

        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my, "坦克");
        Thread t2 = new Thread(my, "飞机");

        // 启动线程
        t1.start();
        t2.start();

    }
}
