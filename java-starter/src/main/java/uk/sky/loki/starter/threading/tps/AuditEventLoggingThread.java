package uk.sky.loki.starter.threading.tps;

import java.util.Queue;

public class AuditEventLoggingThread extends Thread {

    private final Queue<AuditEvent> createdTokens;

    public AuditEventLoggingThread(Queue<AuditEvent> createdTokens) {
        this.createdTokens = createdTokens;
    }

    public void run() {
        while(true) {
            if (createdTokens.peek() != null) {
                AuditEvent auditEvent = createdTokens.poll();
                save(auditEvent.getGeneratedToken());
            }
        }
    }

    private void save(String message) {
        try {
            // Simulate some delay when logging/saving
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AuditEventController.log("Saving message for token: " + message);
    }

}
