package object.chapter11.billing.step06;

import object.chapter11.money.Money;

import java.util.ArrayList;
import java.util.List;

//final class 로 안해도 된다.
//좋은 확장 원칙을 모두 지키고 있다.
public class Plan {
    //전략 객체 calc
    private Calculator calc;
    private List<MyCall> myCalls = new ArrayList<>();

    public final void addCall(MyCall myCall) {
        myCalls.add(myCall);
    }

    public final void setCalculator(Calculator calc) {
        this.calc = calc;
    }

    public final Money calculateFee() {
        Money result = Money.ZERO;
        //calc.calcCallFee(call) -> 포워딩 : 합성한 객체에게 일부의 책임을 요청하지만 컨텍스트의 공유가 없는 경우
        for (MyCall myCall : myCalls) result = result.plus(calc.calcCallFee(myCall));
        return result;
    }
}