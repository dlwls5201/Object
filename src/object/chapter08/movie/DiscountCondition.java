package object.chapter08.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}