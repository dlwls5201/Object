package object.chapter11.billing.step04.txaandrate;

import object.chapter11.billing.step04.tax.TaxableNightlyDiscountPhone;
import object.chapter11.money.Money;

import java.time.Duration;

public class TaxableAndDiscountableNightlyDiscountPhone extends TaxableNightlyDiscountPhone {
    private Money discountAmount;

    public TaxableAndDiscountableNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds,
                                                      double taxRate, Money discountAmount) {
        super(nightlyAmount, regularAmount, seconds, taxRate);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).minus(discountAmount);
    }
}