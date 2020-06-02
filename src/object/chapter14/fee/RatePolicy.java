package object.chapter14.fee;


import object.chapter14.money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}