package object.chapter08.movie.pricing;

import object.chapter08.money.Money;
import object.chapter08.movie.DiscountCondition;
import object.chapter08.movie.DiscountPolicy;
import object.chapter08.movie.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}