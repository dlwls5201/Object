package object.chapter14.fee;

import object.chapter14.fee.addition.TaxablePolicy;
import object.chapter14.fee.base.FixedFeePolicy;
import object.chapter14.money.Money;

import java.time.Duration;
import java.time.LocalDateTime;

public class Client {

    public static void main(String[] args) {

        RatePolicy fixedFeePolicy = new FixedFeePolicy(Money.wons(10), Duration.ofSeconds(2));

        //Phone phone = new Phone(fixedFeePolicy);
        Phone phone = new Phone(
                new TaxablePolicy(0.1f, fixedFeePolicy)
        );

        phone.addCall(
                new Call(
                        LocalDateTime.of(2020, 5, 10, 3, 30, 30),
                        LocalDateTime.of(2020, 5, 10, 3, 30, 40)
                )
        );

        Money result = phone.calculateFee();
        System.out.println("result : " + result);
    }
}
