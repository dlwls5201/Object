package object.chapter11.billing.step05;

import object.chapter11.money.Money;

public abstract class BasicRatePolicy implements RatePolicy {
    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;

        for (Call call : phone.getCalls()) {
            Money money = calculateCallFee(call);
            result = result.plus(money);
        }

        return result;
    }

    protected abstract Money calculateCallFee(Call call);
}