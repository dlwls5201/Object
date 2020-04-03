package object.chapter05.condition;

import object.chapter05.Screening;

public class SequenceCondition implements DiscountCondition {
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
