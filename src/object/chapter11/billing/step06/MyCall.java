package object.chapter11.billing.step06;

import java.time.Duration;
import java.time.LocalDateTime;

public class MyCall {
    private LocalDateTime from;
    private LocalDateTime to;

    public MyCall(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public Duration getDuration() {
        return Duration.between(from, to);
    }

    public LocalDateTime getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "Call{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}