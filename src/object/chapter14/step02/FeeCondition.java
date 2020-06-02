package object.chapter14.step02;

import object.chapter14.step02.model.Call;
import object.chapter14.time.DateTimeInterval;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}