package cn.gaohank.program.javase.base.base_08_thread;

public class Thread02Daemon {
    public static void main(String[] args) throws Exception {
        Thread daemon = new Thread(() -> {
            System.out.println("守护线程开始");
//            while (true);
        });

        daemon.setDaemon(true);
        daemon.start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread t2");
            }
            System.out.println(daemon.getState());
        }).start();

        Thread.sleep(2000);

        System.out.println(daemon.getState());
    }
}
