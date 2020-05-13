package object.chapter11.billing.step06;

import object.chapter11.money.Money;

import java.time.Duration;

//extend Plan <-> implements Calculator
public class RegularPlan implements Calculator {
    private final Money amount;
    private final Duration seconds;

    public RegularPlan(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    public Money calcCallFee(MyCall myCall) {
        return amount.times(myCall.getDuration().getSeconds() / seconds.getSeconds());
    }
}