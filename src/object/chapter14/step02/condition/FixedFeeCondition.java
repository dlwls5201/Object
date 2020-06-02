package object.chapter14.step02.condition;

import object.chapter14.step02.FeeCondition;
import object.chapter14.step02.model.Call;
import object.chapter14.time.DateTimeInterval;

import java.util.Arrays;
import java.util.List;

public class FixedFeeCondition implements FeeCondition {
    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return Arrays.asList(call.getInterval());
    }
}