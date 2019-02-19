package uk.sky.loki.starter.threading.tps;

import java.util.LinkedList;
import java.util.Queue;

public class AuditEventController {

    public static void main(String[] args) throws InterruptedException {
        // Create a queue to pass
        Queue<AuditEvent> createdTokens = new LinkedList<>();

        // Start a new background checking thread
        new AuditEventLoggingThread(createdTokens).start();

        while(true) {
            log("Adding new audit event. Current event queue size: " + createdTokens.size());
            createdTokens.add(new AuditEvent());

            // Simulate traffic coming in at random intervals
            Thread.sleep(getDelay(5));
        }
    }

    private static long getDelay(int tps) {
        return 1000 / tps;
    }

    public static void log(String message) {
        System.out.println(String.format("[%s] %s", Thread.currentThread().getName(), message));
    }

}

