package cn.gaohank.program.javase.base.base_08_thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Thread10Schedule {
    public static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("executor test");
        }
    }

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(new MyThread(), 1, 1, TimeUnit.SECONDS);
    }
}
