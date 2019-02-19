package uk.sky.loki.starter.threading.starter;

import java.util.LinkedList;
import java.util.Queue;

public class WorkProducer {

    public static void main(String[] args) throws Exception {

        Queue<WorkItem> workItems = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            new WorkerThread(workItems).start();
        }

        int lastPrime = 1;
        while(true) {
            workItems.add(new WorkItem(lastPrime++));
            Thread.sleep(1000);
        }
    }

}
