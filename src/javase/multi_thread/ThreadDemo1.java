package javase.multi_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-23 17:12
 */
class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("跟女孩表白" + i);
        }
        return "答应";
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();

        FutureTask<String> ft = new FutureTask<>(mc);

        Thread t1 = new Thread(ft);

        String s = ft.get();

        t1.start();

        System.out.println(s);


    }
}


