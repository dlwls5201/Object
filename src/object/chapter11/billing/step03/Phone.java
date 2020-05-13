package object.chapter11.billing.step03;

import object.chapter11.money.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private List<Call> calls = new ArrayList<>();

    public final void addCall(Call call) {
        calls.add(call);
    }

    public final Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }

        return afterCalculated(result);
    }

    protected abstract Money calculateCallFee(Call call);

    protected abstract Money afterCalculated(Money fee);
}