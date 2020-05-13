package object.chapter11.billing.step06;

import object.chapter11.money.Money;

public interface Calculator {
    Money calcCallFee(MyCall myCall);
}