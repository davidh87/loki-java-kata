package uk.sky.loki.starter.threading.tps;

import java.util.Random;

public class AuditEvent {

    private final String generatedToken;

    public AuditEvent() {
        this.generatedToken = "RandomToken: " + new Random().nextInt();
    }

    public String getGeneratedToken() {
        return generatedToken;
    }

}
