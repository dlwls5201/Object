package object.chapter05.condition;

import object.chapter05.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
