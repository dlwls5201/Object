package object.chapter08.movie.pricing;

import object.chapter08.money.Money;
import object.chapter08.movie.DiscountPolicy;
import object.chapter08.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}