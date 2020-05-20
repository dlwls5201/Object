package object.chapter12;

import org.junit.Test;

public class 내적동질성 {

    class Worker implements Runnable {
        @Override
        public void run() {
            System.out.println("working");
        }

        public void print() {
            run();
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
        Worker worker = new HardWorker();
        worker.print();
    }
}
