package javase.multi_thread;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-23 16:55
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" +  i);
        }
    }
}
