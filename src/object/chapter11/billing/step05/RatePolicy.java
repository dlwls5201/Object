package object.chapter11.billing.step05;

import object.chapter11.money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}