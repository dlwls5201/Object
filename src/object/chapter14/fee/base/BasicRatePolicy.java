package object.chapter14.fee.base;

import object.chapter14.fee.Call;
import object.chapter14.fee.Phone;
import object.chapter14.fee.RatePolicy;
import object.chapter14.money.Money;

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