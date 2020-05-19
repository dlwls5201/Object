package object.chapter12;

import org.junit.Test;

public class 내적동질성 {

    @Test
    public void 트() {
        Worker worker = new HardWorker();
        worker.print();
    }

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
}
