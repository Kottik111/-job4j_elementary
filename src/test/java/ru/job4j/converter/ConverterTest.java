package ru.job4j.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert120RblThen2Dollar() {
        float input = 120;
        float expected = 2;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void henConvert200RblThen3dot3333Dollar() {
        float input = 200;
        float expected = 3.33f;
        float output = Converter.rubleToDollar(input);
        float value = 0.01f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert0RblThen0Dollar() {
        float input = 0;
        float expected = 0;
        float output = Converter.rubleToDollar(input);
        float value = 0.01f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void henConvert200RblThen2dot857Euro() {
        float input = 200;
        float expected = 2.857f;
        float output = Converter.rubleToEuro(input);
        float value = 0.001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert0RblThen0Euro() {
        float input = 0;
        float expected = 0;
        float output = Converter.rubleToEuro(input);
        float value = 0.01f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

}