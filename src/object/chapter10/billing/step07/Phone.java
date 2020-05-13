package object.chapter10.billing.step07;

import object.chapter10.money.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
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

    //자식 -> 부모 의존의 방향이 부모 -> 자식로 바뀌게 된다.
    //즉 책임은 부모가 가지고 작은 기능만 자식이 구현한다.
    //템플릿 메소드 패턴으로 calculateCallFee를 훅이라고 한다.

    //템플릿 메소드 패턴
    //헐리우드 원칙 : 먼저 연락하지 마세요. 저희가 먼저 연락 드리겟습니다.
    abstract protected Money calculateCallFee(Call call);
}