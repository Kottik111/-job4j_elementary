package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when03to21then2Dot828() {
        double expected = 2.828;
        int x1 = 0;
        int y1 = 3;
        int x2 = 2;
        int y2 = 1;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenMinus20To0Minus2then2Dot828() {
        double expected = 2.828;
        int x1 = -2;
        int y1 = 0;
        int x2 = 0;
        int y2 = -2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when200to153then5Dot830() {
        double expected = 5.830;
        int x1 = 20;
        int y1 = 0;
        int x2 = 15;
        int y2 = 3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
