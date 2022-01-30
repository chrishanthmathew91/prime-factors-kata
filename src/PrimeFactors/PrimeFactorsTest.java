package PrimeFactors;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PrimeFactorsTest {

    @Test
    public void factorsOf1ReturnsEmptyList() {
        assertThat(PrimeFactors.factorsOf(1), is(List.of()));
    }

    @Test
    public void factorsOfPrimeNumberReturnsListOfItself() {
        assertThat(PrimeFactors.factorsOf(2), is(List.of(2)));
        assertThat(PrimeFactors.factorsOf(3), is(List.of(3)));
        assertThat(PrimeFactors.factorsOf(5), is(List.of(5)));
        assertThat(PrimeFactors.factorsOf(7), is(List.of(7)));
        assertThat(PrimeFactors.factorsOf(11), is(List.of(11)));
    }

    @Test
    public void factorsOfNumberReturnsListOfPrimeFactors() {
        assertThat(PrimeFactors.factorsOf(4), is(List.of(2, 2)));
        assertThat(PrimeFactors.factorsOf(6), is(List.of(2, 3)));
        assertThat(PrimeFactors.factorsOf(8), is(List.of(2, 2, 2)));
        assertThat(PrimeFactors.factorsOf(9), is(List.of(3, 3)));
        assertThat(PrimeFactors.factorsOf(10), is(List.of(2, 5)));
        assertThat(PrimeFactors.factorsOf(2*3*5*11*13*7), is(List.of(2, 3, 5, 7, 11, 13)));
    }
}