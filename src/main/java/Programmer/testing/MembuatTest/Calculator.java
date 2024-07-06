package Programmer.testing.MembuatTest;

import java.util.function.BiFunction;

public class Calculator {

    private static final BiFunction<Integer, Integer, Integer> divide = (first, second) -> {
        if (second == 0) {
            throw new IllegalArgumentException("Can not divide by zero");
        }
        return first / second;
    };

    private static final BiFunction<Integer, Integer, Integer> add = (first, second) -> {
        long result = (long) first + second;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Integer overflow");
        }
        return (int) result;
    };

    public Integer divide(Integer first, Integer second) {
        if (second == 0) {
            throw new IllegalArgumentException("Can not divide by zero");
        }
        return divide.apply(first, second);
    }

    public Integer add(Integer first, Integer second) {
        long result = (long) first + second;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Integer overflow");
        }
        return (int) result;
    }
}