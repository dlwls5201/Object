package object.chapter02.data;

import object.chapter02.*;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class MovieData {

    public Movie getAvater() {
        return new Movie(
                "아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(
                        Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))
                )
        );
    }

    public Movie getTitanic() {
        return new Movie(
                "타이타닉",
                Duration.ofMinutes(180),
                Money.wons(11000),
                new PercentDiscountPolicy(
                        0.1,
                        new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                        new SequenceCondition(2),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59))
                )
        );
    }

    public Movie getStarWars() {
        return new Movie(
                "스타워",
                Duration.ofMinutes(210),
                Money.wons(10000),
                new NoneDiscountPolicy()
        );
    }
}
