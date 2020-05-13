package object.chapter10.billing.step06;

import object.chapter10.money.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPhone {
    private List<Call> calls = new ArrayList<>();

    public void addCall(Call call) {
        this.calls.add(call);
    }

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }

        return result;
    }

    //부모 -> 자식 의존의 방향이 자식 -> 부모로 바뀌게 된다.
    //즉 책임은 부모가 가지고 작은 기능만 자식이 구현한다.
    //템플릿 메소드 패턴으로 calculateCallFee를 훅이라고 한다.
    abstract protected Money calculateCallFee(Call call);
}