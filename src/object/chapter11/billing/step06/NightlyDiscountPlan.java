
package object.chapter11.billing.step06;

import object.chapter11.money.Money;

import java.time.Duration;

public class NightlyDiscountPlan implements Calculator {
    private static final int LATE_NIGHT_HOUR = 22;

    private final Money nightlyAmount;
    private final Money regularAmount;
    private final Duration seconds;

    public NightlyDiscountPlan(Money nightlyAmount, Money regularAmount, Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    @Override
    public Money calcCallFee(MyCall myCall) {
        Money price = myCall.getFrom().getHour() >= LATE_NIGHT_HOUR ? nightlyAmount : regularAmount;
        return price.times(myCall.getDuration().getSeconds() / seconds.getSeconds());
    }
}