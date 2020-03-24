package object.chapter02.after;

import object.chapter02.Money;
import object.chapter02.Screening;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
