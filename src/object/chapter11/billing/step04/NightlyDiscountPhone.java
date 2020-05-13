
package object.chapter11.billing.step04;

import object.chapter11.money.Money;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone {
    private static final int LATE_NIGHT_HOUR = 22;

    private final Money nightlyAmount;
    private final Money regularAmount;
    private final Duration seconds;

    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    //override protected 인지 확인하자
    @Override
    protected Money calculateCallFee(Call call) {
        Money price = call.getFrom().getHour() >= LATE_NIGHT_HOUR ? nightlyAmount : regularAmount;
        return price.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}