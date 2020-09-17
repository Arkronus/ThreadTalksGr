public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        ThreadGroup tg = new ThreadGroup("group1");

        final int threadCount = 4;
        MyThread[] threads = new MyThread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new MyThread(tg, Integer.toString(i));
            threads[i].start();
        }

        Thread.sleep(15000);
        tg.interrupt();
        System.out.println("Завершаю все потоки");

    }
}
