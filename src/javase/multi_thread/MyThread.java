package javase.multi_thread;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-23 16:48
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

