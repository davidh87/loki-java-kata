package uk.sky.loki.starter.threading.starter;

import java.util.Queue;

public class WorkerThread extends Thread {

    private final Queue<WorkItem> workItemsQueue;

    public WorkerThread(Queue<WorkItem> workItemsQueue) {
        this.workItemsQueue = workItemsQueue;
    }

    @Override
    public void run() {
        while (true) {

            WorkItem workItem;

            synchronized(workItemsQueue) {
                workItem = workItemsQueue.poll();
            }

            if (workItem != null) {

                if (PrimeNumberCalculator.isPrime(workItem.getPossiblePrime())) {
                    System.out.println(workItem.getPossiblePrime() + " is prime");
                } else {
//                    System.out.println(workItem.getPossiblePrime() + " is NOT prime");
                }
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
