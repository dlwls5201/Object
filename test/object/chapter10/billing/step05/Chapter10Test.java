package object.chapter10.billing.step05;

import object.chapter10.billing.step05.instrumented.InstrumentedHashSet;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Chapter10Test {

    @Test
    public void instrumentedHashSet() {
        InstrumentedHashSet<String> language = new InstrumentedHashSet<>();
        language.addAll(Arrays.asList("Java", "Ruby", "Scala"));
        assertEquals(3, language.getAddCount());
    }
}