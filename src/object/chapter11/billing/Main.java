package object.chapter11.billing;

import object.chapter11.billing.step05.*;
import object.chapter11.billing.step06.MyCall;
import object.chapter11.billing.step06.Plan;
import object.chapter11.billing.step06.RegularPlan;
import object.chapter11.money.Money;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        //step05();
        step06();
    }

    private static void step05() {
        Phone phone = new Phone(new RegularPolicy(Money.wons(10), Duration.ofSeconds(10)));
        phone.addCall(
                new Call(
                        LocalDateTime.of(2020, 5, 10, 3, 30, 30),
                        LocalDateTime.of(2020, 5, 10, 3, 30, 40)
                )
        );
        Money result = phone.calculateFee();
        System.out.println("result : " + result);


        Phone phone2 = new Phone(
                new TaxablePolicy(0.05,
                        new RegularPolicy(Money.wons(10), Duration.ofSeconds(10))
                )
        );
        phone2.addCall(
                new Call(
                        LocalDateTime.of(2020, 5, 10, 3, 30, 30),
                        LocalDateTime.of(2020, 5, 10, 3, 30, 40)
                )
        );
        Money result2 = phone2.calculateFee();
        System.out.println("result2 : " + result2);

        Phone phone3 = new Phone(
                new TaxablePolicy(0.05,
                        new RateDiscountablePolicy(Money.wons(5),
                                new RegularPolicy(Money.wons(10), Duration.ofSeconds(10))
                        )
                )
        );
        phone3.addCall(
                new Call(
                        LocalDateTime.of(2020, 5, 10, 3, 30, 30),
                        LocalDateTime.of(2020, 5, 10, 3, 30, 40)
                )
        );
        Money result3 = phone3.calculateFee();
        System.out.println("result3 : " + result3);
    }

    private static void step06() {
        Plan plan = new Plan();
        plan.addCall(
                new MyCall(
                        LocalDateTime.of(2020, 5, 10, 3, 30, 30),
                        LocalDateTime.of(2020, 5, 10, 3, 30, 40)
                )
        );
        plan.setCalculator(new RegularPlan(Money.wons(10), Duration.ofSeconds(10)));
        Money result = plan.calculateFee();
        System.out.println("result : " + result);
    }
}
