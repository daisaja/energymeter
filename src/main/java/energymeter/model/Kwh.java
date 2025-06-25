package energymeter.model;

import java.util.Objects;

import static java.lang.Math.*;

public record Kwh (Float value) {
    /**
     * Creates a new Kwh instance with the given value, rounded to one decimal place.
     *
     * @param value the value in kilowatt-hours, must not be null
     * @throws NullPointerException if value is null
     */
    public Kwh(Float value) {
        Objects.requireNonNull(value);
        this.value = round(value * 10.0f) / 10.0f;
    }
}
