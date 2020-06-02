package object.chapter14.step02;

import object.chapter14.money.Money;
import object.chapter14.step02.model.Call;

public class FeeRule {
    private FeeCondition feeCondition; // 적용 조건
    private FeePerDuration feePerDuration; // 단위 요금

    public FeeRule(FeeCondition feeCondition, FeePerDuration feePerDuration) {
        this.feeCondition = feeCondition;
        this.feePerDuration = feePerDuration;
    }

    public Money calculateFee(Call call) {
        return feeCondition.findTimeIntervals(call)
                .stream()
                .map(each -> feePerDuration.calculate(each))
                .reduce(Money.ZERO, (first, second) -> first.plus(second));
    }
}