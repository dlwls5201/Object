package object.chapter11;

import object.chapter11.instrumented.InstrumentedHashSet;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class Chapter11Test {

    @Test
    public void instrumentedHashSet() {
        InstrumentedHashSet<String> language = new InstrumentedHashSet<>(new HashSet<>());
        language.addAll(Arrays.asList("Java", "Ruby", "Scala"));
        assertEquals(3, language.getAddCount());
    }
}