package object.chapter11.billing.step04;

import object.chapter11.money.Money;

import java.time.Duration;

public class RegularPhone extends Phone {
    private final Money amount;
    private final Duration seconds;

    public RegularPhone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    //override protected 인지 확인하자
    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}