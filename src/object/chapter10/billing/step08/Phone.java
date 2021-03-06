package object.chapter10.billing.step08;

import object.chapter10.money.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private double taxRate;
    private List<Call> calls = new ArrayList<>();

    //인자가 있는 생성자는 부모에서 사용하면 안된다.
    public Phone(double taxRate) {
        this.taxRate = taxRate;
    }

    //생성자가 아닌 setter로 받는게 좋은 방법일까?
    //우리는 3가지 의존성 주입방법을 알고 있다.
    // 1. 생성자 주입
    // 2. setter 주입
    // 3. 메서드 주입
    public void addCall(Call call) {
        this.calls.add(call);
    }

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }

        return result.plus(result.times(taxRate));
    }

    //템플릿 메소드 패턴
    //헐리우드 원칙 : 먼저 연락하지 마세요. 저희가 먼저 연락 드리겟습니다.
    protected abstract Money calculateCallFee(Call call);
}