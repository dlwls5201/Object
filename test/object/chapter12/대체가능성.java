package object.chapter12;

import org.junit.Test;

public class 대체가능성 {

    class Worker implements Runnable {
        @Override
        public void run() {
            System.out.println("working");
        }
    }

    class HardWorker extends Worker {
        @Override
        public void run() {
            System.out.println("HardWorker");
        }
    }

    @Test
    public void 테스트() {
        Runnable worker = new Worker();
        worker.run();

        worker = new HardWorker();
        worker.run();
    }
}
