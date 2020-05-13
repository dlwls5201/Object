package object.chapter11.billing.step05;

import object.chapter11.money.Money;

import java.time.Duration;

public class NightlyDiscountPolicy extends BasicRatePolicy {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;

    public NightlyDiscountPolicy(Money nightlyAmount, Money regularAmount, Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        Money fee = call.getFrom().getHour() >= LATE_NIGHT_HOUR ? nightlyAmount : regularAmount;
        return fee.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}