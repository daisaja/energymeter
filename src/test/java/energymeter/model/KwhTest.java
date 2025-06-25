package energymeter.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KwhTest {

    @Test
    void value_is_retrieved_as_rounded_to_one_digit_after_the_comma() {
        Kwh kwh = new Kwh(123.456f);
        assertEquals(123.5f, kwh.value(), 0.001);

        Kwh kwhZero = new Kwh(0f);
        assertEquals(0.0f, kwhZero.value(), 0.001);

        Kwh kwhNegative = new Kwh(-123.456f);
        assertEquals(-123.5f, kwhNegative.value(), 0.001);
    }

    @Test
    void ensure_empty_initialization_does_throw_assertion_error() {
        assertThrows(NullPointerException.class, () -> new Kwh(null));
    }
}