package uk.sky.loki.starter.threading.starter;

public class WorkItem {

    private final int possiblePrime;

    public WorkItem(int possiblePrime) {
        this.possiblePrime = possiblePrime;
    }

    public int getPossiblePrime() {
        return possiblePrime;
    }

    @Override
    public String toString() {
        return "WorkItem[possiblePrime: " + possiblePrime + "]";
    }
}
