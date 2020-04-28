package object.chapter08.movie.pricing;

import object.chapter08.money.Money;
import object.chapter08.movie.DiscountCondition;
import object.chapter08.movie.DiscountPolicy;
import object.chapter08.movie.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}