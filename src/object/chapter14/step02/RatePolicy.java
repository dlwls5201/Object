package object.chapter14.step02;

import object.chapter14.money.Money;
import object.chapter14.step02.model.Phone;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}